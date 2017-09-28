package com.ad.pva;

import java.util.*;

public class Ejercicio2 {

	public static void leeEnteros() {

		// Here I define the variables

		int num = 1;
		int acumulador = 0;
		int media = 0;
		int i = 0;

		// Here I've created the ArrayList

		ArrayList<Integer> enteritos = new ArrayList<Integer>();

		// Here I've created a while loop in order to filter whether the integer is 0 or
		// not

		while (num != 0) {
			
			System.out.println("Introduce un numero");
			num = Entrada.entero();
			
			System.out.println("El número es: " + num);
			
			enteritos.add(num);
			
			acumulador+=num;
			
			i++;
			
			//num = (int)(Math.random()* 11);
		}

		media = acumulador / i;
		
		System.out.println("La media es: " + media);
		
	}

	public static void main(String[] args) {
		
		//Here I call the method
		
		leeEnteros();

	}

}
