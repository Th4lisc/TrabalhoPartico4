package model;

import java.util.Date;

/**
 * A classe abstrata Plano cadastra, edita, fornece informacoes e deleta objetos de classe herdeiras
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

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
	
	/**
	 * Metodo que possibilita a edicao
	 * @param tipo string que representa o tipo de plano
	 * @param dataInicio Date que representa a data de inicio de assinatura
	 */
	
	public void editaPlano(String tipo, Date dataInicio) {
		setTipo(tipo);
		setDataInicio(dataInicio);
	}
	
	public void deletaPlano() {
		//
	}
}
