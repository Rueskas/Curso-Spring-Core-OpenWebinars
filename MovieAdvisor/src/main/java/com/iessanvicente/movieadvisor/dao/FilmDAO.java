package com.iessanvicente.movieadvisor.dao;

import java.util.List;

import com.iessanvicente.movieadvisor.model.Film;

public interface FilmDAO{
	
	public Film findById(long id);
	public List<Film> findAll();
	public void insert(Film film);
	public void update(Film film);
	public void delete(long id);
}
