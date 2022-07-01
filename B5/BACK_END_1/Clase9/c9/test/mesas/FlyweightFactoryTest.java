package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightFactoryTest {
    @Test
    void getRopaTest() {
        Ropa ropa = FlyweightFactory.obtenerRopa("pantalon", "XS", false, false);

        //esperamos recibir en ropa un pantalon
        assertTrue(ropa.getTipo().equals("pantalon"));
    }

    @Test
    void getTamanioFabricaTest() {
        Ropa ropa = FlyweightFactory.obtenerRopa("pantalon", "XS", false, false);
        Ropa ropa1 = FlyweightFactory.obtenerRopa("pantalon", "XS", false, true);
        Ropa ropa2 = FlyweightFactory.obtenerRopa("pantalon", "S", false, false);
        Ropa ropa3 = FlyweightFactory.obtenerRopa("pantalon", "M", false, false);
        Ropa ropa4 = FlyweightFactory.obtenerRopa("pantalon", "S", false, false);
        Ropa ropa5 = FlyweightFactory.obtenerRopa("remera", "S", true, false);
        Ropa ropa6 = FlyweightFactory.obtenerRopa("remera", "S", true, true);

        //esperamos tener solamente dos ropas, de esta forma verificamos que tenemos menos
        assertTrue(FlyweightFactory.getRopaMap().size() == 2);
    }
}