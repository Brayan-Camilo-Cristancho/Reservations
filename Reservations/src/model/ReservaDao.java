	 package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import database.ConnectionDataBase;

public class ReservaDao {

	ConnectionDataBase conex = new ConnectionDataBase();

	public boolean registrarReserva() {
		boolean registrar = false;
		try {
			Statement stmt = conex.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT count(*) FROM cliente");
			rs.next();
			int cli_res = Integer.parseInt(rs.getString(1));

			ResultSet rs1 = stmt.executeQuery("SELECT count(*) FROM tiquete");
			rs1.next();
			int tiq_res = Integer.parseInt(rs1.getString(1));

			LocalDate todaysDate = LocalDate.now();
			stmt.executeUpdate("INSERT INTO reserva (Fecha_reserva, Cli_res, Tiq_res) VALUES (" + "'" + todaysDate + "'"
					+ "," + cli_res + "," + tiq_res + ")");
			registrar = true;
			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return registrar;
	}

}
