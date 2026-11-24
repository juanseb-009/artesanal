package com.krakedev.artesanal.testJUNIT;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class testServirCervezaAI {

    // Caso 1: Verifica que se sirva correctamente una cantidad
    // y que se calcule el valor a pagar.
    @Test
    public void testServirCantidadCorrecta() {

        Maquina maquina = new Maquina("Pilsener", "Cerveza rubia", 0.05, 5000, null);

        maquina.recargarCerveza(2000);

        double resultado = maquina.servirCerveza(500, null);

        assertEquals(25.0, resultado, 0.001);
        assertEquals(1500.0, maquina.getCantidadActual(), 0.001);
    }

    // Caso 2: Verifica que se pueda servir toda la cerveza disponible.
    @Test
    public void testServirTodaLaCervezaDisponible() {

        Maquina maquina = new Maquina("Club", "Cerveza", 0.04, 5000, null);

        maquina.recargarCerveza(1000);

        double resultado = maquina.servirCerveza(1000, null);

        assertEquals(40.0, resultado, 0.001);
        assertEquals(0.0, maquina.getCantidadActual(), 0.001);
    }

    // Caso 3: Verifica que no se sirva cerveza cuando la cantidad
    // solicitada supera la cantidad disponible.
    @Test
    public void testCantidadInsuficiente() {

        Maquina maquina = new Maquina("Pilsener", "Cerveza rubia", 0.05, 5000, null);

        maquina.recargarCerveza(500);

        double resultado = maquina.servirCerveza(800, null);

        assertEquals(0.0, resultado, 0.001);
        assertEquals(500.0, maquina.getCantidadActual(), 0.001);
    }

    // Caso 4: Verifica que una máquina vacía no sirva cerveza
    // ni modifique su cantidad actual.
    @Test
    public void testServirMaquinaVacia() {

        Maquina maquina = new Maquina("Club", "Cerveza", 0.04, 5000, "");

        double resultado = maquina.servirCerveza(100, null);

        assertEquals(0.0, resultado, 0.001);
        assertEquals(0.0, maquina.getCantidadActual(), 0.001);
    }

    // Caso 5: Verifica que solicitar cero mililitros no genere
    // un cobro ni altere la cantidad disponible.
    @Test
    public void testServirCeroMililitros() {

        Maquina maquina = new Maquina("Pilsener", "Cerveza rubia", 0.05, "");

        maquina.recargarCerveza(1000);

        double resultado = maquina.servirCerveza(0, null);

        assertEquals(0.0, resultado, 0.001);
        assertEquals(1000.0, maquina.getCantidadActual(), 0.001);
    }

    // Caso 6: Verifica que el segundo constructor establezca
    // correctamente la capacidad y permita servir cerveza.
    @Test
    public void testServirConSegundoConstructor() {

        Maquina maquina = new Maquina("Club", "Cerveza", 0.03, "");

        maquina.recargarCerveza(2000);

        double resultado = maquina.servirCerveza(400, null);

        assertEquals(12.0, resultado, 0.001);
        assertEquals(1600.0, maquina.getCantidadActual(), 0.001);
    }
}
