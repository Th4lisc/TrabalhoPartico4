package controller;

import model.*;

public class ControleDados {

	private Dados dados = new Dados();
	
	public ControleDados() {
		dados.carregaDados();
	}
	
	// Usuarios
	public Usuario[] getUsuarios() {
		return this.dados.getUsuarios();
	}
	
	public void addUsuario(int pos, Usuario u) {
		dados.addUsuario(u, pos);
	}
	
	public int getQtdUsuarios () {
		return dados.getQtdUsuarios();
	}
	
	// Enderecos
	public void addEndereco(int pos, Endereco end) {
		dados.addEndereco(end, pos);
	}
	
	public Endereco getEndereco(int pos) {
		return dados.getEndereco(pos);
	}
	
	// Telefone
	public void addTelefone(int pos, Telefone tel) {
		dados.addTelefone(tel, pos);
	}
	
	public Telefone getTelefone(int pos) {
		return dados.getTelefone(pos);
	}
	
	// Bicicletas
	public Bicicleta[] getBicicletas() {
		return this.dados.getBicicletas();
	}
	
	public int getQtdBicicletas () {
		return dados.getQtdBicicletas();
	}
	
	// Estacoes
	public Estacao[] getEstacoes() {
		return this.dados.getEstacoes();
	}
	
	public int getQtdEstacoes () {
		return dados.getQtdEstacoes();
	}
	
	// Corridas
	public String getCorrida (int pos) {
		return dados.getCorrida(pos);
	}
}
