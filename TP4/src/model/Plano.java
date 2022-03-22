package model;

import java.util.Date;

public abstract class Plano {

	// Atributos Plano
	String tipo;
	Date dataInicio;
	
	public Plano() {
		super();
	}
	
	// Metodos
		// Gets
	public String getTipo() {
		return this.tipo;
	}
	
	public Date getDataInicio() {
		return this.dataInicio;
	}
		// Sets
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setDataInicio(Date data) {
		this.dataInicio = data;
	}
	
	public void editaPlano(String tipo, Date dataInicio) {
		setTipo(tipo);
		setDataInicio(dataInicio);
	}
	
	public void deletaPlano() {
		//
	}
}
