package com.krakedev.artesanal.testJUNIT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestConsumoCliente {
	
	@Test
	public void probarConsumo() {
		
		Maquina maquinaA = new Maquina("Royal Dutch", "rubia", 0.02, 8000, null);
		Negocio barDeMoe = new Negocio("Bar De Moe", maquinaA);
		Cliente cliente = new Cliente("Andrés", "123456789");
		
		barDeMoe.cargarMaquinaA();
		barDeMoe.ConsumirCervezaMaquinaA(cliente, 100);
		
		assertEquals(7700, maquinaA.getCantidadActual(),0.0001);
		assertEquals(2.0, cliente.getTotalConsumido(), 0.0001);
		
		barDeMoe.ConsumirCervezaMaquinaA(cliente, 200);
		assertEquals(7500, maquinaA.getCantidadActual(),0.0001);
		assertEquals(6.0, cliente.getTotalConsumido(),0.0001);
		
		
	}

}
