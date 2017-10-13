package com.pavaalar.ad;

public class Estudiante extends Persona{
	
	private int grade;
	
	private char group;
	
	private double mark;
	

	public Estudiante() {
	
	}

	public Estudiante(String id, String name, int grade, char group, double mark) {
		super(id, name);
		
		
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public char getGroup() {
		return group;
	}

	public void setGroup(char group) {
		this.group = group;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
	
	
}
