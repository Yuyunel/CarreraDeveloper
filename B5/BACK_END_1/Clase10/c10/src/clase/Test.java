package clase;

import org.apache.log4j.Logger;

public class Test {
    
    public static void main(String[] args) {
        App aplicacion= new App();
        try {
            aplicacion.calcularPromedio();
            aplicacion.agregarEntero(10);
            aplicacion.agregarEntero(15);
            aplicacion.calcularPromedio();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        aplicacion.agregarEntero(10);
        aplicacion.agregarEntero(15);

        try {
            aplicacion.calcularPromedio();
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
