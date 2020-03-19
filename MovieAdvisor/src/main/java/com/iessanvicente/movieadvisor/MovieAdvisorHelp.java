package com.iessanvicente.movieadvisor;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
public class MovieAdvisorHelp {
	private String help;
	
	@PostConstruct
	public void init() {
		try {
			help = Files.lines(Paths.get(ResourceUtils.getFile("classpath:help.txt").toURI()), Charset.defaultCharset())
					.collect(Collectors.joining("\n"));
					
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Error: Leyendo el archivo de ayuda");
			System.exit(-1);
		}
	}
	
	public String getHelp() {
		return help;
	}
}
