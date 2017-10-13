package com.pavaalar.ad;

import java.io.*;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[]args) throws IOException {
		
		//Creating the Scanner and the ArrayList
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> user_data = new ArrayList<String>();
		
		//Initializing the variables
		
		String name;
		String surname;
		String id;
		String data;
		
		//Generating the file1.txt
		
		File f = new File("file1.txt");
		
		//Generating the for loop in order to gather the information from the user
		
		for(int i = 0; i<10; i++) {
			
			//Generating the StreamBuilder
			
			StringBuilder sb = new StringBuilder();
			
			//Asking the user for the values
			
			System.out.print("Name: ");
			name = input.nextLine();
			
			System.out.print("Surname: ");
			surname = input.nextLine();
			
			System.out.print("ID: ");
			id = input.nextLine();
		
			System.out.println();
			
			//Adding the variables to the StringBuilder
			
			sb.append(name + " ");
			sb.append(surname + " ");
			sb.append(id + " ");
			
			//Parsing the information from the StringBuilder into a variable
			
			data = sb.toString();
		
			//Adding the data to the ArrayList
			
			user_data.add(data);
			
			//Emptying the StreamBuilder
			sb = null;
			
		}
		
		//Initializing the FileWriter and the PrintWriter
		
		FileWriter fw = new FileWriter(f);
		
		PrintWriter pw = new PrintWriter(fw);
		
		//Adding the data from the ArrayList into the file1.txt I've created earlier
		
		for(int i = 0; i<user_data.size(); i++) {
			
			fw.write((i+1) + " " + user_data.get(i));
			pw.println();
		}
		
		fw.close();
		
		//Initializing the FileReader and the BufferedReader
		
		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr);	
		
		String linea = br.readLine();
		
		//Creating a while loop in order to read the file
		
		while(linea != null) {
			
			//Splitting the strings put in the document using split
			
			String [] campos = linea.split(" ");
			
			for(int i = 0; i<campos.length; i++) {
			
				System.out.println(campos[i]);
				
			}
			
			linea = br.readLine();
			
			System.out.println();
		}
		
		br.close();
		
	}
}
