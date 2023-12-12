package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionDataBase;

public class TrayectoDao {

	ConnectionDataBase conex = new ConnectionDataBase();

	public boolean registrarTrayecto(String origen, String destino, String vul_tray) {
		boolean registrar = false;
		try {
			Statement stmt = conex.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT count(*) FROM tiquete");
			rs.next();
			int tiq_tray = Integer.parseInt(rs.getString(1));
			stmt.executeUpdate("INSERT INTO trayecto (Vul_tray, Tiq_tray, Origen, Destino) VALUES (" + "'" + vul_tray + "'" + "," + tiq_tray + "," + "'"
					+ origen + "'" + "," + "'" + destino + "'" + ")");
			registrar = true;
			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return registrar;
	}

}
