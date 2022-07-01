package mesas;

import java.util.HashMap;

public class FlyweightFactory {

    private static HashMap<String, Ropa> ropaMap = new HashMap<>();

    public static Ropa obtenerRopa(String tipo, String talle, boolean esNueva, boolean importada) {
        Ropa ropa= ropaMap.get(tipo);
        if(ropa == null) {
            ropa = new Ropa(tipo,talle,esNueva,importada);
            ropaMap.put(tipo, ropa);
        }

        return ropa;
    }

    public static HashMap<String, Ropa> getRopaMap() {
        return ropaMap;
    }
}
