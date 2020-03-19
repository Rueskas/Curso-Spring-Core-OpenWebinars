package com.iessanvicente.annotations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Required;

public class PeliculaService {
	private PeliculaDAO peliculaDao;
	
	@Required
	public void setPeliculaDao(PeliculaDAO peliculaDao) {
		this.peliculaDao = peliculaDao;
	}
	
	public List<Pelicula> peliculasPorGenero(String genero){
		return peliculaDao.findAll()
				.stream()
				.filter(p -> p.getGenero().equalsIgnoreCase(genero))
				.collect(Collectors.toCollection(ArrayList::new));
	}
}
