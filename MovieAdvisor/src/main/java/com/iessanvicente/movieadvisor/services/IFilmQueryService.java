package com.iessanvicente.movieadvisor.services;

import java.util.List;


import com.iessanvicente.movieadvisor.model.Film;

public interface IFilmQueryService {
	public List<Film> exec();
	
	public IFilmQueryService anyGenres(String... genres);

	public IFilmQueryService allGenres(String... genres);

	public IFilmQueryService year(int year);
	
	public IFilmQueryService betweenYear(int from, int to);
	
	public IFilmQueryService titleContains(String title) ;
}
