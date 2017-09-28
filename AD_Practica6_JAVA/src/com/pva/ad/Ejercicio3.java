package com.pva.ad;

import java.io.*;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException{
	
		// Here I define the File f, the FileWriter fw, the FileReader fr and the PrintWriter pw 
		
		File f = new File(args[0]);
		
		FileReader fr = new FileReader(f);
		
		FileWriter fw = new FileWriter("Entrada.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		
		//Here I've made a for loop with 11 iterations in order to fill the file with numbers from 1 to 10
		
		try {
			
			for(int i = 1; i<11; i++) {
				
				pw.println(i);
				
			}fw.close();
			
		}catch(Exception e) {e.printStackTrace();}
		
	}

}
