package Presencial;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SistemaTest {
    private Sistema sistema = new Sistema();


    @Test
    public void agregarPersonaTest(){
        Persona persona1 = new Persona("Juan",20);
        Persona persona2 = new Persona("Pedro",25);
        Persona persona3 = new Persona("Ana",29);
        Persona persona4 = new Persona("Luz",43);
        Persona persona5 = new Persona("Julian",37);
        sistema.agregarPersona(persona1);
        sistema.agregarPersona(persona2);
        sistema.agregarPersona(persona1);
        sistema.agregarPersona(persona1);
        sistema.agregarPersona(persona1);

        assertEquals(2,sistema.cantidadpersonas());
    }


}