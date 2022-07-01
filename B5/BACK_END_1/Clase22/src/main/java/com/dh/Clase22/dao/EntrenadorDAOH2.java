package com.dh.Clase22.dao;

import com.dh.Clase22.dominio.Entrenador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EntrenadorDAOH2 implements IDao<Entrenador>{

    @Override
    public List<Entrenador> listarTodos() {
        Connection connection=null;
        List<Entrenador> listarEntrenadores =new ArrayList<>();
        try {
            connection=getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT *"+
            "FROM ENTRENADORES");
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                listarEntrenadores.add(new Entrenador(rs.getInt(1),rs.getString(2)));
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

        return listarEntrenadores;
    }
    private static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/cam9clase22","sa","sa");
    }
}
