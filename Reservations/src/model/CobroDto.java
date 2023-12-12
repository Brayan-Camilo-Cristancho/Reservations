package model;

public class CobroDto {
	int tiq_cob;
	String categoria;
	float costo_adicional;
	float costo_viaje;

	public CobroDto(int tiq_cob, String categoria, float costo_adicional, float costo_viaje) {
		super();
		this.tiq_cob = tiq_cob;
		this.categoria = categoria;
		this.costo_adicional = costo_adicional;
		this.costo_viaje = costo_viaje;
	}

	@Override
	public String toString() {
		return "CobroDto [tiq_cob=" + tiq_cob + ", categoria=" + categoria + ", costo_adicional=" + costo_adicional
				+ ", costo_viaje=" + costo_viaje + "]";
	}

	public int getTiq_cob() {
		return tiq_cob;
	}

	public void setTiq_cob(int tiq_cob) {
		this.tiq_cob = tiq_cob;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getCosto_adicional() {
		return costo_adicional;
	}

	public void setCosto_adicional(float costo_adicional) {
		this.costo_adicional = costo_adicional;
	}

	public float getCosto_viaje() {
		return costo_viaje;
	}

	public void setCosto_viaje(float costo_viaje) {
		this.costo_viaje = costo_viaje;
	}

}
