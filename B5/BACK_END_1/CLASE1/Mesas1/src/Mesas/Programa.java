package Mesas;



public class Programa {

    public int calcularPerimetro(FormaGeometrica f) {
        if (f.getTipo().equals("circulo") && f.getValor() > 0) {
            return (int)(Math.PI*Math.pow(f.getValor(), 2));
        } else if (f.getTipo().equals("cuadrado") && f.getValor() > 0) {
            return (int)(Math.pow(f.getValor(), 2));
        }
        return 0;
    }

    public void mostrarMensaje(String tipo, int valor) {
        if (valor != 0)
            System.out.println("El área del " + tipo + " es " + valor + " unidades.");
        else
            System.out.println("El valor del radio o lado debe ser mayor que cero.");
    }
}

