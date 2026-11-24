package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maquina rubia = new Maquina("Pilsener", "cerveza rubia", 0.02, 10000, null);

		rubia.imprimir();

		rubia.setNombreCerveza("RoyalDutch");
		rubia.setDescripcion("Cerveza con aroma mas intenso");

		rubia.imprimir();

	}

}
