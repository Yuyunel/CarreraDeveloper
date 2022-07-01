package com.dh.Consultorio.servicie;

import com.dh.Consultorio.dominio.Paciente;

import java.util.List;

public interface IPacienteServiceInterface {
    List<Paciente> listarPacientes();
    Paciente buscarXEmail(String email);
    Paciente buscarXId(int id);
    Paciente guardarPaciente(Paciente paciente);
    Paciente actualizarPaciente(Paciente paciente);
}
