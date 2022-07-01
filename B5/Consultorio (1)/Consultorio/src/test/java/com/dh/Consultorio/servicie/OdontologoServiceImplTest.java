package com.dh.Consultorio.servicie;

import com.dh.Consultorio.dao.OdontologoDAOH2;
import com.dh.Consultorio.dominio.Odontologo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceImplTest {
    @BeforeAll
    public static void prepararBD(){
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection("jdbc:h2:~/cam9clase23"+
                    ";INIT=RUNSCRIPT FROM 'create.sql'","sa","sa");


        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
    @Test
    public void listarOdontologos(){

        OdontologoServiceImpl odontologoService=new OdontologoServiceImpl(new OdontologoDAOH2());
        List<Odontologo> listaDePrueba=odontologoService.listarOdontologos();
        assertTrue(listaDePrueba.size()>0);
    }
    @Test
    public void buscarXId(){
        OdontologoServiceImpl odontologoService= new OdontologoServiceImpl(new OdontologoDAOH2());
        int idBuscado=1;
        Odontologo odontologoDePrueba=odontologoService.buscarXId(idBuscado);
        assertTrue(odontologoDePrueba!=null);
    }
}