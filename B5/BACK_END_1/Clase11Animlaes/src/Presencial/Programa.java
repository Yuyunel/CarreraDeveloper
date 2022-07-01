package Presencial;

import java.sql.*;

public class Programa {
    public static void main(String[] args) {
        String sql_create="DROP TABLE IF EXISTS ANIMALES; "+
                "CREATE TABLE ANIMALES" +
                "(" +
                "ID INT PRIMARY KEY ," +
                "NOMBRE varchar(100) NOT NULL," +
                "TIPO varchar(100) NOT NULL" +
                ")";
        String sql_insert1="INSERT INTO ANIMALES (ID, NOMBRE, TIPO)" +
                "VALUES (1, 'Manchas' , 'perro');";
        String sql_insert2="INSERT INTO ANIMALES (ID, NOMBRE, TIPO)" +
                "VALUES (2, 'luna' , 'perro');";
        String sql_insert3="INSERT INTO ANIMALES (ID, NOMBRE, TIPO)" +
                "VALUES (3, 'Bobby' , 'perro');";
        String sql_insert4="INSERT INTO ANIMALES (ID, NOMBRE, TIPO)" +
                "VALUES (4, 'Tom' , 'perro');";
        String sql_insert5="INSERT INTO ANIMALES (ID, NOMBRE, TIPO)" +
                "VALUES (5, 'Bigotes' , 'gato');";

        String sql_delete="DELETE FROM ANIMALES WHERE ID=3";
        String sql_select="SELECT * FROM ANIMALES";
        Connection connection=null;

        Connection connection = null;
        try {
            //conectarme a la base de satos
            connection = getConnection();
            // crear la tabla de BD
            Statement statement=connection.createStatement();
            statement.execute(sql_create);
            // agregar a 5 animales
            Statement statement1=connection.createStatement();
            statement1.execute(sql_insert1);
            //consultar los animales
            ResultSet rs=statement1.executeQuery(sql_select);
            while (rs.next()){
                System.out.println(rs.getInt(1)+"-" +rs.getString(2)+
                        "-"+rs.getString(3));
            }
            //borrar a Bobby
            statement1.execute(sql_delete);


        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Diver");
        return DriverManager.getConnection("jdbc:h2:~/cam9clase11","sa","sa");

    }
}
