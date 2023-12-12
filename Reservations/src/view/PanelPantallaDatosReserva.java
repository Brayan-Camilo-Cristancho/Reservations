package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelPantallaDatosReserva extends JPanel {

	private JTextField jorigen, jdestino, jfecha;
	private JLabel h_titulo, jlorigen, jldestino, jlfecha, jlcategoria;
	private JRadioButton br_Disponible;
	private JComboBox<String> jccategoria;
	private JButton b_verificar, b_volver;

	public PanelPantallaDatosReserva() {

		inicializarComponentes();
		setLayout(null);

	}

	public void inicializarComponentes() {
		setBorder(new LineBorder(Color.black));

		h_titulo = new JLabel("Datos viaje");
		h_titulo.setFont(new Font("Algerian", 60, 30));
		h_titulo.setBounds(150, 15, 320, 45);
		add(h_titulo);

		jlorigen = new JLabel("Origen: ");
		jlorigen.setFont(new Font("Calibri", 30, 15));
		jlorigen.setBounds(30, 100, 125, 20);
		add(jlorigen);

		jorigen = new JTextField();
		jorigen.setBounds(160, 100, 100, 20);
		jorigen.setBorder(new LineBorder(null));
		jorigen.setEditable(true);
		add(jorigen);

		jldestino = new JLabel("Destino : ");
		jldestino.setFont(new Font("Calibri", 30, 15));
		jldestino.setBounds(30, 140, 110, 20);
		add(jldestino);

		jdestino = new JTextField();
		jdestino.setBounds(160, 140, 100, 20);
		jdestino.setBorder(new LineBorder(null));
		jdestino.setEditable(true);
		add(jdestino);

		jlfecha = new JLabel("Fecha de viaje : ");
		jlfecha.setFont(new Font("Calibri", 30, 15));
		jlfecha.setBounds(30, 180, 200, 20);
		add(jlfecha);

		jfecha = new JTextField();
		jfecha.setBounds(160, 180, 100, 20);
		jfecha.setBorder(new LineBorder(null));
		jfecha.setEditable(true);
		add(jfecha);

		jlcategoria = new JLabel("Categor�a : ");
		jlcategoria.setFont(new Font("Calibri", 30, 15));
		jlcategoria.setBounds(285, 100, 100, 20);
		add(jlcategoria);

		jccategoria = new JComboBox<String>();
		jccategoria.setActionCommand("ESCOGER");
		jccategoria.setBounds(360, 100, 100, 20);
		jccategoria.setBorder(new LineBorder(null));
		jccategoria.addItem("Turismo");
		jccategoria.addItem("Negocios");
		jccategoria.setBackground(Color.white);
		jccategoria.setEditable(false);
		add(jccategoria);

		b_verificar = new JButton("GUARDAR");
		b_verificar.setBounds(360, 260, 105, 40);
		b_verificar.setActionCommand("GUARDAR");
		b_verificar.setBackground(Color.white);
		add(b_verificar);

		b_volver = new JButton("Volver");
		b_volver.setBounds(375, 310, 90, 30);
		b_volver.setActionCommand("VOLVER");
		b_volver.setBackground(Color.white);
		add(b_volver);

	}

	public JTextField getJorigen() {
		return jorigen;
	}

	public void setJorigen(JTextField jorigen) {
		this.jorigen = jorigen;
	}

	public JTextField getJdestino() {
		return jdestino;
	}

	public void setJdestino(JTextField jdestino) {
		this.jdestino = jdestino;
	}

	public JTextField getJfecha() {
		return jfecha;
	}

	public void setJfecha(JTextField jfecha) {
		this.jfecha = jfecha;
	}

	public JLabel getH_titulo() {
		return h_titulo;
	}

	public void setH_titulo(JLabel h_titulo) {
		this.h_titulo = h_titulo;
	}

	public JLabel getJlorigen() {
		return jlorigen;
	}

	public void setJlorigen(JLabel jlorigen) {
		this.jlorigen = jlorigen;
	}

	public JLabel getJldestino() {
		return jldestino;
	}

	public void setJldestino(JLabel jldestino) {
		this.jldestino = jldestino;
	}

	public JLabel getJlfecha() {
		return jlfecha;
	}

	public void setJlfecha(JLabel jlfecha) {
		this.jlfecha = jlfecha;
	}

	public JLabel getJlcategoria() {
		return jlcategoria;
	}

	public void setJlcategoria(JLabel jlcategoria) {
		this.jlcategoria = jlcategoria;
	}

	public JRadioButton getBr_Disponible() {
		return br_Disponible;
	}

	public void setBr_Disponible(JRadioButton br_Disponible) {
		this.br_Disponible = br_Disponible;
	}

	public JComboBox<String> getJccategoria() {
		return jccategoria;
	}

	public void setJccategoria(JComboBox<String> jccategoria) {
		this.jccategoria = jccategoria;
	}

	public JButton getB_verificar() {
		return b_verificar;
	}

	public void setB_verificar(JButton b_verificar) {
		this.b_verificar = b_verificar;
	}

	public JButton getB_volver() {
		return b_volver;
	}

	public void setB_volver(JButton b_volver) {
		this.b_volver = b_volver;
	}

}