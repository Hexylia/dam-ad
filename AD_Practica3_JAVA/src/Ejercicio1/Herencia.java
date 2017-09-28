package Ejercicio1;

public class Herencia {

	public static void main(String[] args) {
		
		//Here I've created different objects i order to store them later in the array
		
		Humano a = new Humano("Gonzalo", "Lopez");
		Ciudadano b = new Ciudadano("Paco", "Mahedero", "DNI");
		Ciudadano c = new Ciudadano("Pablo", "Quesito", "Pasaporte");
		
		Humano arrayHumanos[] = new Humano[3];
		
		arrayHumanos[0] = a;
		arrayHumanos[1] = b;
		arrayHumanos[2] = c;
		
		//Here I've made a for loop in order to get the information of the objects
		//with the toString method
		
		for(int i = 0; i<arrayHumanos.length; i++) {
			
			System.out.println(arrayHumanos[i].toString());
			
		}

	}

}
