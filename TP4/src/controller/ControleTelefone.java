package controller;

import model.*;

public class ControleTelefone {

	ControleDados dados = new ControleDados();
	
	public void addTelefone(int pos, String ddd, String num) {
		Telefone tel = new Telefone(ddd, num);
		dados.addTelefone(pos, tel);
	}
	
	public Telefone getTelefone(int pos) {
		return dados.getTelefone(pos);
	}
}
