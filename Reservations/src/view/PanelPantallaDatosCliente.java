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

public class PanelPantallaDatosCliente extends JPanel {

	private JTextField jidentificacion, jnombres, japellidos, jedad, jcorreo, jresidencia, jtelefono, jdireccion;
	private JLabel h_titulo, jlidentificacion, jlnombres, jlapellidos, jledad, jlcorreo, jlresidencia, jltelefono,
			jldireccion, jlsexo;
	private JButton b_verificar, b_volver;
	private JComboBox<String> jcsexo;

	public PanelPantallaDatosCliente() {

		inicializarComponentes();
		setLayout(null);

	}

	public void inicializarComponentes() {
		setBorder(new LineBorder(Color.black));

		h_titulo = new JLabel("DATOS PERSONALES");
		h_titulo.setFont(new Font("Algerian", 60, 30));
		h_titulo.setBounds(92, 15, 320, 45);
		add(h_titulo);

		jlidentificacion = new JLabel("Identificación : ");
		jlidentificacion.setFont(new Font("Calibri", 30, 15));
		jlidentificacion.setBounds(30, 100, 125, 20);
		add(jlidentificacion);

		jidentificacion = new JTextField();
		jidentificacion.setBounds(140, 100, 100, 20);
		jidentificacion.setBorder(new LineBorder(null));
		jidentificacion.setEditable(true);
		add(jidentificacion);

		jlnombres = new JLabel("Nombres : ");
		jlnombres.setFont(new Font("Calibri", 30, 15));
		jlnombres.setBounds(30, 140, 110, 20);
		add(jlnombres);

		jnombres = new JTextField();
		jnombres.setBounds(140, 140, 100, 20);
		jnombres.setBorder(new LineBorder(null));
		jnombres.setEditable(true);
		add(jnombres);

		jlapellidos = new JLabel("Apellidos : ");
		jlapellidos.setFont(new Font("Calibri", 30, 15));
		jlapellidos.setBounds(30, 180, 200, 20);
		add(jlapellidos);

		japellidos = new JTextField();
		japellidos.setBounds(140, 180, 100, 20);
		japellidos.setBorder(new LineBorder(null));
		japellidos.setEditable(true);
		add(japellidos);

		jledad = new JLabel("Edad : ");
		jledad.setFont(new Font("Calibri", 30, 15));
		jledad.setBounds(30, 220, 200, 20);
		add(jledad);

		jedad = new JTextField();
		jedad.setBounds(140, 220, 100, 20);
		jedad.setBorder(new LineBorder(null));
		jedad.setEditable(true);
		add(jedad);

		jlcorreo = new JLabel("Correo : ");
		jlcorreo.setFont(new Font("Calibri", 30, 15));
		jlcorreo.setBounds(30, 260, 100, 20);
		add(jlcorreo);

		jcorreo = new JTextField();
		jcorreo.setBounds(140, 260, 100, 20);
		jcorreo.setBorder(new LineBorder(null));
		jcorreo.setEditable(true);
		add(jcorreo);

		jlresidencia = new JLabel("Pais residencia : ");
		jlresidencia.setFont(new Font("Calibri", 30, 15));
		jlresidencia.setBounds(256, 180, 120, 20);
		add(jlresidencia);

		jresidencia = new JTextField();
		jresidencia.setBounds(360, 180, 100, 20);
		jresidencia.setBorder(new LineBorder(null));
		jresidencia.setEditable(true);
		add(jresidencia);

		jltelefono = new JLabel("Teléfono : ");
		jltelefono.setFont(new Font("Calibri", 30, 15));
		jltelefono.setBounds(256, 100, 100, 20);
		add(jltelefono);

		jtelefono = new JTextField();
		jtelefono.setBounds(360, 100, 100, 20);
		jtelefono.setBorder(new LineBorder(null));
		jtelefono.setEditable(true);
		add(jtelefono);

		jldireccion = new JLabel("Dirección : ");
		jldireccion.setFont(new Font("Calibri", 30, 15));
		jldireccion.setBounds(256, 140, 100, 20);
		add(jldireccion);

		jdireccion = new JTextField();
		jdireccion.setBounds(360, 140, 100, 20);
		jdireccion.setBorder(new LineBorder(null));
		jdireccion.setEditable(true);
		add(jdireccion);

		jlsexo = new JLabel("Sexo : ");
		jlsexo.setFont(new Font("Calibri", 30, 15));
		jlsexo.setBounds(256, 220, 100, 20);
		add(jlsexo);

		jcsexo = new JComboBox<String>();
		jcsexo.setBounds(360, 220, 100, 20);
		jcsexo.setBorder(new LineBorder(null));
		jcsexo.addItem("M");
		jcsexo.addItem("F");
		jcsexo.setBackground(Color.white);
		jcsexo.setEditable(false);
		add(jcsexo);

		b_verificar = new JButton("SIGUIENTE");
		b_verificar.setBounds(360, 260, 105, 40);
		b_verificar.setActionCommand("VERIFICAR");
		b_verificar.setBackground(Color.white);
		add(b_verificar);

		b_volver = new JButton("VOLVER");
		b_volver.setBounds(375, 310, 90, 30);
		b_volver.setActionCommand("VOLVER");
		b_volver.setBackground(Color.white);
		add(b_volver);

	}

