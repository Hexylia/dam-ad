package com.ad.pva.practica1;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		//Here I define the variables
		
		int num = 0;
	
		int acumuladorNeg = 0;
		int acumuladorPos = 0;
		
		int contador = 0;
		int contadorPos = 0;
		int contadorNeg = 0;
		
		//Here I ask for 10 numbers
		
		for(int i = 0; i<10; i++) {
			
			System.out.println("Introduce 10 numeros");
			num = Entrada.entero();
			
			if(num == 0) {contador++;}
			
			if(num > 0) {contadorPos ++; acumuladorPos+=num;}
			
			if(num < 0) {contadorNeg ++; acumuladorNeg+=num;}
	
		}
		
		//Here I show how many positive and negative numbers did the user put in
		
		System.out.println("Has introducido " + contador + " ceros");
		
		System.out.println("Has introducido " + contadorPos + " numeros positivos");
		
		System.out.println("Has introducido " + contadorNeg + " numeros negativos");
		
		System.out.println("La suma total de numeros positivos es de: " + acumuladorPos);
		
		System.out.println("La suma total de numeros negativos  es de: " + acumuladorNeg);
		
		
	}

}
