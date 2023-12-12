package model;

import java.sql.Date;

public class ReservaDto {

	Date fecha_reserva;
	int cli_res;
	int tiq_res;

	public ReservaDto(Date fecha_reserva, int cli_res, int tiq_res) {
		super();
		this.fecha_reserva = fecha_reserva;
		this.cli_res = cli_res;
		this.tiq_res = tiq_res;
	}

	@Override
	public String toString() {
		return "ReservaDao [fecha_reserva=" + fecha_reserva + ", cli_res=" + cli_res + ", tiq_res=" + tiq_res + "]";
	}

	public Date getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(Date fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public int getCli_res() {
		return cli_res;
	}

	public void setCli_res(int cli_res) {
		this.cli_res = cli_res;
	}

	public int getTiq_res() {
		return tiq_res;
	}

	public void setTiq_res(int tiq_res) {
		this.tiq_res = tiq_res;
	}

}
