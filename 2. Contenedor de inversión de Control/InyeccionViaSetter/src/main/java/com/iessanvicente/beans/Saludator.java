package com.iessanvicente.beans;

public class Saludator {
	private String mensaje;
	
	public String getMensaje() {
		return mensaje == null? "Hello World!" : mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
