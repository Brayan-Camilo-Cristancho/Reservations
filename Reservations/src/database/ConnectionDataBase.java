package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionDataBase {

	static String bd = "database_reservation_system";
	static String login = "postgres";
	static String password = "123456";
	static String url = "jdbc:postgresql://localhost/" + bd;

	Connection connection = null;

	public static void main(String[] args) {
		ConnectionDataBase si;
		si = new ConnectionDataBase();

	}

	public ConnectionDataBase() {
		try {

			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, login, password);

		} catch (SQLException e) {
			System.out.println(e);
			JOptionPane.showInternalMessageDialog(null,"Error con la base de datos");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			JOptionPane.showInternalMessageDialog(null,"Error con la base de datos");
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showInternalMessageDialog(null,"Error con la base de datos");
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void desconectar() {
		connection = null;
	}

}