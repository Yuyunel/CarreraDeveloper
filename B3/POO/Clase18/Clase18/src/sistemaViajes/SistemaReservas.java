package sistemaViajes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SistemaReservas {
    // atributos
    public List<Reserva> reservas;

    // constructor
    public SistemaReservas() {
        this.reservas = new ArrayList<>();
    }

    // métodos
    public double recaudacionTotal(){
        double totalRecaudado = 0;
        for (Reserva r : reservas){
            totalRecaudado += r.precioReserva();
        }
        return totalRecaudado;
    }

    public int cantVecesRecorridas(String estacion) throws Exception {
        // lista de estaciones
        List<String> estaciones = Arrays.asList("Buenos Aires", "Luján", "Mercedes", "Suipacha", "Chivilcoy", "Alberti", "Bragado");
        int cont = 0;
        if (estaciones.contains(estacion)){
            // si la estacion existe entre las estaciones de la lista
            for (Reserva r : reservas) {
                if (r.getRecorrido().getEstacionDestino().equals(estacion) || r.getRecorrido().getEstacionPartida().equals(estacion)) {
                    cont += r.getPersonas();
                }
            }
        } else {
            // si no existe la estacion en la lista
            throw new Exception("ERROR. La estación especificada no existe en nuestro sistema.");
        }
        return cont;
    }

    // getters y setters
    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
}
