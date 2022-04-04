package controller;

import model.*;

public class ControleEndereco {
	
	ControleDados dados = new ControleDados();
	
	public void addEndereco(int pos, String cep, String pais, String estado, String bairro, String ruaQuadra, String numero) {
		Endereco end = new Endereco(cep, pais, estado, bairro, ruaQuadra, numero);
		dados.addEndereco(pos, end);
	}
	
	public Endereco getEndereco(int pos) {
		return dados.getEndereco(pos);
	}
}
