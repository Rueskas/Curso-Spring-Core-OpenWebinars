package com.iessanvicente.javaconfig;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("catalogoClasicas")
public class CatalogoPeliculasClasicas implements CatalogoPeliculas {
	public List<Pelicula> peliculas = new ArrayList<>();

	@PostConstruct
	public void init() throws Exception{
		peliculas.add(new Pelicula("Sleepy Hollow", "Terror"));
		peliculas.add(new Pelicula("Harry Potter", "Fantasia"));
		peliculas.add(new Pelicula("Star Wars", "Ciencia Ficcion"));
	}
	@Override
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

}
