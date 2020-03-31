package com.example.wordbot.quiz;


import java.util.List;

import com.example.wordbot.Word;

import lombok.Data;

@Data
public class QuizWordList{
	int answerOptionNum;
	int userOptionNum;
	List<Word> words;

	public Word getAnswerWord(){
		return this.words.get(this.answerOptionNum);
	}

	public Word getUserWord(){
		return this.words.get(this.userOptionNum);
	}
}



