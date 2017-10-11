package com.pavaalar.psp;

public class Principal {

	public static void main(String[] args) {
	
		/*
		//Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		
		Cliente cliente1 = new Cliente("Cliente1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente2", new int[] { 1, 3, 5, 1, 1 });

		Cajera cajera1 = new Cajera("Cajera 1");
		Cajera cajera2 = new Cajera("Cajera 2");
		
		cajera1.procesarCompra(cliente1, initialTime);
		cajera2.procesarCompra(cliente2, initialTime);
		*/
		
		//Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		
		Cliente cliente1 = new Cliente("Cliente1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente2", new int[] { 1, 3, 5, 1, 1 });
		
		CajeraThread cajeraHilo1 = new CajeraThread("Cajera 1", cliente1, initialTime);
		CajeraThread cajeraHilo2 = new CajeraThread("Cajera 2", cliente2, initialTime);
		
		cajeraHilo1.start();
		cajeraHilo2.start();
		
	}

}
