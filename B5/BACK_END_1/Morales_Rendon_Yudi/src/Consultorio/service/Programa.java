package Consultorio.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class Programa {
    public static void main(String[] args) {
        Connection connection=null;
        try {
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection("jdbc:h2:~/"
                    +"parcial1_MoralesRendon;INIT=RUNSCRIPT FROM 'create.sql'","sa","sa");

        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
