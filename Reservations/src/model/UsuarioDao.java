package model;

import database.ConnectionDataBase;

import java.sql.SQLException;
import java.sql.Statement;



public class UsuarioDao {

	ConnectionDataBase conex = new ConnectionDataBase();

	public boolean registrarUsuario(UsuarioDto usuario) {
		boolean registrar = false;
		try {
			Statement stmt = conex.getConnection().createStatement();
			stmt.executeUpdate(
					"INSERT INTO cliente (num_ident, nombres, apellidos, edad, correo, pais_residencia, telefono, direcion, sexo) VALUES ("
							+ "'" + usuario.getNum_ident() + "'" + "," + "'" + usuario.getNombres() + "'" + "," + "'"
							+ usuario.getApellidos() + "'" + "," + usuario.getEdad() + "," + "'" + usuario.getCorreo()
							+ "'" + "," + "'" + usuario.getPais_residencia() + "'" + "," + "'" + usuario.getTelefono()
							+ "'" + "," + "'" + usuario.getDireccion() + "'" + "," + "'" + usuario.getSexo() + "'"
							+ ")");
			registrar = true;
			System.out.println(stmt);
			stmt.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return registrar;
	}

}
