package com.empresa.entities;

public class DireccionCompleta {
	private String calle;
	private String barrio;
	private String numeroCasa;
	private String municipio;
	public DireccionCompleta() {
		Persona per = new Persona();
		per.setNombres("Gladis Guzman");
		per.setApellidos("Esperanza");
		per.setNumeroDocumento("2222222222");
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
