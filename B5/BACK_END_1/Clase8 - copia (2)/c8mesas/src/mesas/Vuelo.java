package mesas;

import java.time.LocalDate;

public class Vuelo {
    private LocalDate fecha;
    private String origen;
    private String destino;

    //vamos a usar toString() para mostrar de el vuelo
    @Override
    public String toString(){
        return "Vuelo\n"
                +"Fecha: "+fecha
                +"Origen: "+origen
                +"Destino: "+destino
                +"--------------------------";
    }
    public Vuelo(LocalDate fecha, String origen, String destino) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
