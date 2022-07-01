package sistemaViajes;

public class Reserva {
    // atributos
    private int codigo;
    private int personas;
    private static final double PRECIO_BOLETO = 50.;
    private static final double DESCUENTO = 0.2;
    private Recorrido recorrido;

    // constructor
    public Reserva(int codigo, int personas, Recorrido recorrido) {
        this.codigo = codigo;
        this.personas = personas;
        this.recorrido = recorrido;
    }

    // métodos
    public double precioReserva(){
        return isCabecera()? PRECIO_BOLETO * personas * (1 - DESCUENTO) : PRECIO_BOLETO * personas;
    }

    private boolean isCabecera() {
        return (recorrido.getEstacionDestino().equals("Bragado") && recorrido.getEstacionPartida().equals("Buenos Aires")) ||
                recorrido.getEstacionDestino().equals("Buenos Aires") && recorrido.getEstacionPartida().equals("Bragado");
    }

    // getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }
}
