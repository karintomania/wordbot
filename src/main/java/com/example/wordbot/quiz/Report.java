package com.example.wordbot.quiz;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Report{
	boolean isCorrect;
	String answerWord;
	int answerOptionNum;
	String answerDefinition;
	String userAnswerWord;
	int userAnswerOptionNum;
	String userAnswerDefinition;
}



