package model;

import java.util.Date;

public class PlanoPago extends Plano {
	
	// Atributos
	private double valor;
	
	// Construtor
	public PlanoPago() {
		super();
	}
	
	public PlanoPago(String tipo, Date dataInicio, double valor) {
		setTipo("Pago");
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
	
	public void editaPlano(String tipo, Date dataInicio, Date dataVencimento, double valor) {
		setTipo("Pago");
		setDataInicio(dataInicio);
		setValor(valor);
	}
}
