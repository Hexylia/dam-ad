package com.ad.pva;
public class Ejercicio4 {

	public static void main(String[] args) {
		
		//Here I define the variables
		
		double nomina = 0;
		double nomina1 = 0;
		double nomina2 = 0;
		double nomina3 = 0;
		double acumulador = 0;
		double finalIRPF = 0;
		double total = 0;
		
		//Here I've made a for loop in order to get all the 3 different paysheets from the user asking
		//him for the value of them.
		
		for(int i = 0; i<3; i++) {
			
			System.out.println("Introduce the value of your last 3 paysheets");
			nomina = Entrada.real();
			
			//Here I stack the different values of the variables in one variable and
			//using an if else system I add the values of the different paysheets in dfferent variables too
			
			acumulador+=nomina;
			
			//If else system
			if(nomina1 == 0){nomina1 = nomina;}
			else if(nomina2 == 0){nomina2 = nomina;}
			else{nomina3 = nomina;}
		}
		
		//Now I will add the 12% to the final value
		
		finalIRPF = acumulador * 0.12;
		total = acumulador - finalIRPF;
		
		//And then I show the results on screen
		
		System.out.println("First paysheet: " + nomina1);
		System.out.println("Second paysheet: " + nomina2);
		System.out.println("Third paysheet: " + nomina3);
		System.out.println("Sum of all paysheets: " + acumulador);
		System.out.println("Amount paid for IRPF%: " + finalIRPF);
		System.out.println("Final amount with the IRPF discount: " + total);
	}

}
