package claseanterior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightTest {

  @Test
    void getTrianguloConTamano2() {
        Triangulo triangulo = FlyweightFactory.obtenerTriangulo("rojo");
        triangulo.setTamano(2);
        Triangulo triangulo1 = FlyweightFactory.obtenerTriangulo("rojo");
        triangulo1.setTamano(4);

        assertEquals(triangulo.getColor(), "rojo");
        assertEquals(triangulo.getTamano(), 2);
        assertEquals(FlyweightFactory.trianguloMap.size() == 1, true);


    }

}
