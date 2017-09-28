package Ejercicio2;

public class Coche {

	//Here I define the attributes
	
	private int cilindrada = 2000;
	private int potencia = 150;
	
	//Here I've created both constructors and the getters and setters
	
	public Coche() {
		
	}
	
	public Coche(int cilindrada, int potencia) {
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	//Here I've made a toString method in order to return the data form the attributes
	
	public String toString() {
		String resultado="La cilindrada es de: "+this.cilindrada+" y su potencia es de: "+this.potencia;  
		return resultado;
	}
	
}
