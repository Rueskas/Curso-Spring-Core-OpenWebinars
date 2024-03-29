package com.iessanvicente.annotations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {
	@Autowired
	private PeliculaDAO peliculaDao;
	
	public void setPeliculaDao(PeliculaDAO peliculaDao) {
		this.peliculaDao = peliculaDao;
	}
	
	public List<Pelicula> peliculasPorGenero(String genero){
		return peliculaDao.findAll()
				.stream()
				.filter(p -> p.getGenero().equalsIgnoreCase(genero))
				.collect(Collectors.toCollection(ArrayList::new));
	}
	
	public List<Pelicula> findAll() {
		return peliculaDao.findAll();
	}
}
