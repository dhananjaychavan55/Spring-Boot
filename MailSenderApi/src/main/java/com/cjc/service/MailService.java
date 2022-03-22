package com.cjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class MailService {

	@Autowired
	private JavaMailSender sender;
	
	public void sendMail(String to,String sub,String text) {
		SimpleMailMessage massage=new SimpleMailMessage();
		massage.setFrom("dchavan5599@gmail.com");
		massage.setTo(to);
		massage.setSubject(sub);
		massage.setText(text);
		sender.send(massage);
		System.out.println("Mail send Successfull");
	}
}
