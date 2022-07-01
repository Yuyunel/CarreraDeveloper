package com.dh.Consultorio.servicie;

import com.dh.Consultorio.dao.IDao;
import com.dh.Consultorio.dominio.Odontologo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoServiceImpl implements IOdontologoService{
    private IDao<Odontologo> odontologoIDao;

    @Autowired
    public OdontologoServiceImpl(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        return odontologoIDao.listarElemnetos();
    }

    @Override
    public Odontologo buscarXId(int id) {
        return odontologoIDao.buscarXId(id);
    }
}
