package com.iessanvicente.annotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("catalogoActuales")
public class CatalogoPeliculasActuales implements CatalogoPeliculas{

	public List<Pelicula> peliculas = new ArrayList<>();
	private void init() throws Exception{
		peliculas.add(new Pelicula("Coco", "Fantasia"));
		peliculas.add(new Pelicula("El hombre invisible", "Terror"));
		peliculas.add(new Pelicula("Malasaña", "Terror"));
		peliculas.add(new Pelicula("Percy Jackson", "Fantasia"));
	}

	@Override
	public List<Pelicula> getPeliculas() {
		return peliculas;
	}
}
