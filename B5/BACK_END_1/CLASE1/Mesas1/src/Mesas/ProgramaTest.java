package Mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaTest {
    Programa programa = new Programa();
    @Test
    public void areaDeFigura() {
        FormaGeometrica circulo1 = new FormaGeometrica("Circulo", 3);
        FormaGeometrica cuadrado1 = new FormaGeometrica("Cuadrado",5);
        int resultadoCirculo= programa.calcularPerimetro(circulo1);
        int resultadoCuadrado = programa.calcularPerimetro(cuadrado1);


        assertEquals(28,resultadoCirculo);
        assertEquals(25,resultadoCuadrado);
        programa.mostrarMensaje(circulo1.getTipo(), resultadoCirculo);
        programa.mostrarMensaje(cuadrado1.getTipo(),resultadoCuadrado);
    }

}