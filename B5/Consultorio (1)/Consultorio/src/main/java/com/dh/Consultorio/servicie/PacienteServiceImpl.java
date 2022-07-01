package com.dh.Consultorio.servicie;

import com.dh.Consultorio.dao.IDao;
import com.dh.Consultorio.dao.PacineteDAOH2;
import com.dh.Consultorio.dominio.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PacienteServiceImpl implements IPacienteServiceInterface{
    private IDao<Paciente> pacienteIDao;

    @Autowired
    public PacienteServiceImpl(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    @Override
    public List<Paciente> listarPacientes() {
        IDao<Paciente> pacienteIDao = new PacineteDAOH2();
        return pacienteIDao.listarElemnetos();
    }

    @Override
    public Paciente buscarXEmail(String email) {
        IDao<Paciente> pacienteIDao=new PacineteDAOH2();
        return pacienteIDao.buscarXCriterio(email);
    }

    @Override
    public Paciente buscarXId(int id) {
        IDao<Paciente> pacienteIDao=new PacineteDAOH2();
        return pacienteIDao.buscarXId(id);
    }

    @Override
    public Paciente guardarPaciente(Paciente paciente) {
        IDao<Paciente> pacienteIDao =new PacineteDAOH2();
        return pacienteIDao.guardar(paciente);
    }

    @Override
    public Paciente actualizarPaciente(Paciente paciente) {
        IDao<Paciente> pacienteIDao =new PacineteDAOH2();
        return pacienteIDao.actualizar(paciente);
    }
}
