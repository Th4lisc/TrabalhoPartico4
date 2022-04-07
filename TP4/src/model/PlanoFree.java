package model;

import java.util.Date;

/**
 * A classe PlanoFree que herda da classe Plano
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class PlanoFree extends Plano {
	
	/**
	 * Metodo construtor
	 */

	// Construtor
	public PlanoFree() {
		super();
	}
	
	/**
	 * Sobrecarga do metodo construtor
	 * @param dataInicio Date que representa a data de inicio de assinatura
	 */
	
	public PlanoFree(Date dataInicio) {
		setTipo("Free");
		setDataInicio(dataInicio);
	}
}
