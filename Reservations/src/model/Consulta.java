package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.ConnectionDataBase;

public class Consulta {

	String result_consulta = "";

	public String RealizarConsulta(String cedula) {
		ConnectionDataBase conex = new ConnectionDataBase();
		try {
			Statement stmt = conex.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT c.nombres,r.Fecha_reserva,t.Codigo AS cod_tiquete,tr.Origen,tr.Destino,v.Codigo as cod_vuelo,cr.costo_viaje\r\n"
							+ "FROM cliente c\r\n" + "INNER JOIN reserva r ON r.Cli_res=c.Id\r\n"
							+ "INNER JOIN Tiquete t on t.Codigo = r.Tiq_res\r\n"
							+ "INNER JOIN Trayecto tr on t.Codigo = tr.Tiq_tray\r\n"
							+ "INNER JOIN Cobro Cr on t.Codigo = Cr.Tiq_cob\r\n"
							+ "inner join Vuelo V on V.Codigo = tr.Vul_tray\r\n where " + "Num_ident=" + "'" + cedula + "'");
			rs.next();
			result_consulta = "Nombres: " + rs.getString(1) + "\n" + "Fecha reserva: " + rs.getString(2) + "\n"
					+ "Codigo tiquete: " + rs.getString(3) + "\n" + "Origen: " + rs.getString(4) + "\n" + "Destino: "
					+ rs.getString(5) + "\n" + "Codigo vuelo: " + rs.getString(6) + "\n" + "Costo viaje: "
					+ rs.getString(7);

			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result_consulta;
	}

	public String RealizarConsultaConFiltro1(String cedula) {
		ConnectionDataBase conex = new ConnectionDataBase();

		try {
			Statement stmt = conex.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT c.nombres,r.Fecha_reserva,t.Codigo AS cod_tiquete,tr.Origen,tr.Destino,v.Codigo as cod_vuelo\r\n"
							+ "FROM cliente c\r\n" + "INNER JOIN reserva r ON r.Cli_res=c.Id\r\n"
							+ "INNER JOIN Tiquete t on t.Codigo = r.Tiq_res\r\n"
							+ "INNER JOIN Trayecto tr on t.Codigo = tr.Tiq_tray\r\n"
							+ "inner join Vuelo V on V.Codigo = tr.Vul_tray\r\n where " + "Num_ident=" + "'" + cedula + "'");
			rs.next();
			result_consulta = "Nombres: " + rs.getString(1) + "\n" + "Fecha reserva: " + rs.getString(2) + "\n"
					+ "Codigo tiquete: " + rs.getString(3) + "\n" + "Origen: " + rs.getString(4) + "\n" + "Destino: "
					+ rs.getString(5) + "\n" + "Codigo vuelo: " + rs.getString(6);

			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result_consulta;
	}

	public String RealizarConsultaConFiltro2(String cedula) {
		ConnectionDataBase conex = new ConnectionDataBase();

		try {
			Statement stmt = conex.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT c.nombres,r.Fecha_reserva,t.Codigo AS cod_tiquete,tr.Origen,tr.Destino,cr.costo_viaje\r\n"
							+ "FROM cliente c\r\n" + "INNER JOIN reserva r ON r.Cli_res=c.Id\r\n"
							+ "INNER JOIN Tiquete t on t.Codigo = r.Tiq_res\r\n"
							+ "INNER JOIN Trayecto tr on t.Codigo = tr.Tiq_tray\r\n"
							+ "INNER JOIN Cobro Cr on t.Codigo = Cr.Tiq_cob\r\n where " + "Num_ident=" + "'" + cedula + "'");
			rs.next();
			result_consulta = "Nombres: " + rs.getString(1) + "\n" + "Fecha reserva: " + rs.getString(2) + "\n"
					+ "Codigo tiquete: " + rs.getString(3) + "\n" + "Origen: " + rs.getString(4) + "\n" + "Destino: "
					+ rs.getString(5) + "\n" + "Costo viaje: " + rs.getString(6);

			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result_consulta;
	}

	public String RealizarConsultaConFiltro3(String cedula) {
		ConnectionDataBase conex = new ConnectionDataBase();

		try {
			Statement stmt = conex.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT c.nombres,t.Codigo AS cod_tiquete,tr.Origen,tr.Destino,v.Codigo as cod_vuelo,cr.costo_viaje\r\n"
							+ "FROM cliente c\r\n" + "INNER JOIN reserva r ON r.Cli_res=c.Id\r\n"
							+ "INNER JOIN Tiquete t on t.Codigo = r.Tiq_res\r\n"
							+ "INNER JOIN Trayecto tr on t.Codigo = tr.Tiq_tray\r\n"
							+ "INNER JOIN Cobro Cr on t.Codigo = Cr.Tiq_cob\r\n"
							+ "inner join Vuelo V on V.Codigo = tr.Vul_tray\r\n where " + "Num_ident=" + "'" + cedula + "'");
			rs.next();
			result_consulta = "Nombres: " + rs.getString(1) + "\n" + "Codigo tiquete: " + rs.getString(2) + "\n"
					+ "Origen: " + rs.getString(3) + "\n" + "Destino: " + rs.getString(4) + "\n" + "Codigo vuelo: "
					+ rs.getString(5) + "\n" + "Costo viaje: " + rs.getString(6);

			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result_consulta;
	}
}
