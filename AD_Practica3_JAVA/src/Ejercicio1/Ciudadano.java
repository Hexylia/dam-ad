package Ejercicio1;

public class Ciudadano extends Humano{

	//Here I define the attributes
	
	protected String documento = "Beca";

	//Here I've created both constructors
	
	public Ciudadano() {
		
	}

	public Ciudadano(String nombre, String apellido, String documento) {
		super(nombre, apellido);
		
		this.documento = documento;
		
	}
	
	//Here I've made a toString method in order to return the data form the attributes
	
	public String toString() {
		
		String resultado = super.toString() + " y el documento es: " + this.documento;
		
		return resultado;
		
	}

	
}
