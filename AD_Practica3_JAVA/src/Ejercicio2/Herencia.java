package Ejercicio2;

public class Herencia {

	//This method allows you to create different objects and store them into an array so
	//you can call it later in the main method in order to see the information of the objects
	
	public static void obtenerCoches() {
		
		//Here I define the variables
		
		int potencia = 0;
		int cilindrada = 0;
		String traccion = "4x4";
		
		//Here I've created an array for storing the objects
		
		Deportivo arrayDeportivo[] = new Deportivo[10];
		
		//This loop asks the user different attributes in order to create the objects and later on
		//storing them in the array
		
		for(int i = 0; i<arrayDeportivo.length; i++) {
			
			System.out.println("Cual es la potencia?");
			potencia = Entrada.entero();
			
			System.out.println("Cual es la cilindrada");
			cilindrada = Entrada.entero();
			
			System.out.println("Que tipo de tracción tiene? (Total o Delantera)");
			traccion = Entrada.cadena();
		
			arrayDeportivo[i] = new Deportivo(cilindrada, potencia, traccion);
		}
		
		//This loop uses the toString method in order to show the information from the objects
		//we previously created
		
		for(int i = 0; i<arrayDeportivo.length; i++) {
			
			System.out.println(arrayDeportivo[i].toString());
			
		}
		
	}
	
	public static void main(String[]args) {
		
		//Here I've created an object "car" and I've used the toString method in order
		//to get the information
		
		Coche a = new Coche(2000, 200);
		
		System.out.println(a.toString());
		
		//Here I call the obtenerCoches(); method
		
		obtenerCoches();
		
	}
	
}
