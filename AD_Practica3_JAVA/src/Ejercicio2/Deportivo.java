package Ejercicio2;

public class Deportivo extends Coche{

	//Here I define the attributes
	
	protected String traccion = "Delantera";
	
	//Here I've created both constructors and the getters and setters
	
	public Deportivo(int cilindrada, int potencia, String traccion) {
		super(cilindrada, potencia);
		this.traccion = traccion;
		
	}
	
	//Here I've made a toString method in order to return the data form the attributes
	
	public String toString() {
		String resultado= super.toString()+" y su traccion es: "+this.traccion;  
		return resultado;
	}
	
}
