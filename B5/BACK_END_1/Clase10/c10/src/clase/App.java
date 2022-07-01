package clase;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static final Logger logger= Logger.getLogger(App.class);
    private List<Integer> listaEnteros;

    public App(){
        listaEnteros=new ArrayList<>();
    }

    public void agregarEntero(Integer n){
        listaEnteros.add(n);
        if (listaEnteros.size()>5){
            logger.info("La lista tiene más de 5 elementos, elementos totales: "+listaEnteros.size());
        }
        if (listaEnteros.size()>10){
            logger.info("La lista tiene más de 10 elementos, elementos totales: "+listaEnteros.size());
        }

    }

    public double calcularPromedio() throws Exception {
        if (listaEnteros.isEmpty()){
            Exception error=new Exception("La lista es igual a cero");
            logger.error("La lista es igual a cero");
            throw error;
        }
        else{
            Integer total=0;
        for (Integer i:listaEnteros) {
            total+=i;
        }
        //hacemos cast a double para que tengamos parte decimal
        double promedio=(double)total/listaEnteros.size();


        logger.info("El promedio dió: "+promedio);
        return promedio;
        }
    }


}
