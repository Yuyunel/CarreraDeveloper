package Presencial;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Persona>  perosnas;

    public  Sistema(){
        perosnas = new ArrayList<>();
    }
    public void agregarPersona(Persona persona){
        if (persona.esMayorEdad()&&persona.siNombreMayorIgual5Lrtras())
            personas.add(persona);
        else
            System.out.println("No se puede agregar a "+ persona.getNombre());

    }
    public  int cantidadpersonas(){
        return perosnas.size();
    }
}
