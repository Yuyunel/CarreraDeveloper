package Nomina;

public class LiquidadorEmpleadoContratato extends Liquidador{

    @Override
    protected double calcularSueldo(Empleado empleado){
        double respuesta= 0;
        if (empleado instanceof EmpleadoContratado){
            EmpleadoContratado emp =(EmpleadoContratado) empleado;
            respuesta = emp.getCantidadHora()*emp.getValorHoras();
        }
        return respuesta;
    }
    @Override
    protected String emitirRecibo(Empleado empleado){
        return "La liquidacion generada es un documento en papel.";
    }
}