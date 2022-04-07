package model;

import java.util.*;

/**
 * A classe PlanoAnual que herda da classe PlanoPago
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class PlanoAnual extends PlanoPago {
	
	/**
	 * Metodo construtor
	 * @param dataInicio Date que representa a data de inicio de assinatura
	 */
	
	public PlanoAnual(Date dataInicio) {
		super("Anual", dataInicio, 199.9);
	}
	
}
