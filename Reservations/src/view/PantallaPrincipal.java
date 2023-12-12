package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class PantallaPrincipal extends JFrame {

	private PanelPantallaPrincipal principal;

	public PantallaPrincipal() {

		setTitle("�BIENVENIDO!");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.darkGray);

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {

		principal = new PanelPantallaPrincipal();
		principal.setBounds(5, 5, 475, 350);
		principal.setOpaque(false);
		getContentPane().add(principal);

	}

	public PanelPantallaPrincipal getPrincipal() {
		return principal;
	}

	public void setPrincipal(PanelPantallaPrincipal principal) {
		this.principal = principal;
	}

}