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
	
	public Estacao getEstacaoNome(String nome) {
		for (int i = 0; i < this.getQtdEstacoes(); i++) {
			if (this.getEstacoes()[i].getNome().equals(nome)) {
				return this.getEstacoes()[i];
			}
		}
		return null;
	}
	
	public Estacao getEstacaoNumVagas(String num) {
		
		int numero;
		try {
			numero = Integer.parseInt(num);
		} catch (Exception e) {
			return null;		// Se não for um número, retorna null
		}
		
		for (int i = 0; i < this.getQtdEstacoes(); i++) {
			if (this.getEstacoes()[i].getNumVagasDisponiveis() == numero) {
				return this.getEstacoes()[i];
			}
		}
		return null;
	}
	
	// Corridas
	public String getCorrida (int pos) {
		return dados.getCorrida(pos);
	}
	
	public String[] getCorridas (int pos) {
		String[] a = new String[pos];
		for (int i = 0; i < pos; i++) {
			a[i] = (dados.getCorrida(i));
		}
		return a;
	}
	
	// Verificacoes
	public boolean verificaCpf (String cpf) {
		if (cpf.length() != 11) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean verificaEmail (String email) {
		if (email.contains("@")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verificaDDD (String ddd) {
		if (ddd.length() != 3) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean verificaNumero (String numero) {
		if (numero.length() != 9) {
			return false;
		} else {
			return true;
		}
	}
	
	public boolean verificaTamanho (String entry) {	// Se a entrada for muita pequena
		if (entry.length() <= 3) {
			return false;
		} else {
			return true;
		}
	}
}
