package com.example.wordbot.supplier;

import static java.util.Arrays.asList;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.example.wordbot.Const;
import com.example.wordbot.quiz.QuizWordList;
import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.action.URIAction;
import com.linecorp.bot.model.action.URIAction.AltUri;
import com.linecorp.bot.model.message.FlexMessage;
import com.linecorp.bot.model.message.flex.component.Box;
import com.linecorp.bot.model.message.flex.component.Button;
import com.linecorp.bot.model.message.flex.component.Button.ButtonHeight;
import com.linecorp.bot.model.message.flex.component.Button.ButtonStyle;
import com.linecorp.bot.model.message.flex.component.FlexComponent;
import com.linecorp.bot.model.message.flex.component.Icon;
import com.linecorp.bot.model.message.flex.component.Image;
import com.linecorp.bot.model.message.flex.component.Separator;
import com.linecorp.bot.model.message.flex.component.Image.ImageAspectMode;
import com.linecorp.bot.model.message.flex.component.Image.ImageAspectRatio;
import com.linecorp.bot.model.message.flex.component.Image.ImageSize;
import com.linecorp.bot.model.message.flex.component.Spacer;
import com.linecorp.bot.model.message.flex.component.Text;
import com.linecorp.bot.model.message.flex.component.Text.TextWeight;
import com.linecorp.bot.model.message.flex.container.Bubble;
import com.linecorp.bot.model.message.flex.unit.FlexFontSize;
import com.linecorp.bot.model.message.flex.unit.FlexLayout;
import com.linecorp.bot.model.message.flex.unit.FlexMarginSize;
import com.linecorp.bot.model.message.flex.unit.FlexOffsetSize;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

		int totalQuestionCount = qwls.size();
		int correctAnswerCount = countCorrectAnswer(qwls);	
		// ex) Result 3/5
		String resultStr = "Result " + Integer.toString(correctAnswerCount) + "/" + Integer.toString(totalQuestionCount);
		// title
        final Text title =
                Text.builder()
                    .text(resultStr)
                    .weight(TextWeight.BOLD)
                    .size(FlexFontSize.XL)
					.build();
		components.add(title);

		int i = 0;

		for(QuizWordList qwl : qwls){

			// Box of each quiz
			Box quizBox = createQuizBox(qwl, i);
			components.add(quizBox);

			i++;
		}

        return Box.builder()
				  .layout(FlexLayout.VERTICAL)
				  .spacing(FlexMarginSize.SM)
                  .contents(components)
                  .build();
	}
	
	// count correct answer from quiz word lists
	private int countCorrectAnswer(List<QuizWordList> qwls){
		return qwls.stream()
				.reduce(0,
				(count, qwl) -> {
					boolean isCorrectAnswer = qwl.getAnswerOptionNum()==qwl.getUserOptionNum();
					return count + (isCorrectAnswer ? 1 : 0);
				}, Integer::sum);
	}


    private Box createFooterBlock() {
        final Button callAction = Button
                .builder()
                .style(ButtonStyle.PRIMARY)
                .height(ButtonHeight.SMALL)
                .action(new MessageAction("One More Try", "One More"))
                .build();

				
        return Box.builder()
                  .layout(FlexLayout.VERTICAL)
                  .spacing(FlexMarginSize.SM)
                  .contents(asList(callAction))
                  .build();
	}

	private Box createQuizBox(QuizWordList qwl, int questionNum){

		List<FlexComponent> quizComponents = new ArrayList<FlexComponent>();
		String answerWord = qwl.getAnswerWord().getWord();
		String answerDef = qwl.getAnswerWord().getDefinition();
		String userWord = qwl.getUserWord().getWord();
		String userDef = qwl.getUserWord().getDefinition();
		boolean isCorrect = qwl.getAnswerOptionNum() == qwl.getUserOptionNum();

		// Q1 Correct! or Wrong...
		String quizTitleStr = "Q" + Integer.toString(questionNum + 1) + (isCorrect ? " Correct!" : " Wrong...");
		Text quizTitle = Text.builder()
							.text(quizTitleStr)
							.weight(TextWeight.BOLD)
							.margin(FlexMarginSize.XL)
							.size(FlexFontSize.XL)
							.build();

		quizComponents.add(quizTitle);
		// Correct word box
		Box correctWordBox = createWordBox(true, answerWord, answerDef);
		quizComponents.add(correctWordBox);
		
		// Wrong word
		if(!isCorrect){
			Box wrongWordBox = createWordBox(false, userWord, userDef);
			quizComponents.add(wrongWordBox);
		}

		// Separater
		Separator separator= Separator.builder().margin(FlexMarginSize.XL).color("#999999").build();
		quizComponents.add(separator);

		// Spacer
		Spacer spacer = Spacer.builder().size(FlexMarginSize.XL).build();
		quizComponents.add(spacer);


		Box quizBox = Box.builder()
								.layout(FlexLayout.VERTICAL)
								.spacing(FlexMarginSize.SM)
								.contents(quizComponents)
								.build();
		
		return quizBox;

	}

	private Box createWordBox(boolean isCorrect, String word, String definition){

		// icon and word box
			// tick icon
			URI imageUrl = createUri(isCorrect? "tick.png" : "cross.png");
			Icon icon = Icon.builder()
									.size(FlexFontSize.Md)
									.url(imageUrl.toString())
									.build();
			// word
			Text wordText = Text.builder()
									.text(word)
									.offsetStart(FlexOffsetSize.MD)
									.flex(2)
									.weight(TextWeight.BOLD)
									.size(FlexFontSize.LG)
									.build();

		Box iconWordBox = Box.builder()
								.layout(FlexLayout.BASELINE)
								.margin(FlexMarginSize.XL)
								.contents(asList(icon, wordText))
								.build();
		// definition and btn
			// meaning
			Text definitionText = Text.builder()
									.text(definition)
									.flex(4)
									.wrap(true)
									.weight(TextWeight.BOLD)
									.size(FlexFontSize.SM)
									.build();

			// more btn
			String moreUrl = Const.Quiz.DICTIONARY_URL + word;
			Button btn = Button.builder()
									.flex(2)
									.style(ButtonStyle.LINK)
									.height(ButtonHeight.SMALL)
									.action(new URIAction("more", URI.create(moreUrl), null))
									.build();

		Box definitionBtnBox = Box.builder()
								.layout(FlexLayout.HORIZONTAL)
								.margin(FlexMarginSize.LG)
								.contents(asList(definitionText, btn))
								.build();

		Box wordBox = Box.builder()
								.layout(FlexLayout.VERTICAL)
								.margin(FlexMarginSize.SM)
								.contents(asList(iconWordBox, definitionBtnBox))
								.build();
		return wordBox;
	}

    private static URI createUri(String path) {
        return ServletUriComponentsBuilder.fromCurrentContextPath()
                                          .scheme("https")
                                          .path(path).build()
                                          .toUri();
    }

}
