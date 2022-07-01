package service;

import Consultorio.dao.OdontologoDAOH2;
import Consultorio.model.Odontologo;
import Consultorio.service.OdontologoService;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OdontologoServiceTest {

    @Test
    public void AgregarYGuardarOdontologo() {
        Odontologo odontologo1 = new Odontologo(123, "Yudi", "Morales");
        Odontologo odontologo2 = new Odontologo(456, "Angel", "Cuellar");
        Odontologo odontologo3 = new Odontologo(567, "Eliza", "Rendon");
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());
        Odontologo odontologoGuardado = odontologoService.guardarOdontologo(odontologo1);

        assertNotNull(odontologoGuardado);
       assertEquals("Yudi", odontologoGuardado.getNombre());

    }


    @Test
    public void listarTodosLosOdontologosTest() {
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());

        List<Odontologo> odontologoList = odontologoService.listarTodosLosOdontologos();
        for (Odontologo o : odontologoList) {
            System.out.println(o.getMatrícula());
        }

        assertTrue(odontologoList.size() > 0);

    }


}




