package Consultorio.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class BdConnection {

    private static Connection connection;

    private BdConnection() {

    }

    public static Connection getBdConnection() {
        if (connection == null) {
            try {
                Class.forName("org.h2.Driver");
                return connection = DriverManager.getConnection("jdbc:h2:mem:parcial1_MoralesRendon;DB_CLOSE_ON_EXIT=FALSE;INIT=RUNSCRIPT"
                        + " FROM 'create.sql'", "sa", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
