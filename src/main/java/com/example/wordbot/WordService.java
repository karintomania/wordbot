package com.example.wordbot;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import com.example.wordbot.quiz.QuizWordList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class WordService{

	@Autowired
	WordMapper wm;

	private Random rnd = new Random();

	@GetMapping("/")
	public String getRandomWord(){
		int count = wm.countRecordNum();

		Word w = wm.findOneById(rnd.nextInt(count)+1);

		String result = String.format("%s - %s", w.word , w.definition);
		return result;
	}


	public QuizWordList getQuizWordList() {
		QuizWordList qwl = new QuizWordList();


		// 解答番号をset
		qwl.setAnswerOptionNum(rnd.nextInt(Const.Quiz.OPTION_NUM));

		// 重複なし乱数を生成
		HashSet<Integer> optionIds = new HashSet<Integer>();
		// Word全件数を取得
		int count = wm.countRecordNum();
		while(optionIds.size() < Const.Quiz.OPTION_NUM){
			optionIds.add(rnd.nextInt(count));
		}

		// 取得した乱数からWordを取得
		List<Word> words = optionIds.stream()
									.map(option -> wm.findOneById(option))
									.collect(Collectors.toList());

		qwl.setWords(words);

		return qwl;
	}
}