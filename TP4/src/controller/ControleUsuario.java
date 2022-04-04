package controller;

import java.util.Calendar;
import java.util.Date;

import model.*;

public class ControleUsuario {
	
	ControleDados dados = new ControleDados();
	Date agora = Calendar.getInstance().getTime();
	
	public ControleUsuario () {
		
	}
	
	// Gets
	public int getQtdUsuarios () {
		return dados.getQtdUsuarios();
	}
	
	public void addUsuario(int pos, String nome, String sobrenome, String email, Endereco endereco, Telefone telefone, String cpf, int kmPedalado) {
		Usuario u = new Usuario(nome, sobrenome, email, endereco, telefone, cpf, new PlanoFree(), kmPedalado);
		dados.addUsuario(pos, u);
	}
	
	public String getNomeCompleto (int id) {
		return dados.getUsuarios()[id].getNomecompleto();
	}

	public String getEmail (int id) {
		return dados.getUsuarios()[id].getEmail();
	}
	
	public String getEndereco (int id) {
		return dados.getUsuarios()[id].getEndereco().completo();
	}
	
	public String getTelefone (int id) {
		return dados.getUsuarios()[id].getTelefone().getDDD() + " - " + dados.getUsuarios()[id].getTelefone().getNumero();
	}
	
	public String getCpf (int id) {
		return dados.getUsuarios()[id].getCpf();
	}
		
	public String getPlano (int id) {
		return dados.getUsuarios()[id].getPlano();
	}
	
	public String getKmPedalado (int id) {
		return Integer.toString(dados.getUsuarios()[id].getKmPedalado());
	}
	
	// Sets
	public void setNome (int id, String nome) {
		dados.getUsuarios()[id].setNome(nome);
	}

	public void setSobrenome (int id, String sobrenome) {
		dados.getUsuarios()[id].setSobrenome(sobrenome);
	}
	
	public void setEmail (int id, String email) {
		dados.getUsuarios()[id].setEmail(email);
	}
	
	public void setEndereco (int id, String ruaQuadra, String numero, String bairro, String estado, String pais, String cep) {
		dados.getUsuarios()[id].getEndereco().setRuaQuadra(ruaQuadra);
		dados.getUsuarios()[id].getEndereco().setNumero(numero);
		dados.getUsuarios()[id].getEndereco().setBairro(bairro);
		dados.getUsuarios()[id].getEndereco().setEstado(estado);
		dados.getUsuarios()[id].getEndereco().setPais(pais);
		dados.getUsuarios()[id].getEndereco().setCep(cep);
	}
	
	public void setTelefone (int id, String ddd, String num) {
		dados.getUsuarios()[id].getTelefone().setDDD(ddd);
		dados.getUsuarios()[id].getTelefone().setNumero(num);
	}
	
	public void setCpf (int id, String cpf) {
		dados.getUsuarios()[id].setCpf(cpf);
	}
	
	public void setPlano (int id, String plano) {
		if (plano == "Free") {
			dados.getUsuarios()[id].setPlano(new PlanoFree());
		} else if (plano == "Mensal") {
			dados.getUsuarios()[id].setPlano(new PlanoMensal(agora));
		} else if (plano == "Anual") {
			dados.getUsuarios()[id].setPlano(new PlanoAnual(agora));
		}
	}
	
	public void setKmPedalado (int id, int km) {
		dados.getUsuarios()[id].setKmPedalado(km);
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
