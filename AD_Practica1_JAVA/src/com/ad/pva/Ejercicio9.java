package com.ad.pva;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Here I define the variables
		
		int num = 0;
		
		//Here I ask for a number
		
		System.out.println("Introduce un número");
		num = Entrada.entero();
		
		//Here I show the count of numbers until the namber that the user introduced
		
		for(int i = 0; i<num; i++) {
			
			System.out.println(i);
			
		}

	}

}
