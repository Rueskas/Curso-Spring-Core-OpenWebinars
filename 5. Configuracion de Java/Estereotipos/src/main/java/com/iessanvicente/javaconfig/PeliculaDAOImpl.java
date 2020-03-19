package com.iessanvicente.javaconfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PeliculaDAOImpl implements PeliculaDAO {

	List<Pelicula> peliculas = new ArrayList<>();
	
	@Autowired
	private Set<CatalogoPeliculas> catalogoPeliculas;
	
	@PostConstruct
	public void init() throws Exception{
		for(CatalogoPeliculas c : catalogoPeliculas) {
			peliculas.addAll(c.getPeliculas());
		}
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
