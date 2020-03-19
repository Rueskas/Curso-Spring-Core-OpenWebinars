package com.iessanvicente.movieadvisor.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iessanvicente.movieadvisor.dao.FilmDAO;
import com.iessanvicente.movieadvisor.model.Film;

@Service
public class FilmService {
	
	@Autowired
	private FilmDAO filmDao;
	
	@Autowired
	private FilmQueryServiceImpl filmQueryService;
	
	public List<String> findAllGenres(){
		List<String> result = null;
		
		result = filmDao.findAll()
				.stream()
				.map(p -> p.getGenres())
				.flatMap(lista -> lista.stream())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		return result;
	}
	
	public List<Film> findAll() {
		return filmDao.findAll();
	}
	
	public List<Film> findByAnyGenre(String...genres){
		return filmQueryService.anyGenres(genres).exec();
	}
	
	public List<Film> findByAllGenres(String...genres){
		return filmQueryService.allGenres(genres).exec();
	}
	
	public List<Film> findByYear(int year){
		return filmQueryService.year(year).exec();
	}
	
	public List<Film> findBetweenYears(int from, int to){
		return filmQueryService.betweenYear(from, to).exec();
	}
	
	public List<Film> findByTitleContains(String titleContains){
		return filmQueryService.titleContains(titleContains).exec();
	}
}
