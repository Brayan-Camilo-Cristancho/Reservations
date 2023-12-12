package view;

import java.awt.Color;
import javax.swing.JFrame;

public class PantallaDatosReserva extends JFrame {

	private PanelPantallaDatosReserva pdreserva;

	public PantallaDatosReserva() {

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
		pdreserva = new PanelPantallaDatosReserva();
		pdreserva.setBounds(5, 5, 473, 350);
		pdreserva.setOpaque(false);
		getContentPane().add(pdreserva);
	}

	public PanelPantallaDatosReserva getPdreserva() {
		return pdreserva;
	}

	public void setPdreserva(PanelPantallaDatosReserva pdreserva) {
		this.pdreserva = pdreserva;
	}

}