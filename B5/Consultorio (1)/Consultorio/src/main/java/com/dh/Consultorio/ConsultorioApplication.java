package com.dh.Consultorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class ConsultorioApplication {

	public static void main(String[] args) {
		prepararBD();
		SpringApplication.run(ConsultorioApplication.class, args);
	}
	private static void prepararBD(){
		Connection connection=null ;
		try {
			Class.forName("org.h2.Driver");
			connection= DriverManager.getConnection("jdbc:h2:~/cam9clase23; INIT=RUNSCRIPT" +
					"FROM 'create.sql'","sa","sa");
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
		}
	}

}
