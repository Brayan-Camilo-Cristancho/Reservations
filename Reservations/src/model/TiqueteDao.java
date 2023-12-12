package model;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import database.ConnectionDataBase;

public class TiqueteDao {

	ConnectionDataBase conex = new ConnectionDataBase();

	public boolean registrarTiquete(Date fecha) {
		boolean registrar = false;
		try {
			Statement stmt = conex.getConnection().createStatement();
			stmt.executeUpdate("INSERT INTO tiquete (Fecha_emision) VALUES (" + "'" + fecha + "'" + ")");
			registrar = true;
			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return registrar;
	}

}
