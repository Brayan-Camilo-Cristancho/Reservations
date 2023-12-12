package controller;

import model.ClaseY;
import view.PantallaConsulta;
import view.PantallaDatosCliente;
import view.PantallaDatosReserva;
import view.PantallaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;



public class Controller implements ActionListener {
	private ClaseY y;
	private PantallaPrincipal pprincipal;
	private PantallaDatosCliente pdatoscliente;
	private PantallaDatosReserva pdatosreserva;
	private PantallaConsulta ppconsulta;

	public Controller() {
		y = new ClaseY();

		pprincipal = new PantallaPrincipal();
		pdatoscliente = new PantallaDatosCliente();
		pdatosreserva = new PantallaDatosReserva();
		ppconsulta = new PantallaConsulta();

		assignListeners();

	}

	public void assignListeners() {
		pprincipal.getPrincipal().getB_consulta().addActionListener(this);
		pprincipal.getPrincipal().getB_reserva().addActionListener(this);
		pdatoscliente.getPdatosclientes().getB_verificar().addActionListener(this);
		pdatoscliente.getPdatosclientes().getB_volver().addActionListener(this);
		pdatosreserva.getPdreserva().getB_volver().addActionListener(this);
		pdatosreserva.getPdreserva().getB_verificar().addActionListener(this);
		ppconsulta.getPpantallaconsulta().getB_volver().addActionListener(this);
		ppconsulta.getPpantallaconsulta().getB_buscar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("CONSULTA")) {
			ppconsulta.setVisible(true);
			pprincipal.setVisible(false);
		} else if (arg0.getActionCommand().equals("RESERVA")) {
			pdatoscliente.setVisible(true);
			pprincipal.setVisible(false);

		} else if (arg0.getActionCommand().equals("VERIFICAR")) {
			try {

				y.getUsuariodto().setNum_ident(pdatoscliente.getPdatosclientes().getJidentificacion().getText());
				y.getUsuariodto().setNombres(pdatoscliente.getPdatosclientes().getJnombres().getText());
				y.getUsuariodto().setApellidos(pdatoscliente.getPdatosclientes().getJapellidos().getText());
				y.getUsuariodto().setEdad(Integer.parseInt(pdatoscliente.getPdatosclientes().getJedad().getText()));
				y.getUsuariodto().setCorreo(pdatoscliente.getPdatosclientes().getJcorreo().getText());
				y.getUsuariodto().setPais_residencia(pdatoscliente.getPdatosclientes().getJresidencia().getText());
				y.getUsuariodto().setTelefono(pdatoscliente.getPdatosclientes().getJtelefono().getText());
				y.getUsuariodto().setDireccion(pdatoscliente.getPdatosclientes().getJdireccion().getText());
				y.getUsuariodto()
						.setSexo(String.valueOf(pdatoscliente.getPdatosclientes().getJcsexo().getSelectedItem()));
				pdatosreserva.setVisible(true);
				pdatoscliente.setVisible(false);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Datos ingresados erroneos");
			}

		} else if (arg0.getActionCommand().equals("GUARDAR")) {
			try {
				LocalDate todaysDate = LocalDate.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				if (todaysDate
						.isAfter(LocalDate.parse(pdatosreserva.getPdreserva().getJfecha().getText(), formatter))) {
					JOptionPane.showMessageDialog(null, "No puede seleccionar un vuelo antiguo");
				} else if (todaysDate
						.isBefore(LocalDate.parse(pdatosreserva.getPdreserva().getJfecha().getText(), formatter))) {

					y.getUsuario().registrarUsuario(y.getUsuariodto());
					System.out.println("terminado1");
					y.getVuelo().registrarVuelo(Date.valueOf(pdatosreserva.getPdreserva().getJfecha().getText()));
					System.out.println("terminado2");
					y.getTiquete().registrarTiquete(Date.valueOf(pdatosreserva.getPdreserva().getJfecha().getText()));
					System.out.println("terminado3");
					y.getTrayecto().registrarTrayecto(pdatosreserva.getPdreserva().getJorigen().getText(),
							pdatosreserva.getPdreserva().getJdestino().getText(), y.getVuelo().getCodigo());
					System.out.println("terminado4");
					y.getCobro().registrarCobro(
							String.valueOf(pdatosreserva.getPdreserva().getJccategoria().getSelectedItem()));
					System.out.println("terminado5");
					y.getReserva().registrarReserva();
					System.out.println("terminado6");

					JOptionPane.showInternalMessageDialog(null,
							"�Reserva registrada exitosamente!, puede consultar m�s detalles en la pesta�a de consulta");

					pdatosreserva.getPdreserva().getJorigen().setText("");
					pdatosreserva.getPdreserva().getJdestino().setText("");
					pdatosreserva.getPdreserva().getJfecha().setText("");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Datos ingresados erroneos");
			}

		} else if (arg0.getActionCommand().equals("BUSCAR")) {
			try {
				if (String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro1().getSelectedItem())
						.equals("--") == false
						&& String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro2().getSelectedItem())
								.equals("--") == true
						&& String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro3().getSelectedItem())
								.equals("--") == true) {

					if (String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro1().getSelectedItem())
							.equals("SI") == true) {
						ppconsulta.getPpantallaconsulta().getJresultado().setText(y.getConsulta()
								.RealizarConsultaConFiltro1(ppconsulta.getPpantallaconsulta().getJcedula().getText()));
					} else {
						ppconsulta.getPpantallaconsulta().getJresultado().setText(y.getConsulta()
								.RealizarConsulta(ppconsulta.getPpantallaconsulta().getJcedula().getText()));
					}

				} else if (String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro1().getSelectedItem())
						.equals("--") == true
						&& String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro2().getSelectedItem())
								.equals("--") == false
						&& String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro3().getSelectedItem())
								.equals("--") == true) {
					if (String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro2().getSelectedItem())
							.equals("SI") == true) {
						ppconsulta.getPpantallaconsulta().getJresultado().setText(y.getConsulta()
								.RealizarConsultaConFiltro2(ppconsulta.getPpantallaconsulta().getJcedula().getText()));
					} else {
						ppconsulta.getPpantallaconsulta().getJresultado().setText(y.getConsulta()
								.RealizarConsulta(ppconsulta.getPpantallaconsulta().getJcedula().getText()));
					}
				} else if (String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro1().getSelectedItem())
						.equals("--") == true
						&& String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro2().getSelectedItem())
								.equals("--") == true
						&& String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro3().getSelectedItem())
								.equals("--") == false) {
					if (String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro3().getSelectedItem())
							.equals("SI") == true) {
						ppconsulta.getPpantallaconsulta().getJresultado().setText(y.getConsulta()
								.RealizarConsultaConFiltro3(ppconsulta.getPpantallaconsulta().getJcedula().getText()));
					} else {
						ppconsulta.getPpantallaconsulta().getJresultado().setText(y.getConsulta()
								.RealizarConsulta(ppconsulta.getPpantallaconsulta().getJcedula().getText()));
					}
				} else if (String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro1().getSelectedItem())
						.equals("--") == true
						&& String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro2().getSelectedItem())
								.equals("--") == true
						&& String.valueOf(ppconsulta.getPpantallaconsulta().getJcfiltro3().getSelectedItem())
								.equals("--") == true) {

					ppconsulta.getPpantallaconsulta().getJresultado().setText(
							y.getConsulta().RealizarConsulta(ppconsulta.getPpantallaconsulta().getJcedula().getText()));
				} else {
					JOptionPane.showMessageDialog(null, "Solo puede usar un filtro por busqueda");
				}

			} catch (Exception e) {
				System.out.println(e);
				JOptionPane.showMessageDialog(null, "Dato incorrecto");
			}

		} else if (arg0.getActionCommand().equals("VOLVER")) {
			pdatoscliente.getPdatosclientes().getJidentificacion().setText("");
			pdatoscliente.getPdatosclientes().getJnombres().setText("");
			pdatoscliente.getPdatosclientes().getJapellidos().setText("");
			pdatoscliente.getPdatosclientes().getJedad().setText("");
			pdatoscliente.getPdatosclientes().getJcorreo().setText("");
			pdatoscliente.getPdatosclientes().getJtelefono().setText("");
			pdatoscliente.getPdatosclientes().getJnombres().setText("");
			pdatoscliente.getPdatosclientes().getJdireccion().setText("");
			pdatoscliente.getPdatosclientes().getJresidencia().setText("");
			pdatosreserva.getPdreserva().getJorigen().setText("");
			pdatosreserva.getPdreserva().getJdestino().setText("");
			pdatosreserva.getPdreserva().getJfecha().setText("");
			ppconsulta.getPpantallaconsulta().getJresultado().setText("");
			pdatosreserva.setVisible(false);
			pdatoscliente.setVisible(false);
			pprincipal.setVisible(true);
			ppconsulta.setVisible(false);
		}
	}

}
