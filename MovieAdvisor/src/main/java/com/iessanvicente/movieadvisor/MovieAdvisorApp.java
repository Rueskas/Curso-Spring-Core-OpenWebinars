package com.iessanvicente.movieadvisor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.iessanvicente.movieadvisor.config.AppConfig;

public class MovieAdvisorApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MovieAdvisorRunApp runApp = appContext.getBean(MovieAdvisorRunApp.class);
		
		runApp.Run(args);
		
		((AnnotationConfigApplicationContext) appContext).close();

	}

}
