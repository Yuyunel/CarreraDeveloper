package sistemaViajes;

public class Recorrido {
    // atributos
    private String estacionDestino;
    private String estacionPartida;

    // constrcutor
    public Recorrido(String estacionDestino, String estacionPartida) {
        this.estacionDestino = estacionDestino;
        this.estacionPartida = estacionPartida;
    }

    // getters y setters
    public String getEstacionDestino() {
        return estacionDestino;
    }

    public void setEstacionDestino(String estacionDestino) {
        this.estacionDestino = estacionDestino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

    public void setEstacionPartida(String estacionPartida) {
        this.estacionPartida = estacionPartida;
    }
}
