package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestLlenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maquina rubia = new Maquina("Pilsener", "Cerveza fria", 0.02, 8000, null);

		rubia.imprimir();
		
		rubia.llenarMaquina();
		rubia.imprimir();
		
		Maquina negra = new Maquina("Royal Dutch", "Cerveza buena", 0.03, null);
		
		negra.imprimir();
		
		negra.llenarMaquina();
		negra.imprimir();

	}

}
