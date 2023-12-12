package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import database.ConnectionDataBase;

public class CobroDao {

	ConnectionDataBase conex = new ConnectionDataBase();

	public boolean registrarCobro(String categoria) {
		boolean registrar = false;
		try {

			Statement stmt = conex.getConnection().createStatement();
			LocalDate todaysDate = LocalDate.now();
			String SQL = "SELECT count(*) FROM tiquete";
			int costoadicional = 0;
			if (categoria.equals("Negocios")) {
				costoadicional = 1000000;
			} else {
				costoadicional = 500000;
			}
			int costototal = (int) (Math.random() * 5000000 + 1000000) + costoadicional;

			ResultSet rs = stmt.executeQuery(SQL);
			rs.next();
			int tiq_cobro = Integer.parseInt(rs.getString(1));
			stmt.executeUpdate("INSERT INTO cobro (Tiq_cob,Categoria, Costo_adicional, Costo_viaje) VALUES("
					+ tiq_cobro + "," + "'" + categoria + "'" + "," + costoadicional + "," + costototal + ")");
			registrar = true;
			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return registrar;
	}

}
