package Consultorio.dao;

import Consultorio.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements IDao<Odontologo>{

    private static final Logger logger = Logger.getLogger(String.valueOf(OdontologoDAOH2.class));
    private Connection getConnetion;


    @Override
    public Odontologo guardar(Odontologo odontologo) {
        logger.info("Se ejecuta el guardado de un odontologo");
        Connection connection=null;

        try {
            connection = getConnetion;

            PreparedStatement ps = connection.prepareStatement("INSERT INTO ODONTOLOGOS" +
                    "(MATRICULA, NOMBRE, APELLIDO) VALUES (?,?,?)");
           // Statement.RETURN_GENERATED_KEYS);


            ps.setInt(1,odontologo.getMatrícula());
            ps.setString(2,odontologo.getNombre());
            ps.setString(3,odontologo.getApellido());
            ps.execute();
           // ResultSet key=ps.getGeneratedKeys();
           // while (key.next()){
           //     odontologo.setMatrícula(key.getInt(1));
            //}

        }catch (Exception e){
            logger.error("No se puedo establer conexión");
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();

            }catch (Exception ex){
                ex.printStackTrace();

            }
        }
        return odontologo;
    }

    public List<Odontologo>  listar() {
        return null;
    }
    private static Connection getConnetion() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/parcial1","sa","sa");
    }

    public ArrayList<Odontologo> listarTodosLosOdontologos(){
        Connection connection=null;
        ArrayList<Odontologo> odontologos=new ArrayList<>();
        try {
            connection=getConnetion();
            PreparedStatement ps= connection.prepareStatement("SELECT * FROM ODONTOLOGOS");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){

                odontologos.add(new Odontologo(rs.getInt(2),rs.getString(3),rs.getString(4)) );
                }
            } catch (SQLException throwables) {
            throwables.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try {connection.close();

            }catch (Exception ex){
                ex.printStackTrace();
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
