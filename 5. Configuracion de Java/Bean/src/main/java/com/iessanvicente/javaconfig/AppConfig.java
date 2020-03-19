package com.iessanvicente.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Bean
	@Primary
	public CatalogoPeliculas catalogoActuales() {
		return new CatalogoPeliculasActuales();
	}
	
	@Bean
	public CatalogoPeliculas catalogoClasicas() {
		return new CatalogoPeliculasClasicas();
	}
	

	@Bean
	public PeliculaDAO peliculaDaoImpl() {
		return new PeliculaDAOImpl();
	}
	
	@Bean
	public PeliculaService peliculaService() {
		return new PeliculaService();
	}
}
