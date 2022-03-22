package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.service.MailService;

@SpringBootApplication
public class MailSenderApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MailSenderApiApplication.class, args);
		MailService service = context.getBean(MailService.class);
		service.sendMail("bhushanrpatil799@gmail.com", "Hello bhushan","Call Me");
	}

}
