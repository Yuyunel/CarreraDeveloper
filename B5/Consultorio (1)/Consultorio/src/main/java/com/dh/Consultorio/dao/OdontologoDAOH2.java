package com.dh.Consultorio.dao;

import com.dh.Consultorio.dominio.Odontologo;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Component
public class OdontologoDAOH2 implements IDao<Odontologo>{
    @Override
    public List<Odontologo> listarElemnetos() {
        Connection connection =null;
        List<Odontologo> listarOdontologos=new ArrayList<>();
        Odontologo odontologo;
        try {
            connection=H2Aux.getConnection();
            PreparedStatement ps= connection.prepareStatement("SELECT * FROM" +
                    "ODONTOLOGOS");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                odontologo = new Odontologo(rs.getInt(1),rs.getString(2),
                        rs.getString(3),rs.getInt(4));
                listarOdontologos.add(odontologo);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return listarOdontologos;
    }

    @Override
    public Odontologo buscarXCriterio(String citerio) {
        return null;
    }

    @Override
    public Odontologo buscarXId(int id) {
        Connection connection =null;
        Odontologo odontologo = null;
        try {
            connection=H2Aux.getConnection();
            PreparedStatement ps= connection.prepareStatement("SELECT * " +
                    "FROM ODONTOLOGOS WHERE ID=?");
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                odontologo = new Odontologo(rs.getInt(1),rs.getString(2),
                        rs.getString(3),rs.getInt(4));

            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return odontologo;    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public Odontologo actualizar(Odontologo odontologo) {
        return null;
    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        return null;
    }
}
