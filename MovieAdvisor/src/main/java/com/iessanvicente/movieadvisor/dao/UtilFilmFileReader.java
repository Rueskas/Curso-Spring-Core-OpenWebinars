package com.iessanvicente.movieadvisor.dao;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.ResourceUtils;

import com.iessanvicente.movieadvisor.model.Film;

public class UtilFilmFileReader {

	public static List<Film> readFile(final String path, final String separator, final String listSeparator){
		List<Film> films = new ArrayList<>();
		
		//@formatter:off
		try {
			films = Files.readAllLines(Paths.get(ResourceUtils.getFile(path).toURI()), Charset.defaultCharset())
				.stream()
				.skip(1)
				.map(line -> {
					String[] values = line.split(separator);
					return new Film(Long.parseLong(values[0]), values[1], Integer.parseInt(values[2]),
							Arrays.asList(values[3].split(listSeparator)));
				}).collect(Collectors.toList());
		} catch (IOException e) {
			System.out.println("Error: Reading file");
			e.printStackTrace();
			System.exit(-1);
		}
		
		//@formatter:on
		return films;
	}
}
