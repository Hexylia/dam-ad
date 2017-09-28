package com.ad.pva.practica1;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Here I define the variables
		
		int num = 0;
		
		//Here I make a while loop in order to get the number from the user until he puts the right number
		
		while(num == 0 || num > 9999) {
			
			System.out.println("Introduce un número entre 0 y 9.999");
			num = Entrada.entero();
			
		}
		
		//Here I print in the screen how many ciphers the number had
		
		if(num < 10) {System.out.println("El número tiene 1 cifra");}
		
		if(num > 10 && num < 100) {System.out.println("El número tiene 2 cifras");}
		
		if(num < 1000 && num > 99) {System.out.println("El número tiene 3 cifras");}
		
		if(num < 10000 && num > 999) {System.out.println("El número tiene 4 cifras");}
		
		
	}

}
