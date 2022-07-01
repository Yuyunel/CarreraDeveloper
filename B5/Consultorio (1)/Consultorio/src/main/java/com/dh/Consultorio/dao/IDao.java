package com.dh.Consultorio.dao;

import java.util.List;

public interface IDao <T>{
    List<T> listarElemnetos();

    T buscarXCriterio(String citerio);

    T buscarXId(int id);

    void eliminar(int id);

    T actualizar (T t);

    T guardar(T t);
}
