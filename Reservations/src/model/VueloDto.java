package model;

import java.sql.Date;

public class VueloDto {

	String nombre_empresa_av;
	int num_vuelo;
	Date fecha_vuelo;

	public VueloDto(String nombre_empresa_av, int num_vuelo, Date fecha_vuelo) {
		super();
		this.nombre_empresa_av = nombre_empresa_av;
		this.num_vuelo = num_vuelo;
		this.fecha_vuelo = fecha_vuelo;
	}

	@Override
	public String toString() {
		return "VueloDto [nombre_empresa_av=" + nombre_empresa_av + ", num_vuelo=" + num_vuelo + ", fecha_vuelo="
				+ fecha_vuelo + "]";
	}

	public String getNombre_empresa_av() {
		return nombre_empresa_av;
	}

	public void setNombre_empresa_av(String nombre_empresa_av) {
		this.nombre_empresa_av = nombre_empresa_av;
	}

	public int getNum_vuelo() {
		return num_vuelo;
	}

	public void setNum_vuelo(int num_vuelo) {
		this.num_vuelo = num_vuelo;
	}

	public Date getFecha_vuelo() {
		return fecha_vuelo;
	}

	public void setFecha_vuelo(Date fecha_vuelo) {
		this.fecha_vuelo = fecha_vuelo;
	}

}
