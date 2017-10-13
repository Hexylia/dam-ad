package com.pavaalar.ad;

public class Profesor extends Persona{
	
	private String asignatura;

	
	public Profesor() {
		
	}

	public Profesor(String id, String name) {
		super(id, name);
		
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	
	
}
