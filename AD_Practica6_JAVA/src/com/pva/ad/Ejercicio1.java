package com.pva.ad;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {

		// Here I declare the variables

		String nombre = "Españaman";
		String apellido = "Martinez";
		int edad = 0;
		String linea = "queso";

		// Here I define the File f, the FileWriter fw, the PrintWriter pw and the BufferedReader br

		File f = null;

		FileWriter fw = null;
		
		FileReader fr = null;
		
		PrintWriter pw = null;
		
		BufferedReader br = null;
		
		// Here I've made a for loop in order to gather the information from the user
		
		try
		{
			fw = new FileWriter("Ejercicio1.txt");
			pw = new PrintWriter(fw);
		
			for (int i = 0; i < 5; i++) {

				System.out.println("Introduce el nombre");
				nombre = Entrada.cadena();
			
				System.out.println("Introduce el apellido");
				apellido = Entrada.cadena();
			
				System.out.println("Introduce la edad");
				edad = Entrada.entero();
			
				pw.println("Linea " + i);
				
				pw.print("Nombre: " + nombre + " ");
				pw.print("Apellido: " + apellido + " ");
				pw.print("Edad: " + edad + " ");
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}

		//Now I show the data on screen using the BufferedReader
		
		while(linea != null) {
			
			linea = br.readLine();
			
			System.out.println(linea);
		}
		fr.close();
		
	}

}
