package model;

import java.util.Date;

public class PlanoFree extends Plano {

	// Construtor
	public PlanoFree() {
		super();
	}
	
	public PlanoFree(Date dataInicio) {
		setTipo("Free");
		setDataInicio(dataInicio);
	}
}
