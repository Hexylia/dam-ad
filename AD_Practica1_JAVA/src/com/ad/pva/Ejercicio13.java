package com.ad.pva.practica1;

public class Ejercicio13 {

	public static void main(String[] args) {

		//Here I define the variables
		
		int num = 0;
		double num2 = 0;
		
		int acumuladorEdad = 0;
		double acumuladorAlt = 0;
		
		int contador18 = 0;
		int contador175 = 0;
		
		//Here I ask for 10 numbers 
		
		for(int i = 0; i<5; i++) {
			
			System.out.println("Introduce la edad y la altura de 5 alumnos");
			System.out.print("Edad: ");num = Entrada.entero();
			System.out.print("Altura: ");num2 = Entrada.real();
			
			//Here I've made a system with conditials in order to get the amount of students who
			//height more than 1.75 and also the students who are 18 years or older
			if(num >= 18) {contador18++; acumuladorEdad+=num;}
			
			if(num2 > 1.75) {contador175 ++; acumuladorAlt+=num2;}
			
	
		}

		//Now I show the results on screen
		
		System.out.println("Alumnos mayores a 18 años " + contador18);
		
		System.out.println("Alumnos más altos de 1.75 " + contador175);
		
		System.out.println("La media de edad "+acumuladorEdad/5);
		
		System.out.println("La media de estatura "+acumuladorAlt*10/5);
	}

}
