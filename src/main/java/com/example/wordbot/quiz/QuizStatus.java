package com.example.wordbot.quiz;

import java.util.List;

import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Data
@SessionScope
public class QuizStatus{
	int currentQuestionNum;
	List<QuizWordList> lastQuizWordList;
}



