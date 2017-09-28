package com.ad.pva.practica1;

public class Ejercicio10y11 {

	public static void main(String[] args) {
	
		//Here I define the variables
		
		int num = 0;
		int contador = 0;
		
		//Here I use a while loop while asking for the number to the user and showing the square of it until 
		//he enters a negative number
		
		do {
			System.out.println("Introduce un número");
			num = Entrada.entero();
			
			System.out.println("El cuadrado del número que has introducido es: " + num * 2);
			
			contador++;
		}
		while(num > 0);
		
		//Here I show how many positive numbers did the user enter
		
		System.out.println("Has introducido un total de: " + contador + " números positivos");

	}

}
