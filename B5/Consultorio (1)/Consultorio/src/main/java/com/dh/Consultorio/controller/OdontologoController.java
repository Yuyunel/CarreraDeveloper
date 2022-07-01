package com.dh.Consultorio.controller;

import com.dh.Consultorio.dominio.Odontologo;
import com.dh.Consultorio.servicie.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/odontologo")
public class OdontologoController {
    private IOdontologoService odontologoService;

    @Autowired
    public OdontologoController(IOdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }
    @GetMapping
    public String traerOdontologoXId(Model model, @RequestParam("id")int id){
        Odontologo odontologo= odontologoService.buscarXId(id);
        model.addAttribute("matricula", odontologo.getMatricula());
        return "odontologo";

    }
}
