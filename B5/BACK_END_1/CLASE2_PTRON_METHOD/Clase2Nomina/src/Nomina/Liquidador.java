package Nomina;

public abstract class Liquidador {
    public String liquidarSueldo(Empleado empleado){
        String respuesta = "La liquidacion no pudo ser calculada";
        // calcular sueldo
        double sueldo = calcularSueldo((empleado));
        if(sueldo >0){
            //emitir recibo
            String recibo = emitirRecibo(empleado);
            System.out.println(depositarSueldo(empleado));
            respuesta= recibo+"saldo a liquidar" + sueldo;
            // depositar el sueldo
        }
        //retornar
        return respuesta;
    }
    protected abstract double calcularSueldo(Empleado empleado);
    protected abstract String emitirRecibo(Empleado empleado);


    private String depositarSueldo(Empleado empleado){
        return "Orden de depostio en la cuenta "+ empleado.getNumeroDeCuenta();

    }
}
