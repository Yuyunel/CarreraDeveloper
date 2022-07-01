package Presencial;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        // 1- crear la coleccion de empleados
        List<Empleado> listaDeEmpleados = new ArrayList<>();
        //1.2- cragar la coleccion con empleados
        listaDeEmpleados.add(new Empleado("Yudi","Morales",123,2500.0));
        listaDeEmpleados.add(new Empleado("Angel","Cuellar",456,600.5));
        listaDeEmpleados.add(new Empleado("Jhonatan","Cuellar",876,2300.4));
        listaDeEmpleados.add(new Empleado("Fiore","Tapiero",765,543.9));
        listaDeEmpleados.add(new Empleado("Win","Savogal",987,135.9));
        listaDeEmpleados.add(new Empleado("Emely","Hernandez",321,123.0));
        listaDeEmpleados.add(new Empleado("Clara","Matriorca",654,2500.0));
        listaDeEmpleados.add(new Empleado("Carla","Espada",379,567.9));
        // 2- guardar la coleccion creada en un archivo
        FileOutputStream fos = null;
        try {
            fos =new FileOutputStream("Empleados.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            // recordar que debemos guardar
            //ver el formato
            for (Empleado empleado: listaDeEmpleados) {
                //preparar la linea para su guardado, siguiendo el formato
                String linea=empleado.getNombre()+ ";" + empleado.getApellido() +";" + empleado.getLegajo()+ ";" +
                        empleado.getSueldo()+ "\n";
                //ordenar la escritura al buffer
                bos.write(linea.getBytes());

            }
            bos.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        // 3-verificarq ue se cumpla con el formasto mediante la apertura el formato
    }
}
