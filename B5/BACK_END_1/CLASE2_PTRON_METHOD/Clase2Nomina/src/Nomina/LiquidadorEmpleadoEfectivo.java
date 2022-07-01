package Nomina;

public class LiquidadorEmpleadoEfectivo extends Liquidador{

    @Override
    protected  double calcularSueldo(Empleado empleado){
        double respuesta=0;
        if (empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo emp = (EmpleadoEfectivo) empleado;
            respuesta = emp.getSueldoBase()+ emp.getPremios()- emp.getDescuentos();

        }
        return respuesta;
    }
   @Override
    protected String emitirRecibo(Empleado empleado){
        return "La liquidacion generada es un documento digital";
   }
}
