package model;

public class ClaseY {

	private UsuarioDao usuario;
	private ReservaDao reserva;
	private TiqueteDao tiquete;
	private TrayectoDao trayecto;
	private CobroDao cobro;
	private VueloDao vuelo;
	private UsuarioDto usuariodto;
	private Consulta consulta;

	public ClaseY() {
		super();
		this.usuario = new UsuarioDao();
		this.reserva = new ReservaDao();
		this.tiquete = new TiqueteDao();
		this.trayecto = new TrayectoDao();
		this.cobro = new CobroDao();
		this.vuelo = new VueloDao();
		this.usuariodto = new UsuarioDto(null, null, null, 0, null, null, null, null, null);
		this.consulta = new Consulta();
	}

	@Override
	public String toString() {
		return "ClaseY [usuario=" + usuario + ", reserva=" + reserva + ", tiquete=" + tiquete + ", trayecto=" + trayecto
				+ ", cobro=" + cobro + ", vuelo=" + vuelo + ", usuariodto=" + usuariodto + ", consulta=" + consulta
				+ "]";
	}

	public UsuarioDao getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDao usuario) {
		this.usuario = usuario;
	}

	public ReservaDao getReserva() {
		return reserva;
	}

	public void setReserva(ReservaDao reserva) {
		this.reserva = reserva;
	}

	public TiqueteDao getTiquete() {
		return tiquete;
	}

	public void setTiquete(TiqueteDao tiquete) {
		this.tiquete = tiquete;
	}

	public TrayectoDao getTrayecto() {
		return trayecto;
	}

	public void setTrayecto(TrayectoDao trayecto) {
		this.trayecto = trayecto;
	}

	public CobroDao getCobro() {
		return cobro;
	}

	public void setCobro(CobroDao cobro) {
		this.cobro = cobro;
	}

	public VueloDao getVuelo() {
		return vuelo;
	}

	public void setVuelo(VueloDao vuelo) {
		this.vuelo = vuelo;
	}

	public UsuarioDto getUsuariodto() {
		return usuariodto;
	}

	public void setUsuariodto(UsuarioDto usuariodto) {
		this.usuariodto = usuariodto;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

}
