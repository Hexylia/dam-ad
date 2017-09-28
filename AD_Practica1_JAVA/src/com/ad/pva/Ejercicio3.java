package com.ad.pva;

public class Ejercicio3 {

	public static void main(String[] args) {
		
	//Here I define the different variables
		
	int num = 20;
	char carac = 'z';
	double numd = 0.2;
	String queso = "sadboys2001";
	
	//Here I ask the user for the value of the variables using the "Entrada" class
	
	System.out.println("Please, introduce the value of num");
	num = Entrada.entero();
	
	System.out.println("Please, introduce the value of carac");
	carac = Entrada.caracter();
	
	System.out.println("Please, introduce the value of numd");
	numd = Entrada.real();
	
	System.out.println("Please, introduce the value of queso (String)");
	queso = Entrada.cadena();
	
	//Here we use the sysout to print a message with the variable and the value of that variable
		
	System.out.println("The value of the integer variable (num) is: " + num);
		
	System.out.println("The value of the character variable (carac) is: " + carac);
		
	System.out.println("The value of the double variable (numd) is: " + numd);
		
	System.out.println("The value of the String variable (queso) is: " + queso);
		

	}

}
