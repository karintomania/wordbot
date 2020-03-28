package com.example.wordbot;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WordServiceTests {
	@Autowired
	WordService ws;
	@Test
	void getRandomWordTest() {
		String word = ws.getRandomWord();

		assertNotNull(word);
	}

}
