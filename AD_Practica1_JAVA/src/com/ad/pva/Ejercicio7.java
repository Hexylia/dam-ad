package com.ad.pva.practica1;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Here I define all the variables

		int dia = 14;
		int mes = 9;
		int anyo = 2017;

		int dia1 = 0;
		int mes1 = 0;
		int anyo1 = 0;

		// Here I ask for the day month and year

		System.out.println("Introduce el dia");
		dia1 = Entrada.entero();

		System.out.println("Introduce el mes");
		mes1 = Entrada.entero();

		System.out.println("Introduce el año");
		anyo1 = Entrada.entero();

		// Here I compare both variables

		if (dia == dia1 && mes == mes1 && anyo == anyo1) {
			System.out.println("Hoy es: " + dia1 + "/" + mes1 + "/" + anyo1);
		}

		if (dia != dia1) {
			System.out.println("El dia es incorrecto");
		}

		if (mes != mes1) {
			System.out.println("El mes es incorrecto");
		}

		if (anyo != anyo1) {
			System.out.println("El año es incorrecto");
		}
	}

}
