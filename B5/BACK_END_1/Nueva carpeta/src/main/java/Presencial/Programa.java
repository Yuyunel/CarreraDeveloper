package Presencial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        //1-preparar nuestra coleccion de perritos

        List<Perro> perros =new ArrayList<>();
        perros.add(new  Perro("Thor",5));
        perros.add(new  Perro("Lulu",2));
        perros.add(new  Perro("Loki",10));
        perros.add(new  Perro("Odin",7));
        perros.add(new  Perro("Sacha",1));
        perros.add(new  Perro("Bruno",12));
        perros.add(new  Perro("Manchas",5));

        //2-Guardar la coleccion en un determinado Archivo
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("PerrosFile.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(perros);
            oos.close();


        }catch (Exception e){
            e.printStackTrace();
        }


        //3-Recuperar la coleccion desde el archivo creado en 2

        List<Perro> perrosRecuperados=null;
        FileInputStream fis=null;

        try {
            fis=new FileInputStream("PerrosFile.txt");
            ObjectInputStream ois =new ObjectInputStream(fis);
            perrosRecuperados=(ArrayList)ois.readObject();
            ois.close();

        }catch (Exception e){
            e.printStackTrace();

        }
        //3 bis Mostrar la coleccion recuperada dede el archivo
        for (Perro perro:perrosRecuperados){
            System.out.println("Nombre: "+ perro.getNombre()+ " edad  " + perro.getEdad());
        }

    }
}
