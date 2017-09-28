package com.ad.pva;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Here I define the variables
		int num = 0;
		int num2 = 0;

		// Here I ask for the value of those two variables

		System.out.println("Introduce el valor para la primera variable");
		num = Entrada.entero();

		System.out.println("Introduce el valor para la segunda variable");
		num2 = Entrada.entero();

		// Here I make an if else system in order to make the proper calculations.

		if (num > num2) {
			System.out.println("La primera variable es mayor que la segunda");
		} else if (num < num2) {
			System.out.println("La primera variable es menor que la segunda");
		} else {
			System.out.println("Las variables son iguales");
		}

	}

}
