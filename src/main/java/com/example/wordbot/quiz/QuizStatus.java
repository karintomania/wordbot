package com.example.wordbot.quiz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

@Data
@Component
public class QuizStatus{
	int currentQuestionNum;
	List<QuizWordList> quizWordLists;

	public QuizStatus(){
		this.currentQuestionNum = 0;
		this.quizWordLists = new ArrayList<QuizWordList>();
	}

	public void resetInstance(){
		this.currentQuestionNum = 0;
		this.quizWordLists = new ArrayList<QuizWordList>();
	}
}



