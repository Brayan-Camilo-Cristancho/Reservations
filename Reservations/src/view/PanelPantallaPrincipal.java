package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class PanelPantallaPrincipal extends JLabel {
	private JLabel e_titulo;
	private JButton b_reserva, b_consulta;

	public PanelPantallaPrincipal() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setBackground(new Color(222, 222, 222));
		setBorder(new LineBorder(new Color(190, 255, 237)));

		e_titulo = new JLabel("Agencia de viajes");
		e_titulo.setForeground(Color.white);
		e_titulo.setFont(new Font("Algerian", 30, 40));
		e_titulo.setBounds(53, 100, 400, 45);
		add(e_titulo);

		b_consulta = new JButton("Realizar consulta");
		b_consulta.setActionCommand("CONSULTA");
		b_consulta.setBounds(160, 210, 155, 30);
		b_consulta.setBackground(Color.white);
		add(b_consulta);

		b_reserva = new JButton("Realizar reserva");
		b_reserva.setActionCommand("RESERVA");
		b_reserva.setBounds(160, 170, 155, 30);
		b_reserva.setBackground(Color.white);
		add(b_reserva);

	}

	public JLabel getE_titulo() {
		return e_titulo;
	}

	public void setE_titulo(JLabel e_titulo) {
		this.e_titulo = e_titulo;
	}

	public JButton getB_reserva() {
		return b_reserva;
	}

	public void setB_reserva(JButton b_reserva) {
		this.b_reserva = b_reserva;
	}

	public JButton getB_consulta() {
		return b_consulta;
	}

	public void setB_consulta(JButton b_consulta) {
		this.b_consulta = b_consulta;
	}

}
