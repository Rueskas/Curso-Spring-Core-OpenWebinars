package com.iessanvicente.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		IEmailService emailService1 = null;
		emailService1 = appContext.getBean(IEmailService.class);
		emailService1.setDestinatarioPorDefecto("Sergio@Sergio.com");
		
		IEmailService emailService2 = null;
		emailService2 = appContext.getBean(IEmailService.class);

		emailService1.enviarEmail();
		System.out.println("-----------");
		emailService2.enviarEmail();
		
		((ClassPathXmlApplicationContext) appContext).close();
	}
}
