package com.iessanvicente.javaconfig;

public class Pelicula {
	private String titulo;
	private String genero;
	
	public Pelicula(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		return this.getTitulo() + " - " + this.getGenero();
	}
}
