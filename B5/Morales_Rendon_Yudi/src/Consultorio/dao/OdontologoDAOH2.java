package Consultorio.dao;

import Consultorio.configuration.BdConnection;
import Consultorio.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements IDao<Odontologo> {

    private static final Logger logger = Logger.getLogger(String.valueOf(OdontologoDAOH2.class));


    @Override
    public Odontologo guardar(Odontologo odontologo) {
        logger.info("Se ejecuta el guardado de un odontologo");

        try {

            PreparedStatement ps = BdConnection.getBdConnection().prepareStatement("INSERT INTO ODONTOLOGOS" +
                    "(MATRICULA, NOMBRE, APELLIDO) VALUES (?,?,?)");
            // Statement.RETURN_GENERATED_KEYS);


            ps.setInt(1, odontologo.getMatrícula());
            ps.setString(2, odontologo.getNombre());
            ps.setString(3, odontologo.getApellido());
            ps.execute();
            ResultSet key=ps.getGeneratedKeys();
             while (key.next()){
                odontologo.setMatrícula(key.getInt(1));
            }

        } catch (Exception e) {

        } finally {


            try {
                BdConnection.getBdConnection().close();
            } catch (SQLException e) {

            }


        }
        return odontologo;
    }

    public List<Odontologo> listar() {
        return null;
    }

    public ArrayList<Odontologo> listarTodosLosOdontologos() {
        ArrayList<Odontologo> odontologos = new ArrayList<>();
        try {
            PreparedStatement ps = BdConnection.getBdConnection().prepareStatement("SELECT * FROM ODONTOLOGOS");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                odontologos.add(new Odontologo(rs.getInt(2), rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (Exception e) {

        } finally {


            try {
                BdConnection.getBdConnection().close();
            } catch (SQLException e) {
            }


        }

        return odontologos;
    }

    @Override
    public void add(Odontologo odontologo) {

    }

    private void guardar(int anInt, int anInt1, String string, String string1) {
    }


}
