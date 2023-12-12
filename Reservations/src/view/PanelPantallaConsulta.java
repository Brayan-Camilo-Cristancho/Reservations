package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

public class PanelPantallaConsulta extends JPanel {

	private JTextArea jresultado;
	private JLabel jltitulo, jlcedula, jlfiltro1, jlfiltro2, jlfiltro3;
	private JTextField jcedula;
	private JScrollPane lista;
	private JComboBox<String> jcfiltro1, jcfiltro2, jcfiltro3;
	private JButton b_volver, b_buscar;

	public PanelPantallaConsulta() {

		setLayout(null);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		jltitulo = new JLabel("CONSULTA");
		jltitulo.setForeground(Color.white);
		jltitulo.setFont(new Font("Algerian", 20, 40));
		jltitulo.setBounds(130, 0, 264, 45);
		add(jltitulo);

		jlcedula = new JLabel("Cédula : ");
		jlcedula.setFont(new Font("Calibri", 30, 15));
		jlcedula.setBounds(2, 50, 100, 20);
		add(jlcedula);

		jcedula = new JTextField();
		jcedula.setBounds(2, 70, 100, 20);
		jcedula.setBorder(new LineBorder(null));
		jcedula.setEditable(true);
		add(jcedula);

		jlfiltro1 = new JLabel("Sin costo viaje: ");
		jlfiltro1.setFont(new Font("Calibri", 30, 15));
		jlfiltro1.setBounds(110, 50, 140, 20);
		add(jlfiltro1);

		jcfiltro1 = new JComboBox<String>();
		jcfiltro1.setBounds(110, 70, 100, 20);
		jcfiltro1.setBorder(new LineBorder(null));
		jcfiltro1.addItem("--");
		jcfiltro1.addItem("SI");
		jcfiltro1.addItem("NO");
		jcfiltro1.setBackground(Color.white);
		jcfiltro1.setEditable(false);
		add(jcfiltro1);

		jlfiltro2 = new JLabel("Sin código vuelo: ");
		jlfiltro2.setFont(new Font("Calibri", 30, 15));
		jlfiltro2.setBounds(225, 50, 110, 20);
		add(jlfiltro2);

		jcfiltro2 = new JComboBox<String>();
		jcfiltro2.setBounds(225, 70, 108, 20);
		jcfiltro2.setBorder(new LineBorder(null));
		jcfiltro2.addItem("--");
		jcfiltro2.addItem("SI");
		jcfiltro2.addItem("NO");
		jcfiltro2.setBackground(Color.white);
		jcfiltro2.setEditable(false);
		add(jcfiltro2);

		jlfiltro3 = new JLabel("Sin fecha reserva: ");
		jlfiltro3.setFont(new Font("Calibri", 30, 15));
		jlfiltro3.setBounds(347, 50, 115, 20);
		add(jlfiltro3);

		jcfiltro3 = new JComboBox<String>();
		jcfiltro3.setBounds(347, 70, 110, 20);
		jcfiltro3.setBorder(new LineBorder(null));
		jcfiltro3.addItem("--");
		jcfiltro3.addItem("SI");
		jcfiltro3.addItem("NO");
		jcfiltro3.setBackground(Color.white);
		jcfiltro3.setEditable(false);
		add(jcfiltro3);

		jresultado = new JTextArea();
		jresultado.setBounds(2, 100, 460, 200);
		jresultado.setBorder(new LineBorder(null));
		jresultado.setFont(jresultado.getFont().deriveFont(5f));
		jresultado.setFont(new Font("Times new roman", 20, 20));
		jresultado.setEditable(false);
		add(jresultado);

		b_buscar = new JButton("Actualizar");
		b_buscar.setBounds(2, 310, 140, 30);
		b_buscar.setActionCommand("BUSCAR");
		add(b_buscar);

		b_volver = new JButton("Volver");
		b_volver.setBounds(380, 310, 80, 30);
		b_volver.setActionCommand("VOLVER");
		add(b_volver);

	}

	public JTextArea getJresultado() {
		return jresultado;
	}

	public void setJresultado(JTextArea jresultado) {
		this.jresultado = jresultado;
	}

	public JLabel getJltitulo() {
		return jltitulo;
	}

	public void setJltitulo(JLabel jltitulo) {
		this.jltitulo = jltitulo;
	}

	public JLabel getJlcedula() {
		return jlcedula;
	}

	public void setJlcedula(JLabel jlcedula) {
		this.jlcedula = jlcedula;
	}

	public JLabel getJlfiltro1() {
		return jlfiltro1;
	}

	public void setJlfiltro1(JLabel jlfiltro1) {
		this.jlfiltro1 = jlfiltro1;
	}

	public JLabel getJlfiltro2() {
		return jlfiltro2;
	}

	public void setJlfiltro2(JLabel jlfiltro2) {
		this.jlfiltro2 = jlfiltro2;
	}

	public JLabel getJlfiltro3() {
		return jlfiltro3;
	}

	public void setJlfiltro3(JLabel jlfiltro3) {
		this.jlfiltro3 = jlfiltro3;
	}

	public JTextField getJcedula() {
		return jcedula;
	}

	public void setJcedula(JTextField jcedula) {
		this.jcedula = jcedula;
	}

	public JScrollPane getLista() {
		return lista;
	}

	public void setLista(JScrollPane lista) {
		this.lista = lista;
	}

	public JComboBox<String> getJcfiltro1() {
		return jcfiltro1;
	}

	public void setJcfiltro1(JComboBox<String> jcfiltro1) {
		this.jcfiltro1 = jcfiltro1;
	}

	public JComboBox<String> getJcfiltro2() {
		return jcfiltro2;
	}

	public void setJcfiltro2(JComboBox<String> jcfiltro2) {
		this.jcfiltro2 = jcfiltro2;
	}

	public JComboBox<String> getJcfiltro3() {
		return jcfiltro3;
	}

	public void setJcfiltro3(JComboBox<String> jcfiltro3) {
		this.jcfiltro3 = jcfiltro3;
	}

	public JButton getB_volver() {
		return b_volver;
	}

	public void setB_volver(JButton b_volver) {
		this.b_volver = b_volver;
	}

	public JButton getB_buscar() {
		return b_buscar;
	}

	public void setB_buscar(JButton b_buscar) {
		this.b_buscar = b_buscar;
	}

}