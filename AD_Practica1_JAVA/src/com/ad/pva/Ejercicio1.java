package com.ad.pva;
import java.util. *;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Here I define the variables
		
		String nombrecito = "Paco";
		
		//Here I've created the ArrayList
		
		ArrayList<String> nombre = new ArrayList<String>();
		
		//Here I've made a for loop in order to get the information from the user
		
		for(int i= 0; i<10; i++) {
			
			System.out.println("Introduce un nombre");
			nombrecito = Entrada.cadena();
			
			nombre.add(nombrecito);
		}

		//Here I show the last value of the array list
		
		System.out.println(nombre.get(nombre.size()-1));
		
		//Here I show the information of the array
		for(int i = 0; i<nombre.size(); i++) {
			
			System.out.println(nombre.get(i));
			
		}
		
		//Here I remove the first position from the array
		
		nombre.remove(0);
		
		//Here I change the value of the 7th position
		
		nombre.set(7, "Franjelou");
	}

}
