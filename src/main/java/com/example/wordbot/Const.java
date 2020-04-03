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

		public static final List<String> HERO_IMAGE_LIST = Arrays.asList(
																new String[]{
																	"mental_health_man.png",
																	"nayamu_boy2.png",
																	"tehepero3_business_ojisan.png",
																	"kaidan_obasan.png",
																	"businessman_dekiru_woman.png",
																	"kids_chuunibyou_girl.png"});

		public static final List<String> COMMENT_LIST = Arrays.asList(
																new String[]{
																	"......",
																	"Hmmm.",
																	"Not so bad.",
																	"Keep going.",
																	"Excellent!!",
																	"Genius!!"});
	}
}