package com.iessanvicente.javaconfig;

import java.util.List;

public interface PeliculaDAO {

	public Pelicula find(int index);
	public List<Pelicula> findAll();
	public void insert(Pelicula pelicula);
	public void update(int index, Pelicula pelicula);
	public void delete(int index);
	public void delete(Pelicula pelicula);
}
