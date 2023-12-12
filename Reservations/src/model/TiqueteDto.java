package model;

import java.sql.Date;

public class TiqueteDto {

	Date fecha_emision;

	public TiqueteDto(Date fecha_emision) {
		super();
		this.fecha_emision = fecha_emision;
	}

	@Override
	public String toString() {
		return "TiqueteDto [fecha_emision=" + fecha_emision + "]";
	}

	public Date getFecha_emision() {
		return fecha_emision;
	}

	public void setFecha_emision(Date fecha_emision) {
		this.fecha_emision = fecha_emision;
	}

}
