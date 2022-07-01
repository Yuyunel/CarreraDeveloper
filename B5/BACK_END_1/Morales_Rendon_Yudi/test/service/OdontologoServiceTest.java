package service;

import Consultorio.dao.OdontologoDAOH2;
import Consultorio.model.Odontologo;
import Consultorio.service.OdontologoService;
import org.junit.Test;
import org.junit.jupiter.api.Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class OdontologoServiceTest {
    @Test
    @Order(1)
    public void AgregarYGuardarOdontologo(){

        Connection connection=null;
        try {
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection("jdbc:h2:~/parcial1_MoralesRendon;INIT=RUNSCRIPT"
                    +" FROM 'create.sql'","sa","sa");
        }catch (Exception e){
            e.printStackTrace();
        }
        Odontologo odontologo1=new Odontologo(123,"Yudi", "Morales");
        Odontologo odontologo2 =new Odontologo(456,"Angel","Cuellar");
        OdontologoService odontologoService =new OdontologoService(new OdontologoDAOH2());
        odontologoService.guardarOdontologo(odontologo1);
        odontologoService.guardarOdontologo(odontologo2);
    }


    @Test
    @Order(2)

    public void listarTodosLosOdontologosTest(){
        OdontologoService odontologoService =new OdontologoService(new OdontologoDAOH2());

        List<Odontologo> odontologoList=odontologoService.listarTodosLosOdontologos();
        for (Odontologo o:odontologoList){
            System.out.println(o.getMatrícula());

        }
        assertTrue(odontologoList.size()>0);

    }




    }




