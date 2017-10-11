package com.pavaalar.ad;

import com.google.gson.Gson;

import java.io.*;

public class testEmpresa {

	public static void main(String[] args) throws IOException{
		
		//Here I define the variables
		
		String json = "skettit";
		
		//Here I use the gson library
		
		Gson gson = new Gson();
				
		//Here I set the try and catch
		
		try {
					
			//Here I create the object "empresa" and i fill it with the setters
					
			Empresa empresa = new Empresa();
					
			empresa.setNombre("Jesus");
			empresa.setEdad("27");
			empresa.setAficiones(new String[] {"Musica", "Ser emo"});
			empresa.setResidencia("Valterna");
					
			json = gson.toJson(empresa);
					
			}catch(Exception e) {
				System.out.println("Error parseando Json");
			}
		
		//Here I show the information of the json file on screen
		
		System.out.println(json);
		
		try{
					 
			//Here I create the json file
			
			File f = new File("empresa.json");
			
			FileWriter fw = new FileWriter(f);
			
			PrintWriter pw = null;
			
			//Here I write into the json file
			
			pw = new PrintWriter(fw);
			
			pw.println(json);
			
			fw.close();
			
		} catch(Exception e) { 
			e.printStackTrace();
		}
		
	}

}
