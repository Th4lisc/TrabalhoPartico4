package model;

import java.util.Date;

/**
 * A classe PlanoPago que herda da classe Plano
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class PlanoPago extends Plano {
	
	// Atributos
	private double valor;
	
	/**
	 * Metodo construtor
	 */
	
	// Construtor
	public PlanoPago() {
		super();
	}
	
	/**
	 * Sobrecarga do metodo construtor
	 * @param tipo string que representa o tipo
	 * @param dataInicio Date que representa a data de inicio de assinatura
	 * @param valor double que representa o valor do plano pago
	 */
	
	public PlanoPago(String tipo, Date dataInicio, double valor) {
		setTipo(tipo);
		setDataInicio(dataInicio);
		setValor(valor);	
	}
	
	// Metodos
		// Gets
	public double getValor() {
		return this.valor;
	}
		// Sets
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * Metodo que possibilita a edicao de um objeto PlanoPago
	 * @param tipo string que representa o tipo
	 * @param dataInicio Date que representa a data de inicio de assinatura
	 * @param valor double que representa o valor do plano pago
	 */
	
	public void editaPlano(String tipo, Date dataInicio, Date dataVencimento, double valor) {
		setTipo(tipo);
		setDataInicio(dataInicio);
		setValor(valor);
	}
}
