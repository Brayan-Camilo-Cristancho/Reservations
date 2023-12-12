package model;

public class TrayectoDto {

	String vul_tray;
	int tiq_tray;
	String origen;
	String destino;

	public TrayectoDto(String vul_tray, int tiq_tray, String origen, String destino) {
		super();
		this.vul_tray = vul_tray;
		this.tiq_tray = tiq_tray;
		this.origen = origen;
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "TrayectoDto [vul_tray=" + vul_tray + ", tiq_tray=" + tiq_tray + ", origen=" + origen + ", destino="
				+ destino + "]";
	}

	public String getVul_tray() {
		return vul_tray;
	}

	public void setVul_tray(String vul_tray) {
		this.vul_tray = vul_tray;
	}

	public int getTiq_tray() {
		return tiq_tray;
	}

	public void setTiq_tray(int tiq_tray) {
		this.tiq_tray = tiq_tray;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}
