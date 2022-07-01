package mesas;

import java.time.LocalDate;

public class Hotel {
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private String lugar;

    //mostramos el hotel mediante toString()
    @Override
    public String toString(){
        return "Hotel en "+lugar+"\n"+
                "Fecha entrada: "+fechaEntrada+"\n" +
                "Fecha salida: "+fechaSalida+"\n"+
                "--------------------";
    }
    public Hotel(LocalDate fechaEntrada, LocalDate fechaSalida, String lugar) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.lugar = lugar;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
