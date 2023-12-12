package view;

import java.awt.Color;
import javax.swing.JFrame;

public class PantallaDatosCliente extends JFrame {

	private PanelPantallaDatosCliente pdatosclientes;

	public PantallaDatosCliente() {

		setTitle("REALIZAR RESERVA");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.white);

		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}

	private void inicializarComponentes() {
		pdatosclientes = new PanelPantallaDatosCliente();
		pdatosclientes.setBounds(5, 5, 473, 350);
		pdatosclientes.setOpaque(false);
		getContentPane().add(pdatosclientes);
	}

	public PanelPantallaDatosCliente getPdatosclientes() {
		return pdatosclientes;
	}

	public void setPdatosclientes(PanelPantallaDatosCliente pdatosclientes) {
		this.pdatosclientes = pdatosclientes;
	}

}