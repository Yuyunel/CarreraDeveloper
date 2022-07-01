import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Contactos> contactos = new ArrayList<>();
        //crear lista
        contactos.add(new Contactos("Yudi","yuyu@gmail.com",123));
        contactos.add(new Contactos("Angel","ange@gmail.com",456));
        contactos.add(new Contactos("Martin","marti@gmail.com",789));
        contactos.add(new Contactos("Lupe","lupe@gmail.com",321));
        contactos.add(new Contactos("Lola","lola@gmail.com",357));
        contactos.add(new Contactos("Camilo","cami@gmail.com",127));


        //Guardar la coleccion
        FileOutputStream fos = null;

        try {
            fos=new FileOutputStream("ContactosFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contactos);
            fos.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        //Recuperar la coleccion
        List<Contactos> contactosRecuoerados = null;
        FileInputStream fis = null;
        try {
            fis= new FileInputStream("ContactosFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            contactosRecuoerados=(ArrayList)ois.readObject();
            ois.close();

        }catch (Exception e){
            e.printStackTrace();
        }
       //Muestro lista
        for (Contactos contacto: contactosRecuoerados){
            System.out.println("Nombre: " +contacto.getNombre()+ " email: "+ contacto.getEmail()+ "  Telefono: "+contacto.getTelefono());


        }





    }




}
