package com.example.wordbot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import static java.util.Collections.singletonList;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.wordbot.quiz.QuizStatus;
import com.example.wordbot.quiz.QuizWordList;
import com.example.wordbot.quiz.Report;
import com.example.wordbot.supplier.QuizMessageSupplier;
import com.example.wordbot.supplier.ReportMessageSupplier;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.ReplyMessage;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.response.BotApiResponse;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.NonNull;

@LineMessageHandler
public class WordController{
	
	private Map<String,QuizStatus> userQuizStatusMap = new HashMap<String, QuizStatus>();

    @Autowired
    private LineMessagingClient lineMessagingClient;

	@Autowired
	WordService ws;

    @EventMapping
    public void handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
		final String userId = event.getSource().getUserId();
		final String replyToken = event.getReplyToken();
		final FlexMessage replyMessge;
		final String messageText = event.getMessage().getText();


		// QuizStatusをMapから取得・格納
		final QuizStatus qs;
		// mapに存在しないUserだったら新規追加する
		if(!userQuizStatusMap.containsKey(userId)){
			qs = new QuizStatus();
			userQuizStatusMap.put(userId, qs);
		}else{
			qs = userQuizStatusMap.get(userId);
		}

		final int currentQuestionNum = qs.getCurrentQuestionNum();

		if(currentQuestionNum == 0){

			// リセット
			qs.resetInstance();
			
			// 生成したクイズリストを元に、QuizMessage生成
			QuizWordList qwl = ws.getQuizWordList();
			qs.getQuizWordLists().add(qwl);
			replyMessge = new QuizMessageSupplier().getQuizMessage(qwl);

			qs.setCurrentQuestionNum(qs.getCurrentQuestionNum() + 1);
		}else if(currentQuestionNum <= Const.Quiz.QUESTION_NUM){
			// 答え格納
			setUserAnswer(messageText, qs, currentQuestionNum -1);

			// 生成したクイズリストを元に、QuizMessage生成
			QuizWordList qwl = ws.getQuizWordList();
			qs.getQuizWordLists().add(qwl);
			replyMessge = new QuizMessageSupplier().getQuizMessage(qwl);

			qs.setCurrentQuestionNum(qs.getCurrentQuestionNum() + 1);
		}else{
			// 答え格納
			setUserAnswer(messageText, qs, currentQuestionNum -1);


			// レポート返信
			replyMessge = new ReportMessageSupplier().getReportMessage(qs.getQuizWordLists());


		}

		reply(replyToken, singletonList(replyMessge));

	}

	private void setUserAnswer(String answer, QuizStatus qs, int lastQuestionNum){
		int answerNum;
		try {
			answerNum = Integer.parseInt(answer);
		} catch (NumberFormatException nfe) {
			answerNum = 0;
		}
		qs.getQuizWordLists().get(lastQuestionNum).setUserOptionNum(answerNum);;

	}

    private void reply(@NonNull String replyToken,
                       @NonNull List<Message> messages) {
        try {
			lineMessagingClient
						.replyMessage(new ReplyMessage(replyToken, messages, false))
						.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}