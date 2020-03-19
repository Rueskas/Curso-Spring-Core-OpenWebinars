package com.iessanvicente.movieadvisor.services;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iessanvicente.movieadvisor.dao.FilmDAO;
import com.iessanvicente.movieadvisor.model.Film;

@Service
public class FilmQueryServiceImpl implements IFilmQueryService {

	@Autowired
	private FilmDAO dao;
	
	private Predicate<Film> predicate;
	
	@PostConstruct
	public void init() {
		predicate = null;
	}
	
	@Override
	public List<Film> exec() {
		return dao.findAll().stream()
				.filter(predicate)
				.collect(Collectors.toList());
	}

	@Override
	public IFilmQueryService anyGenres(String... genres) {
		Predicate<Film> pAnyGenre = (film -> Arrays.stream(genres).anyMatch(film.getGenres()::contains));
		predicate = (predicate == null)? pAnyGenre : predicate.and(pAnyGenre);
		return this;
	}

	@Override
	public IFilmQueryService allGenres(String... genres) {
		Predicate<Film> pAnyGenre = (film -> Arrays.stream(genres).allMatch(film.getGenres()::contains));
		predicate = (predicate == null)? pAnyGenre : predicate.and(pAnyGenre);
		return this;
	}

	@Override
	public IFilmQueryService year(int year) {
		Predicate<Film> pYear = (film -> film.getYear() == year);
		predicate = (predicate == null)? pYear : predicate.and(pYear);
		return this;
	}

	@Override
	public IFilmQueryService betweenYear(int from, int to) {
		Predicate<Film> pYear = (film -> {
			LocalDate fromYear = LocalDate.of(from, 1, 1);
			LocalDate toYear = LocalDate.of(to, 1, 3);
			LocalDate filmYear = LocalDate.of(film.getYear(), 1, 2);
			
			return filmYear.isAfter(fromYear) && filmYear.isBefore(toYear);
		});
		predicate = (predicate == null)? pYear : predicate.and(pYear);
		return this;
	}

	@Override
	public IFilmQueryService titleContains(String title) {
		Predicate<Film> pContains = (film -> film.getTitle().toLowerCase().contains(title.toLowerCase()));
		predicate = (predicate == null)? pContains : predicate.and(pContains);
		return this;
	}

}
