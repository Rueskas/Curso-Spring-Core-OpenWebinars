package com.iessanvicente.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Saludator {

	//@Value("Hola mundo!")
	@Value("${mensaje}")
	private String mensaje;
	
	public String saludar() {
		return mensaje;
	}
}
