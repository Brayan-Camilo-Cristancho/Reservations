package view;

import java.awt.Color;

import javax.swing.JFrame;

public class PantallaConsulta extends JFrame {

	private PanelPantallaConsulta ppantallaconsulta;

	public PantallaConsulta() {

		setTitle("�CONSULTA!");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.lightGray);

		inicializarComponentes();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}

	private void inicializarComponentes() {

		ppantallaconsulta = new PanelPantallaConsulta();
		ppantallaconsulta.setBounds(10, 10, 765, 540);
		ppantallaconsulta.setOpaque(false);
		getContentPane().add(ppantallaconsulta);

	}

	public PanelPantallaConsulta getPpantallaconsulta() {
		return ppantallaconsulta;
	}

	public void setPpantallaconsulta(PanelPantallaConsulta ppantallaconsulta) {
		this.ppantallaconsulta = ppantallaconsulta;
	}

}