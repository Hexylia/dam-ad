package com.ad.pva;
public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Here I define the variables
		
		int num = 0;
		
		//Here I ask for the mark
		
		System.out.println("Que nota sacaste en el ultimo examen?");
		num = Entrada.entero();
		
		//Here I use a switch case in order to define a text for each mark
		
		switch(num) {
		
		case 0:
			System.out.println("Muy deficiente");
			break;
		
		case 1:
			System.out.println("Muy deficiente");
			break;
			
		case 2:
			System.out.println("Muy deficiente");
			break;
			
		case 3:
			System.out.println("Insuficiente");
			break;
			
		case 4:
			System.out.println("Insuficiente");
			break;
			
		case 5:
			System.out.println("Suficiente");
			break;
			
		case 6:
			System.out.println("Bien");
			break;
			
		case 7:
			System.out.println("Notable");
			break;
			
		case 8:
			System.out.println("Notable");
			break;
			
		case 9:
			System.out.println("Sobresaliente");
			break;
			
		case 10:
			System.out.println("Sobresaliente");
			break;
			
		default:
			System.out.println("Wrong value my dude");
		
		
		}

	}

}
