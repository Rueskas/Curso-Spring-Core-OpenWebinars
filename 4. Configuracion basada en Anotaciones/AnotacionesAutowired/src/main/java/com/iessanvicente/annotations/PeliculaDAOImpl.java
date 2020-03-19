package com.iessanvicente.annotations;

import java.util.ArrayList;
import java.util.List;

public class PeliculaDAOImpl implements PeliculaDAO {

	List<Pelicula> peliculas = new ArrayList<>();
	
	public void init() throws Exception{
		insert(new Pelicula("Harry Potter", "Fantasia"));
		insert(new Pelicula("Sleepy Hollow", "Terror"));
		insert(new Pelicula("Piratas del Caribe", "Aventuras"));
		insert(new Pelicula("Percy Jackson", "Fantasia"));
		
	}
	@Override
	public Pelicula find(int index) {
		return peliculas.get(index);

	}

	@Override
	public List<Pelicula> findAll() {
		return peliculas;
	}

	@Override
	public void insert(Pelicula pelicula) {
		peliculas.add(pelicula);
	}

	@Override
	public void update(int index, Pelicula pelicula) {
		peliculas.remove(index);
		peliculas.add(pelicula);
	}

	@Override
	public void delete(int index) {
		peliculas.remove(index);
	}

	@Override
	public void delete(Pelicula pelicula) {
		peliculas.remove(pelicula);
		
	}

}
