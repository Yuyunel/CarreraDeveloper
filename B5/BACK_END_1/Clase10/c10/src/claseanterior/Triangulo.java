package claseanterior;


import org.apache.log4j.Logger;

public class Triangulo {

    private String color;
    private int tamano;
    private static final Logger logger= Logger.getLogger(Triangulo.class);
    public Triangulo(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        logger.warn("Cuidado, alguien a cambiando el tamaño del triangulo" +
                "color "+getColor()+"\n" +
                ", esto implica un cambio general.\n" +
                "a modo de seguridad se registran los valores:\n" +
                "valor anterior: "+this.tamano+"\n" +
                "valor nuevo: "+tamano);
        this.tamano = tamano;
    }
}
