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
	
	
	public static Map<String, QuizStatus> quizUserMap = new HashMap<String, QuizStatus>();

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
		if(!quizUserMap.containsKey(userId)){
			qs = new QuizStatus();
			quizUserMap.put(userId, qs);
		}else{
			qs = quizUserMap.get(userId);
		}

		// TODO: バリデーション入れる


		final int currentQuestionNum = qs.getCurrentQuestionNum();
		if(currentQuestionNum == 0){

			// 生成したクイズリストを元に、QuizMessage生成
			QuizWordList qwl = ws.getQuizWordList();
			qs.setLastQuizWordList(qwl);
			replyMessge = new QuizMessageSupplier().getQuizMessage(qwl);

			qs.setCurrentQuestionNum(qs.getCurrentQuestionNum() + 1);
		}else if(currentQuestionNum < Const.Quiz.QUESTION_NUM){
			// 答え合わせ
			checkAnswer(messageText, qs);

			// 生成したクイズリストを元に、QuizMessage生成
			QuizWordList qwl = ws.getQuizWordList();
			qs.setLastQuizWordList(qwl);
			replyMessge = new QuizMessageSupplier().getQuizMessage(qwl);

			qs.setCurrentQuestionNum(qs.getCurrentQuestionNum() + 1);
		}else{
			// 答え合わせ
			checkAnswer(messageText, qs);

			// 問題数リセット
			qs.setCurrentQuestionNum(0);

			// レポート返信
			replyMessge = new ReportMessageSupplier().getReportMessage(qs.getReports());
		}

		reply(replyToken, singletonList(replyMessge));

	}

	private void checkAnswer(String answer, QuizStatus qs){

		Report report;

		QuizWordList qwl = qs.getLastQuizWordList();
		int answerOptionNum = qwl.getAnswerOptionNum();
		String answerWord = qwl.getAnswerWord().getWord();
		String answerDefinition = qwl.getAnswerWord().getDefinition();

		if(answer.equals(Integer.toString(answerOptionNum))){
			//　正解
			report = new Report(true,answerWord,answerOptionNum,answerDefinition,null,0,null);
		}else{
			// 不正解
			// TODO: 数字変換できないとき対応
			int userAnswerOptionNum = Integer.parseInt(answer);
			String userAnswerWord = qwl.getWords().get(userAnswerOptionNum).getWord();
			String userAnswerDefinition = qwl.getWords().get(userAnswerOptionNum).getDefinition();
			report = new Report(false,answerWord,answerOptionNum,answerDefinition,userAnswerWord,0,userAnswerDefinition);
		}

		qs.getReports().add(report);
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