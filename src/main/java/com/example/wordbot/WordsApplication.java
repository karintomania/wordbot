package com.example.wordbot;

import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@LineMessageHandler
public class WordsApplication {

	@Autowired
	WordService ws;
	public static void main(String[] args) {
		SpringApplication.run(WordsApplication.class, args);
	}
    @EventMapping
    public Message handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
		// final String originalMessageText = event.getMessage().getText();
        return new TextMessage(ws.getRandomWord());
    }
}
