package mesas;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {

    private static Map<String, Arbol> listadoArboles = new HashMap();

    public Arbol getArbol(int ancho, int alto, String color) {
        String clave = "key:" + ancho + alto + color;

        if(!listadoArboles.containsKey(clave)) {
            Arbol arbol = new Arbol(ancho, alto, color);
            listadoArboles.put(clave, arbol);
            System.out.println("creamos un nuevo arbol");
            return listadoArboles.get(clave);
        } else {
            System.out.println("Obtuimos un arbols ya creado");
            return listadoArboles.get(clave);
        }
    }
}
