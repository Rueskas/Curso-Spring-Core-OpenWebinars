package com.iessanvicente.lifecycle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PersonaDAOImplMemory implements PersonaDAO, InitializingBean, DisposableBean {

	List<Persona> personas = new ArrayList<>();
	
	public Persona findByIndex(int index) {
		personas.get(index);
		return null;
	}

	public List<Persona> findAll() {
		return personas;
	}

	public void insert(Persona persona) {
		personas.add(persona);
	}

	public void edit(int index, Persona persona) {
		personas.add(index, persona);
	}

	public void delete(int index) {
		personas.remove(index);
	}

	public void delete(Persona persona) {
		personas.remove(persona);
	}

	public void afterPropertiesSet() throws Exception {
		insert(new Persona("Julia", 20));
		insert(new Persona("Pedro", 23));
		insert(new Persona("Juan", 22));
		insert(new Persona("Antonio", 30));
		
	}

	@Override
	public void destroy() throws Exception {
		personas.clear();
		System.out.println("Limpiando los datos de la lista");
		
	}

}
