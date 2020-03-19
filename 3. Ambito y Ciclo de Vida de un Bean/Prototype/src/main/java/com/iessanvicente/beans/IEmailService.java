package com.iessanvicente.beans;

public interface IEmailService {
	public void enviarEmail();
	public void enviarEmail(String destinatario);
	public void setDestinatarioPorDefecto(String destinatario);
}
