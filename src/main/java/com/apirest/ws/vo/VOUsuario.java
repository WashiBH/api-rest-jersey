package com.apirest.ws.vo;

public class VOUsuario {
	/*
	 * ======PROPIEDADES======
	 */
	private String usuario;
	private String password;
	private boolean userValido;
	/*
	 * =====GETTER AND SETTER===
	 */
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isUserValido() {
		return userValido;
	}
	public void setUserValido(boolean userValido) {
		this.userValido = userValido;
	}
	
}
