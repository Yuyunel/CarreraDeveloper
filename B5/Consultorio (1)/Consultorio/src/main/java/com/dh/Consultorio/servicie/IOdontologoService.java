package com.dh.Consultorio.servicie;

import com.dh.Consultorio.dominio.Odontologo;

import java.util.List;

public interface IOdontologoService {
    List<Odontologo> listarOdontologos();
    Odontologo buscarXId(int id);
}
