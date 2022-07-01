package mesas;

public class Arbol {
    private static String tipoArbol;
    private int ancho;
    private int alto;
    private String color;

    public Arbol(int ancho, int alto, String color) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }
}
