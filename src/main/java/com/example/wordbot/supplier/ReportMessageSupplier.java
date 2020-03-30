package com.example.wordbot.supplier;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.example.wordbot.Const;
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

	
    public FlexMessage getReportMessage(List<Report> reports) {

        final Box bodyBlock = createBodyBlock(reports);
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
	


    private Box createBodyBlock(List<Report> reports) {
		List<FlexComponent> components = new ArrayList<FlexComponent>();
		Report tmpReport;
        final Text title =
                Text.builder()
                    .text("Result")
                    .weight(TextWeight.BOLD)
                    .size(FlexFontSize.XL)
					.build();
		components.add(title);

		for(int i = 0; i < reports.size(); i++){
			tmpReport = reports.get(i);

			
			final Text result;
			final Text answer;
			final String answerTxt;

			if(tmpReport.isCorrect()){
				result = Text.builder()
						.text("Q"+ Integer.toString(i) + ": " + tmpReport.getAnswerWord() + " Correct!")
						.weight(TextWeight.BOLD)
						.size(FlexFontSize.Md)
						.build();

				answerTxt = tmpReport.getAnswerWord() + "-" + tmpReport.getAnswerDefinition();

				answer =
						Text.builder()
							.text(answerTxt)
							.weight(TextWeight.BOLD)
							.size(FlexFontSize.SM)
							.build();

			}else{

				result =
						Text.builder()
							.text("Q"+ Integer.toString(i) + ": " + tmpReport.getAnswerWord() + " Wrong...")
							.weight(TextWeight.BOLD)
							.size(FlexFontSize.Md)
							.build();

				answerTxt = 
							tmpReport.getAnswerWord() + "-" + tmpReport.getAnswerDefinition() +
							Const.LINE_SEP +
							"Your Answer:" + tmpReport.getUserAnswerWord() +
							Const.LINE_SEP +
							tmpReport.getUserAnswerOptionNum() + "-" + tmpReport.getUserAnswerDefinition();

				answer =
						Text.builder()
							.text(answerTxt)
							.weight(TextWeight.BOLD)
							.size(FlexFontSize.SM)
							.build();

			}
			
			components.add(result);
			components.add(answer);

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
