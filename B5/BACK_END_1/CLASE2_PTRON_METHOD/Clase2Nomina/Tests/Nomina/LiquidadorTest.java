package Nomina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {

    @Test
    public void emitirReciboEmpleadoEfectivo(){
        Liquidador liquidador= new LiquidadorEmpleadoEfectivo();
        Empleado empleado= new EmpleadoEfectivo("Martín","Martini"
                ,"CA2547889247",420.0,40,60);
        String respEsperada="La liquidación generada es un documento digital. "
                +"Sueldo a liquidar: 420.0";
        String respActual=liquidador.liquidarSueldo(empleado);
        assertEquals(respEsperada,respActual);
    }
}
