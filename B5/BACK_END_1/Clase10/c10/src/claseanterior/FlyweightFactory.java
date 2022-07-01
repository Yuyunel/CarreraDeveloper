package claseanterior;

import org.apache.log4j.Logger;

import java.util.HashMap;


public class FlyweightFactory {

    public static HashMap<String, Triangulo> trianguloMap = new HashMap<>();
    private static final Logger logger= Logger.getLogger(FlyweightFactory.class);
    public static Triangulo obtenerTriangulo(String color) {
        Triangulo triangulo= trianguloMap.get(color);
        if(triangulo == null) {
            triangulo = new Triangulo(color);
            logger.info("Se ha creado un nuevo triangulo");
            trianguloMap.put(color, triangulo);
        }

        return triangulo;
    }
}
