package com.example.wordbot;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class WordService{

	@Autowired
	WordMapper wm;

	@GetMapping("/")
	public String getRandomWord(){
		Random random = new Random();
		int count = wm.countRecordNum();


		Word w = wm.findOneById(random.nextInt(count)+1);

		String result = String.format("%s - %s", w.word , w.definition);
		return result;
	}
}