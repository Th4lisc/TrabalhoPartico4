package model;

import java.util.*;

/**
 * A classe PlanoMensal que herda da classe PlanoPago
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class PlanoMensal extends PlanoPago {
	
	/**
	 * Metodo construtor
	 * @param dataInicio Date que representa a data de inicio de assinatura
	 */
	
	public PlanoMensal(Date dataInicio) {
		super("Mensal", dataInicio, 29.9);
	}
	
}
