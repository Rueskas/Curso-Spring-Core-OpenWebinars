package com.iessanvicente.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		PeliculaService peliculaService = appContext.getBean(PeliculaService.class);
		peliculaService.peliculasPorGenero("Fantasia").forEach(System.out::println);
		((AnnotationConfigApplicationContext) appContext).close();
	}
}
