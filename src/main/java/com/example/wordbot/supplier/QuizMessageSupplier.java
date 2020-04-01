package com.example.wordbot.supplier;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.example.wordbot.Const;
import com.example.wordbot.Word;
import com.example.wordbot.WordMapper;
import com.example.wordbot.quiz.QuizStatus;
import com.example.wordbot.quiz.QuizWordList;
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
import com.linecorp.bot.model.message.flex.unit.FlexOffsetSize;
import com.linecorp.bot.model.message.flex.unit.FlexPosition;

import org.springframework.beans.factory.annotation.Autowired;

public class QuizMessageSupplier implements Supplier<FlexMessage> {

	@Autowired
	WordMapper wm;


	public FlexMessage getQuizMessage(final QuizWordList qwl) {
		final Box bodyBlock = createBodyBlock(qwl);
		// final Box footerBlock = createFooterBlock(qwl.getWords());
		final Bubble bubble =
				Bubble.builder()
						.body(bodyBlock)
						// .footer(footerBlock)
						.build();

		return new FlexMessage("ALT", bubble);
	}


	@Override
    public FlexMessage get() {

		return null;
    }

    private Box createBodyBlock(QuizWordList qwl) {

		List<FlexComponent> quizComponents = new ArrayList<FlexComponent>();

		// word
        final Text questionWord =
                Text.builder()
                    .text(qwl.getAnswerWord().getWord())
                    .weight(TextWeight.BOLD)
                    .size(FlexFontSize.XL)
					.build();

		quizComponents.add(questionWord);

		

		// Definition btn box
		int i = 0;
		for(Word word : qwl.getWords()){
			Box defBtnBox = createDefBtnBox(i, word);

			quizComponents.add(defBtnBox);
			i++;
		}


        return Box.builder()
                  .layout(FlexLayout.VERTICAL)
                  .contents(quizComponents)
                  .build();
	}


    private Box createDefBtnBox(int optionNum, Word word) {
		
		Text def = Text.builder()
						.size(FlexFontSize.Md)
						.flex(5)
						.wrap(true)
						.text(word.getDefinition())
						.build();
		
		Button btn = Button.builder()
								.style(ButtonStyle.PRIMARY)
								.flex(1)
								.color(Const.Quiz.BOTTUN_COLORS.get(optionNum))
								.height(ButtonHeight.SMALL)
								.action(new MessageAction(Integer.toString(optionNum + 1), Integer.toString(optionNum + 1)))
								.build();

		Box defBtnBox = Box.builder()
						.layout(FlexLayout.HORIZONTAL)
						.margin(FlexMarginSize.LG)
						.contents(asList(def, btn))
						.build();

		return defBtnBox;
	}

    private Box createFooterBlock(List<Word> words) {
		List<FlexComponent> buttons = new ArrayList<FlexComponent>();

		for(int i = 0; i < words.size(); i++){
			// final String option = Integer.toString(i) + " : " + words.get(i).getDefinition();
			final String option = Integer.toString(i);
			final Button btn = Button
					.builder()
					.offsetStart(FlexOffsetSize.SM)
					.style(ButtonStyle.PRIMARY)
					.height(ButtonHeight.SMALL)
					.action(new MessageAction(option, Integer.toString(i)))
					.build();
			buttons.add(btn);

		}
        return Box.builder()
                  .layout(FlexLayout.VERTICAL)
                  .spacing(FlexMarginSize.SM)
                  .contents(buttons)
                  .build();
    }


}
