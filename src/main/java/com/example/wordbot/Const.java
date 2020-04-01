package com.example.wordbot;

import java.util.Arrays;
import java.util.List;

public class Const {
	public static final String LINE_SEP = System.lineSeparator();

	public static class Quiz{

		public static final int OPTION_NUM = 4;
		public static final int QUESTION_NUM = 5;
		public static final String DICTIONARY_URL = "https://dictionary.cambridge.org/dictionary/english/";
		public static final List<String> BOTTUN_COLORS = Arrays.asList(
																new String[]{
																	"#F8333C",
																	"#17C950",
																	"#2B9EB3",
																	"#FCAB10"});
	}
}