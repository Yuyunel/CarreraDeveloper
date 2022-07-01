package mesas;

public class Main {
    public static void main(String[] args) {

        ArbolFactory arbolFactory = new ArbolFactory();
        Arbol floral = arbolFactory.getArbol(200, 100, "floral");
        Arbol frutal1 = arbolFactory.getArbol(300, 500, "frutal");
        Arbol frutal2 = arbolFactory.getArbol(300, 500, "frutal");
        Arbol ornamental = arbolFactory.getArbol(400, 200, "ornamental");

        for (int i=1;i<=10;i++){
            arbolFactory.getArbol(200, 100, "floral");
        }

    }
}
