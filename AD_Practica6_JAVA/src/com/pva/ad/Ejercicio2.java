package com.pva.ad;

import java.io.*;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		
		//Here I define the variables
	
		String linea;
		
		// Here I define the File f, the PrintWriter pw, the FileReader fr and the BufferedReader br
		
		File f = new File("Ejercicio1.txt");
		
		FileReader fr = null;
		
		FileWriter fw = null;
		
		PrintWriter pw = null;
		
		BufferedReader br = null;
		
		//Here I'll show different type of info from the previous document
		
		System.out.println("---Informacion del fichero---");
		
		System.out.println("El nombre del fichero es: " + f.getName());
		
		System.out.println("Ruta absoluta del fichero: " + f.getAbsolutePath());
		
		System.out.println("Longitud del fichero en bytes: " + f.length());
		
		//Here I'll read the document and print it on screen using the buffered reader
		
		System.out.println("\n---Contenido del fichero---");
		
		fr = new FileReader(f);
		
		br = new BufferedReader(fr);
		
		linea = br.readLine();
		
		while(linea != null) {
			
			System.out.println(linea);
			
			linea = br.readLine();
			
		}

		//Now I will add more information to the file
		
		try {
			
			fw = new FileWriter("Ejercicio1.txt", true);
			
			pw = new PrintWriter(fw);
			
			pw.println("Añadiendo contenido del ejercicio02");
			
			pw.close();
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		while(linea != null) {
			
			System.out.println("\n\n" + linea);
			
			linea = br.readLine();
			
		}
		
		fr.close();
		
	}

}
