package com.ad.pva;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

	public static ArrayList quesito2007() {

		// Here I define the variables

		String stringacion = "Queso";

		// Here I've created an ArrayList in order to store the different values

		ArrayList<String> arrayString = new ArrayList<String>();

		// Here I've made a for loop with 5 iterations in order to fill the array
		
		for (int i = 0; i < 5; i++) {

			System.out.println("Introduce un nombre");
			stringacion = Entrada.cadena();

		}

		// Here I've created an ArrayList in order to store the different values but in
		// reverse order

		ArrayList<String> arrayString2 = new ArrayList<String>();

		arrayString2 = arrayString;

		// I've used the collections.reverse in order to change the order of the
		// elements inside the array
		Collections.reverse(arrayString2);

		return arrayString2;

	}

	public static void main(String[] args) {

		ArrayList<String> resultado = new ArrayList<String>();

		resultado = quesito2007();

	}

}
