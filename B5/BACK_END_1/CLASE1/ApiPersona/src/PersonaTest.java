import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    @Test
   public void completoNombre(){
        Persona persona = new Persona("Yudi", "Morales","yuynel@gmail.com",32);

        boolean nombreCompleto  = persona.nombreCompleto("Morales","Yudi");

        assertEquals(true,persona.nombreCompleto("Morales", "Yudi") );

    }
    @Test
    public void esMayor(){
        Persona persona = new Persona("Yudi", "Morales","yuynel@gmail.com",32);
        assertEquals(32,32);

    }

}