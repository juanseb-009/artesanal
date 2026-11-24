package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestServir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maquina rubia = new Maquina("Pilsener", "Cerveza fria", 0.02, 8000, null);

		System.out.println("--------ESTADO INICIAL--------");
		rubia.imprimir();
		
		System.out.println("--------LLENANDO MAQUINA--------");
		rubia.llenarMaquina();
		rubia.imprimir();
		
		System.out.println("--------SERVIR 1000ML--------");
		
		double valor;
		
		valor = rubia.servirCerveza(1000, null);
		System.out.println("Valor a pagar: " + valor);
		
		System.out.println("--------SERVIR 2000ML--------");
		
		double valor2;
		
		valor2 = rubia.servirCerveza(2000, null);
		System.out.println("Valor a pagar: " + valor2);
		
		rubia.imprimir();
		
		System.out.println("--------SERVIR 6000ML--------");
		
		double valor3;
		
		valor3 = rubia.servirCerveza(6000, null);
		System.out.println("Valor a pagar: " + valor3);
		
		
		
	}

}
