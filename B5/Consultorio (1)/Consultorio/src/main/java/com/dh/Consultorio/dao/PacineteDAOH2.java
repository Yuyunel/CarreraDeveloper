package com.dh.Consultorio.dao;

import com.dh.Consultorio.dominio.Domicilio;
import com.dh.Consultorio.dominio.Paciente;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PacineteDAOH2 implements IDao<Paciente>{
    @Override
    public List<Paciente> listarElemnetos() {
        Connection connection=null;
        List<Paciente> listarPacientes=new ArrayList<>();
        Paciente paciente = null;
        Domicilio domicilio;
        try {
            connection=H2Aux.getConnection();
            PreparedStatement ps= connection.prepareStatement("SELECT *" + "FROM PACIENTES");
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
                domicilio=domicilioDAOH2.buscarXId(rs.getInt(7));
                paciente=new Paciente(rs.getInt(1),rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),rs.getInt(5),
                        rs.getDate(6).toLocalDate(),domicilio);
                //ahora tenemos que agregarlo al listado
                listarPacientes.add(paciente);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }return listarPacientes;
    }

    @Override
    public Paciente buscarXCriterio(String email) {
        Connection connection=null;
        Paciente paciente = null;
        Domicilio domicilio;
        try {
            connection=H2Aux.getConnection();
            PreparedStatement ps= connection.prepareStatement("SELECT *" + "FROM PACIENTES WHERE EMAIL=?");
            ps.setString(1,email);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
                domicilio=domicilioDAOH2.buscarXId(rs.getInt(7));
                paciente=new Paciente(rs.getInt(1),rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),rs.getInt(5),
                        rs.getDate(6).toLocalDate(),domicilio);

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }return paciente;
    }

    @Override
    public Paciente buscarXId(int id) {
        Connection connection=null;
        Paciente paciente = null;
        Domicilio domicilio;
        try {
            connection=H2Aux.getConnection();
            PreparedStatement ps= connection.prepareStatement("SELECT *" + "FROM PACIENTES WHERE ID=?");
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                DomicilioDAOH2 domicilioDAOH2 = new DomicilioDAOH2();
                domicilio=domicilioDAOH2.buscarXId(rs.getInt(7));
                paciente=new Paciente(rs.getInt(1),rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),rs.getInt(5),
                        rs.getDate(6).toLocalDate(),domicilio);

            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }return paciente;
    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public Paciente actualizar(Paciente paciente) {
        return null;
    }

    @Override
    public Paciente guardar(Paciente paciente) {
        Connection connection=null;
        try {
            connection=H2Aux.getConnection();
            //guardar el domicilio
            DomicilioDAOH2 domicilioDAOH2 =new DomicilioDAOH2();
            domicilioDAOH2.guardar(paciente.getDomicilio());
            PreparedStatement ps= connection.prepareStatement("INSERT INTO" +
                    "PACIENTES(NOMBRE, APELLIDO, EMAIL, DNI, FECHA_INGRESO,"+
                    "DOMICILIO_ID)VALUES (?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getNombre());
            ps.setString(3, paciente.getEmail());
            ps.setInt(4,paciente.getDni());
            ps.setDate(5, Date.valueOf(paciente.getFechaIngreso()));
            ps.setInt(6,paciente.getDomicilio().getId());
            ps.execute();
            ResultSet keys=ps.getGeneratedKeys();
            while (keys.next()){
                paciente.setId(keys.getInt(1));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return paciente;
    }
}
