package com.ad.pva;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Here I declare the variables and the StringTokenizer

		String nombre = data2();
		StringTokenizer tokens = new StringTokenizer(nombre, ",");
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}

	}

	// Here I've created the method which returns an array list

	public static ArrayList<String> data() {

		// Here I define the arraylist

		ArrayList<String> array = new ArrayList<String>();

		// Here I've made a for loop with 2 iterations in order to get the info
		// from the user

		for (int i = 0; i < 2; i++) {

			System.out.println("introduce tu nombre");
			array.add(Entrada.cadena());
			array.add(",");
			System.out.println("introduce tu edad");
			array.add(Entrada.cadena());
			array.add(",");

		}

		return array;

	}

	// Here I've made tha data2 method which returns a String

	public static String data2() {

		// Here I declare the variables

		String cadena = "";
		ArrayList<String> array = new ArrayList<String>();

		// Here I declare the array which will receive the array from the data
		// method

		array = data();

		for (int i = 0; i < array.size(); i++) {
			cadena = cadena + array.get(i);
		}
		System.out.println(cadena);
		return cadena;

	}

}
