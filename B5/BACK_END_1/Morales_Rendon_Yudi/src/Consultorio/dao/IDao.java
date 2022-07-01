package Consultorio.dao;

import Consultorio.model.Odontologo;

import java.util.ArrayList;

public interface IDao <T>{
    T guardar(T t);

     ArrayList<Odontologo> listarTodosLosOdontologos();

    void add(Odontologo odontologo);
}
