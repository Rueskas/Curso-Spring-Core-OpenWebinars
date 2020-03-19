package com.iessanvicente.annotations;

import java.util.ArrayList;
import java.util.List;

public class CatalogoPeliculasClasicas implements CatalogoPeliculas {
	public List<Pelicula> peliculas = new ArrayList<>();

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