	public JTextField getJidentificacion() {
		return jidentificacion;
	}

	public void setJidentificacion(JTextField jidentificacion) {
		this.jidentificacion = jidentificacion;
	}

	public JTextField getJnombres() {
		return jnombres;
	}

	public void setJnombres(JTextField jnombres) {
		this.jnombres = jnombres;
	}

	public JTextField getJapellidos() {
		return japellidos;
	}

	public void setJapellidos(JTextField japellidos) {
		this.japellidos = japellidos;
	}

	public JTextField getJedad() {
		return jedad;
	}

	public void setJedad(JTextField jedad) {
		this.jedad = jedad;
	}

	public JTextField getJcorreo() {
		return jcorreo;
	}

	public void setJcorreo(JTextField jcorreo) {
		this.jcorreo = jcorreo;
	}

	public JTextField getJresidencia() {
		return jresidencia;
	}

	public void setJresidencia(JTextField jresidencia) {
		this.jresidencia = jresidencia;
	}

	public JTextField getJtelefono() {
		return jtelefono;
	}

	public void setJtelefono(JTextField jtelefono) {
		this.jtelefono = jtelefono;
	}

	public JTextField getJdireccion() {
		return jdireccion;
	}

	public void setJdireccion(JTextField jdireccion) {
		this.jdireccion = jdireccion;
	}

	public JLabel getH_titulo() {
		return h_titulo;
	}

	public void setH_titulo(JLabel h_titulo) {
		this.h_titulo = h_titulo;
	}

	public JLabel getJlidentificacion() {
		return jlidentificacion;
	}

	public void setJlidentificacion(JLabel jlidentificacion) {
		this.jlidentificacion = jlidentificacion;
	}

	public JLabel getJlnombres() {
		return jlnombres;
	}

	public void setJlnombres(JLabel jlnombres) {
		this.jlnombres = jlnombres;
	}

	public JLabel getJlapellidos() {
		return jlapellidos;
	}

	public void setJlapellidos(JLabel jlapellidos) {
		this.jlapellidos = jlapellidos;
	}

	public JLabel getJledad() {
		return jledad;
	}

	public void setJledad(JLabel jledad) {
		this.jledad = jledad;
	}

	public JLabel getJlcorreo() {
		return jlcorreo;
	}

	public void setJlcorreo(JLabel jlcorreo) {
		this.jlcorreo = jlcorreo;
	}

	public JLabel getJlresidencia() {
		return jlresidencia;
	}

	public void setJlresidencia(JLabel jlresidencia) {
		this.jlresidencia = jlresidencia;
	}

	public JLabel getJltelefono() {
		return jltelefono;
	}

	public void setJltelefono(JLabel jltelefono) {
		this.jltelefono = jltelefono;
	}

	public JLabel getJldireccion() {
		return jldireccion;
	}

	public void setJldireccion(JLabel jldireccion) {
		this.jldireccion = jldireccion;
	}

	public JLabel getJlsexo() {
		return jlsexo;
	}

	public void setJlsexo(JLabel jlsexo) {
		this.jlsexo = jlsexo;
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

	public JComboBox<String> getJcsexo() {
		return jcsexo;
	}

	public void setJcsexo(JComboBox<String> jcsexo) {
		this.jcsexo = jcsexo;
	}

}