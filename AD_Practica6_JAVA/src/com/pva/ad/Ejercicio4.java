package com.pva.ad;

import java.io.*;

public class Ejercicio4 {

	public static int factorial(int numero) {
		
		int resultado = 0;
		
		for(int i = numero; i>=1; i--) {
			
			resultado *= i;
			
		}
		
		return resultado;
		
	}
	
	public static void main(String[] args) throws IOException{
		
		//Here I define the variables
		
		String var;
		
		int numero;
		
		// Here I define the File f, the FileWriter fw, the FileReader fr, the PrintWriter pw and the BufferedReader br

		File f = new File("Entrada.txt");

		FileWriter fw = null;
		
		FileReader fr = new FileReader(f);
		
		PrintWriter pw = null;
		
		BufferedReader br = null;
		
		
		try {
			
			//Here I've created the Salida.txt file
			
			fw = new FileWriter("Salida.txt");
			
			pw = new PrintWriter(fw);
			
			br = new BufferedReader(fr);
		
			//Here I store the value from the Entrada txt into a variable which I'll parse later
			
			var = br.readLine();
		
			//Now I will make a while loop in order to fill the Salida txt using the method factoral with the Entrada.txt data
			
			while(var!=null) {
				
				//I parse the String variable
				
				numero = Integer.parseInt(var);
				
				System.out.println("El factorial de " + var + " es: " + factorial(numero));
				
				pw.print(factorial(numero));
				
				pw.println();
				
			}pw.close();
			
			
		}catch(Exception e) {e.printStackTrace();}
		
		
		
		

	}

}
