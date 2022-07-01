package com.dh.Consultorio.controller;

import com.dh.Consultorio.dominio.Paciente;
import com.dh.Consultorio.servicie.IPacienteServiceInterface;
import com.dh.Consultorio.servicie.PacienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//usamos controller cuando tenemos vistas

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private PacienteServiceImpl pacienteService;

    @Autowired
    public PacienteController(PacienteServiceImpl pacienteService) {
        this.pacienteService = pacienteService;
    }
    @GetMapping
    public List<Paciente> traerPacientes(){
        return pacienteService.listarPacientes();
    }

    @GetMapping("/{id}")
    public Paciente traerPacientePorId(@PathVariable("id")int id){
        return pacienteService.buscarXId(id);

    }
    @PostMapping
    public Paciente resgistarNuevoPaciente(@RequestBody Paciente paciente){
        return pacienteService.guardarPaciente(paciente);
    }






   /* @GetMapping("/paciente")
    public String traerPacienteXEmail(Model model, @RequestParam("email") String email){
        //buscar al paciente con el correo infresado por parametro
        Paciente paciente=pacienteService.buscarXEmail(email);
        model.addAttribute("nombre",paciente.getNombre());
        model.addAttribute("apellido",paciente.getApellido());
        return "paciente";
    }*/
}
