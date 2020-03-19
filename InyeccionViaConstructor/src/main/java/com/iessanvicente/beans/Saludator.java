package com.iessanvicente.beans;

public class Saludator {
	private String mensaje;
	
	public Saludator(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String getMensaje() {
		return mensaje == null? "Hello World" : mensaje;
	}
	
}
