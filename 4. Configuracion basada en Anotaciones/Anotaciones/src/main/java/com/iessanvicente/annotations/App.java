package com.iessanvicente.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		PeliculaService peliculaService = appContext.getBean(PeliculaService.class);
		peliculaService.peliculasPorGenero("Fantasia").forEach(System.out::println);
		((ClassPathXmlApplicationContext) appContext).close();
	}
}
