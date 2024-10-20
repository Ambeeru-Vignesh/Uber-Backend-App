package com.vignesh.project.uber.uberApp;

import com.vignesh.project.uber.uberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {

	@Autowired
	private EmailSenderService emailSenderService;

	@Test
	void contextLoads() {
		emailSenderService.sendEmail("brownboy353535@gmail.com","MY FIRST MAIL","HEY THE EMAIL SENT SUCCESSFULLY");
	}

	@Test
	void sendEmailMultiple() {
		String[] emails = {
				"vilis40086@adosnan.com",
				"brownboy353535@gmail.com"
		};
		emailSenderService.sendEmail(emails,"MY FIRST MAIL","HEY THE EMAIL SENT SUCCESSFULLY");

	}

}
