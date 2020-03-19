package com.iessanvicente.movieadvisor.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iessanvicente.movieadvisor.config.AppConfig;
import com.iessanvicente.movieadvisor.model.Film;

@Repository
public class FilmDaoImplMemory implements FilmDAO {

	List<Film> films = new ArrayList<>();
	
	@Autowired
	private AppConfig appConfig;
	
	@PostConstruct
	public void init() {
		films = UtilFilmFileReader.readFile(
				appConfig.getFile(), appConfig.getSeparator(), appConfig.getListSeparator());
	}
	
	public Film findById(long id) {
			
		Optional<Film> result =
				films.stream().filter(p -> p.getId() == id).findFirst();
		return result.orElse(null);
	}

	public List<Film> findAll() {
		return films;
	}

	public void insert(Film film) {
		films.add(film);

	}

	public void update(Film film) {
		int index = films.indexOf(film);
		if(index != -1) {
			films.set(index, film);
		}

	}

	public void delete(long id) {
		Film film = 
				films.stream()
				.filter(p -> p.getId() == id)
				.findFirst()
				.orElse(null);
		if(film != null) {
			films.remove(film);
		}

	}

}
