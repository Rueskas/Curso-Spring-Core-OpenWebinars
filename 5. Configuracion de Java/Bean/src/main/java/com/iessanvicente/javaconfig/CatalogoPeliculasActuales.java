package com.iessanvicente.javaconfig;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("catalogoActuales")
public class CatalogoPeliculasActuales implements CatalogoPeliculas{

	public List<Pelicula> peliculas = new ArrayList<>();
	@PostConstruct
	private void init() throws Exception{
		peliculas.add(new Pelicula("Coco", "Fantasia"));
		peliculas.add(new Pelicula("El hombre invisible", "Terror"));
		peliculas.add(new Pelicula("Malasa�a", "Terror"));
		peliculas.add(new Pelicula("Percy Jackson", "Fantasia"));
	}

	@Override
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}
}
