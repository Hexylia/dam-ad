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

		// Here I define the File f, the FileWriter fw, the FileReader fr, the PrintWriter pw and the BufferedReader br

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
			
				//Using the println method from the print writer I fill the document
				
				pw.println();
				pw.print("Linea " + i + ". ");
				pw.print("Nombre: " + nombre + ". ");
				pw.print("Apellido: " + apellido + ". ");
				pw.print("Edad: " + edad + ". ");
				
				
			}pw.close();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}

		//Now I show the data on screen using the BufferedReader
		
		f = new File("Ejercicio1.txt");
		
		fr = new FileReader(f);
		
		br = new BufferedReader(fr);
		
		String linea = br.readLine();
		
		while(linea != null) {
			
			System.out.println(linea);
			
			linea = br.readLine();
		
		}
		
		fr.close();
		
	}

}
