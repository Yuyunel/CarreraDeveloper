package Consultorio.service;

import Consultorio.dao.IDao;
import Consultorio.model.Odontologo;

import java.util.ArrayList;

public class OdontologoService {

    private IDao<Odontologo> odontologoDao;

    public OdontologoService(IDao<Odontologo> odontologoDao) {
        this.odontologoDao = odontologoDao;
    }
    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoDao.guardar(odontologo);
    }
    public ArrayList<Odontologo> listarTodosLosOdontologos(){
        return odontologoDao.listarTodosLosOdontologos();

    }
}
