package model;

public class UsuarioDto {

	String num_ident;
	String nombres;
	String apellidos;
	int edad;
	String correo;
	String pais_residencia;
	String telefono;
	String direccion;
	String sexo;

	public UsuarioDto(String num_ident, String nombres, String apellidos, int edad, String correo,
			String pais_residencia, String telefono, String direccion, String sexo) {
		super();
		this.num_ident = num_ident;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.correo = correo;
		this.pais_residencia = pais_residencia;
		this.telefono = telefono;
		this.direccion = direccion;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "ReservaDao [num_ident=" + num_ident + ", nombres=" + nombres + ", apellidos=" + apellidos + ", edad="
				+ edad + ", correo=" + correo + ", pais_residencia=" + pais_residencia + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", sexo=" + sexo + "]";
	}

	public String getNum_ident() {
		return num_ident;
	}

	public void setNum_ident(String num_ident) {
		this.num_ident = num_ident;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPais_residencia() {
		return pais_residencia;
	}

	public void setPais_residencia(String pais_residencia) {
		this.pais_residencia = pais_residencia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
