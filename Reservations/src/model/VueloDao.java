package model;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import database.ConnectionDataBase;

public class VueloDao {

	ConnectionDataBase conex;
	ArrayList<String> empresa;
	String codigo = "";

	public VueloDao() {
		conex = new ConnectionDataBase();
		empresa = new ArrayList<>();
		empresa.add("Avianca");
		empresa.add("COPA AIRLINES");
		empresa.add("VIVA AIR");
		empresa.add("SKYSCANNER");
		empresa.add("LATAM");
		empresa.add("LANSA");
		empresa.add("LANCO");
		empresa.add("WINGO");
	}

	public boolean registrarVuelo(Date fechavuelo) {
		boolean registrar = false;
		try {
			int valor = (int) (Math.random() * empresa.size());
			int numerovuelo = (int) (Math.random() * 999 + 100);
			String nombreempresa = empresa.get(valor);
			Statement stmt = conex.getConnection().createStatement();
			codigo = nombreempresa.substring(0, 2) + "-" + numerovuelo;
			LocalDate todaysDate = LocalDate.now();

			stmt.executeUpdate("INSERT INTO vuelo VALUES (" + "'" + codigo + "'" + "," + "'" + nombreempresa + "'" + ","
					+ numerovuelo + "," + "'" + fechavuelo + "'" + ")");
			registrar = true;
			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return registrar;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
