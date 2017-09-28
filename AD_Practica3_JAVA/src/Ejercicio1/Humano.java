package Ejercicio1;

public class Humano {

	//Here I define the attributes
	
	protected String nombre = "Juan";
	protected String apellido = "García";
	
	//Here I've created both constructors
	
	public Humano() {
		
	}
	
	public Humano(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Here I've made a toString method in order to return the data form the attributes
	
	public String toString() {
		String resultado = "El usuario es: " + this.apellido + ", " + this.nombre;
		
		return resultado;
	}
	
	
}
