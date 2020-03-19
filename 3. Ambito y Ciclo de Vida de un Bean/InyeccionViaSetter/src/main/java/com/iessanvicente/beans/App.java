package com.iessanvicente.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Saludator saludator = null;
		//1. getBean con ID y casting
		//saludator = (Saludator) appContext.getBean("saludator");
		
		//2. getBean con ID y Class
		//saludator = appContext.getBean("saludator", Saludator.class);
		
		//3. getBean con Class ( Causa excepción si esta repetido )
		saludator = appContext.getBean(Saludator.class);

		System.out.println(saludator.getMensaje());

		IEmailService emailService1 = null;
		IEmailService emailService2 = null;
		emailService1 = appContext.getBean(IEmailService.class);
		emailService2 = appContext.getBean(IEmailService.class);
		
		System.out.println(emailService1);
		System.out.println(emailService2);
		
		((ClassPathXmlApplicationContext) appContext).close();
	}
}
