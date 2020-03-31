package com.example.wordbot.supplier;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.example.wordbot.Const;
import com.example.wordbot.quiz.QuizWordList;
import com.example.wordbot.quiz.Report;
import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.flex.component.Box;
import com.linecorp.bot.model.message.flex.component.Button;
import com.linecorp.bot.model.message.flex.component.FlexComponent;
import com.linecorp.bot.model.message.flex.component.Button.ButtonHeight;
import com.linecorp.bot.model.message.flex.component.Button.ButtonStyle;
import com.linecorp.bot.model.message.flex.component.Text;
import com.linecorp.bot.model.message.flex.component.Text.TextWeight;
import com.linecorp.bot.model.message.flex.container.Bubble;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;
import com.linecorp.bot.model.message.flex.unit.FlexMarginSize;

public class ReportMessageSupplier implements Supplier<FlexMessage> {

	
    public FlexMessage getReportMessage(List<QuizWordList> qwls) {

        final Box bodyBlock = createBodyBlock(qwls);
        final Box footerBlock = createFooterBlock();
        final Bubble bubble =
                Bubble.builder()
                      .body(bodyBlock)
                      .footer(footerBlock)
                      .build();

        return new FlexMessage("ALT", bubble);
	}


    @Override
    public FlexMessage get() {
		return null;
	}
	


    private Box createBodyBlock(List<QuizWordList> qwls) {
		List<FlexComponent> components = new ArrayList<FlexComponent>();
		int i = 0;

		// title
        final Text title =
                Text.builder()
                    .text("Result")
                    .weight(TextWeight.BOLD)
                    .size(FlexFontSize.XL)
					.build();
		components.add(title);

		Text result;
		Text answer;
		String answerTxt;

		for(QuizWordList qwl : qwls){

			if(qwl.getAnswerOptionNum() == qwl.getUserOptionNum()){
				result = Text.builder()
						.text("Q"+ Integer.toString(i) + ": " + qwl.getAnswerWord().getWord() + " Correct!")
						.weight(TextWeight.BOLD)
						.size(FlexFontSize.Md)
						.build();

				answerTxt = qwl.getAnswerOptionNum() + "-" + qwl.getAnswerWord().getDefinition();

				answer =
						Text.builder()
							.text(answerTxt)
							.weight(TextWeight.BOLD)
							.wrap(true)
							.size(FlexFontSize.SM)
							.build();

			}else{

				result =
						Text.builder()
							.text("Q"+ Integer.toString(i) + ": " + qwl.getAnswerWord().getWord() + " Wrong...")
							.weight(TextWeight.BOLD)
							.size(FlexFontSize.Md)
							.build();

				answerTxt = 
							qwl.getAnswerOptionNum() + "-" + qwl.getAnswerWord().getDefinition() + Const.LINE_SEP +
							Const.LINE_SEP +
							"Your Answer:" + Const.LINE_SEP +
							qwl.getUserWord().getWord() + Const.LINE_SEP +
							qwl.getUserOptionNum() + "-" + qwl.getUserWord().getDefinition();
				System.out.println(answerTxt);
				answer =
						Text.builder()
							.text(answerTxt)
							.weight(TextWeight.BOLD)
							.wrap(true)
							.size(FlexFontSize.SM)
							.build();

			}
			
			components.add(result);
			components.add(answer);
			i++;
		}

        return Box.builder()
				  .layout(FlexLayout.VERTICAL)
				  .spacing(FlexMarginSize.SM)
                  .contents(components)
                  .build();
    }

    private Box createFooterBlock() {
        final Button callAction = Button
                .builder()
                .style(ButtonStyle.PRIMARY)
                .height(ButtonHeight.SMALL)
                .action(new MessageAction("One More Test", "quiz"))
                .build();

				
        return Box.builder()
                  .layout(FlexLayout.VERTICAL)
                  .spacing(FlexMarginSize.SM)
                  .contents(asList(callAction))
                  .build();
    }

}
