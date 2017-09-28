package com.ad.pva;
import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Here I define the arraylist

		ArrayList<String> liga = new ArrayList<String>();
		String nom = "";

		// Here I define the for loop

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce el nombre");

			liga.add(Entrada.cadena());
		}

		// Here I define the arraylist

		ArrayList<String> liga2 = new ArrayList<String>();

		// Here I define the for loop

		for (int i = 0; i < 5; i++) {

			liga2.add(liga.get(i));

		}

		// Here I've made a for loop in order to show the information inside the
		// array

		for (int i = 0; i < liga.size(); i++) {
			System.out.println(liga.get(i));
			System.out.println(liga2.get(i));
		}

		// Here I use the remove method in order to get rif of the 4th position

		liga.remove(4);
		liga2.remove(4);

		// Here I've made a for loop in order to show the information inside the
		// array

		for (int i = 0; i < liga.size(); i++) {
			System.out.println(liga.get(i));
			System.out.println(liga2.get(i));
		}

		// Here I set 2 different values for the same position in both arrays

		liga.set(2, "Es");
		liga2.set(2, "paña");

		// Here I show the values of both arrays

		for (int i = 0; i < liga.size(); i++) {
			System.out.println(liga.get(i));
			System.out.println(liga2.get(i));
		}

		nom = liga.get(3);
		liga.remove(liga.indexOf(nom));

	}

}
