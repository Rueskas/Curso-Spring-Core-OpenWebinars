package com.iessanvicente.beans;

public class EmailService implements IEmailService {
	private Saludator saludator;
	private String destinatarioPorDefecto;
	
	public void setSaludator(Saludator saludator) {
		this.saludator = saludator;
	}
	
	public void setDestinatarioPorDefecto(String destinatario) {
		this.destinatarioPorDefecto = destinatario;
	}

	public void enviarEmail(String destinatario) {
		System.out.println("Enviando email a: " + destinatario);
		System.out.println("Mensaje: " + saludator.getMensaje());
	}
	
	public void enviarEmail() {
		System.out.println("Enviando email a: " + 
				destinatarioPorDefecto != null? 
						destinatarioPorDefecto : "Seleccione un destinatario por defecto");
		System.out.println("Mensaje: " + saludator.getMensaje());
	}
	
	
}
