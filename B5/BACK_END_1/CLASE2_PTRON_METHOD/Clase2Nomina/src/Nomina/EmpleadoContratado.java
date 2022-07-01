package Nomina;

public class EmpleadoContratado  extends Empleado{
    private int cantidadHora;
    private double valorHoras;

    public EmpleadoContratado(String nombre, String apellido, String numeroCuenta, int cantidadHora, double valorHoras) {
        super(nombre, apellido, numeroCuenta);
        this.cantidadHora = cantidadHora;
        this.valorHoras = valorHoras;
    }

    public int getCantidadHora() {
        return cantidadHora;
    }

    public void setCantidadHora(int cantidadHora) {
        this.cantidadHora = cantidadHora;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
}
