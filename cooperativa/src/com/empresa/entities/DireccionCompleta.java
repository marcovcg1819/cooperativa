package com.empresa.entities;

public class DireccionCompleta {
	private String calle;
	private String barrio;
	private String numeroCasa;
	private String municipio;
	public DireccionCompleta() {
		Persona persona = new Persona();
		persona.setApellidos("Ramirez");
		persona.setNombres("Jorge");
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	
}
