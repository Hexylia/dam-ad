package com.pavaalar.ad;

import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Here I define the variables
		
		String json = "{\"responsable\"" 
							+ "{\"Nombre\":\"Juan\"," 
							+ "\"Edad\":28, "
							+ "\"Aficiones\":\"[\"Música\",\"Cine\",\"Tenis\"]\","
							+ "\"Residencia\":\"Madrid\""
						+ "}\","
					   	+ "empleados\":\""
					   	+ "[\""
					   		+ "{\"Nombre\":\"Elena\","
					   		+ "\"Edad\":26, "
					   		+ "\"Aficiones\":\"[\"Música\",\"Cine\"]\","
					   		+ "\"Residencia\":\"Madrid\""
					   		+ "}\","
					   		+ "{\"Nombre\":\"Luis\","
					   		+ "\"Edad\":31, "
					   		+ "\"Aficiones\":\"[\"Teatro\",\"Cine\",\"Fútbol\"]\","
					   		+ "\"Residencia\":\"Madrid\""
					   		+ "}\""
					   	+"]\""
					   	+"}\"";
		
		//Here I define the FileWriter and the PrintWriter
		
		File f = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try{
			
			//Here I Create .json file
			
			f = new File("datos.json");
			fw = new FileWriter(f);
			 
			//Here I write into the json file
			
			pw = new PrintWriter(fw);
			
			pw.println(json);
			System.out.println(json);
			fw.close();
			
		} catch(Exception e) { 
			e.printStackTrace();
		}
		
		
		
		
}

}
