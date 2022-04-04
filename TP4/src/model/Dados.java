package model;

import java.util.Calendar;
import java.util.Date;

public class Dados {

	private Usuario[] usuario = new Usuario[50];
	private int qtdUsuario = 0;
	private Endereco[] endereco = new Endereco[50];
	private int qtdEndereco = 0;
	private Telefone[] telefone = new Telefone[50];
	private int qtdTelefone = 0;
	private Bicicleta[] bicicleta = new Bicicleta[50];
	private int qtdBicicleta = 0;
	private Estacao[] estacao = new Estacao[50];
	private int qtdEstacao = 0;
	private Corrida[] corrida = new Corrida[50];
	private int qtdCorrida = 0;
	
	public void carregaDados () {
		Date agora = Calendar.getInstance().getTime();
		
		for (int i = 0; i < 10; i++) {
			telefone[i] = new Telefone("777", "999999999");
			endereco[i] = new Endereco("12345678", "Brasil", "DF", "Brasília", "Quadra " + i, "N° " + i*2);
			usuario[i] = new Usuario("Usuario", "Sobrenome " + i, "example@email", endereco[i], telefone[i], "99999999999", new PlanoFree(agora), 0);
			
			bicicleta[i] = new Bicicleta(false, 26, "Preta", 11, 0);
			estacao[i] = new Estacao("Estacao " + i, endereco[i], 5, 5);
			corrida[i] = new Corrida(usuario[i], 35, agora, bicicleta[i], i);
		}
		
		qtdUsuario = 10;
		qtdEndereco = 10;
		qtdTelefone = 10;
		qtdBicicleta = 10;
		qtdEstacao = 10;
		qtdCorrida = 10;
	}
	
	// Usuario
	public int getQtdUsuarios () {
		return qtdUsuario;
	}
	
	public Usuario[] getUsuarios() {
		return usuario;
	}
	
	public void addUsuario(Usuario u, int pos) {
		this.usuario[pos] = u;
		if(pos == qtdUsuario) qtdUsuario++;
	}
	
	// Endereco
	public void addEndereco(Endereco end, int pos) {
		this.endereco[pos] = end;
		if(pos == qtdEndereco) qtdEndereco++;
	}
	
	public Endereco getEndereco(int pos) {
		return endereco[pos];
	}
	
	// Telefone
	public void addTelefone(Telefone tel, int pos) {
		this.telefone[pos] = tel;
		if(pos == qtdTelefone) qtdTelefone++;
	}
	
	public Telefone getTelefone(int pos) {
		return telefone[pos];
	}
	
	// Bicicleta
	public int getQtdBicicletas () {
		return qtdBicicleta;
	}
	
	public Bicicleta[] getBicicletas() {
		return bicicleta;
	}
	
	public void addBicicleta(Bicicleta b, int pos) {
		this.bicicleta[pos] = b;
		if(pos == qtdBicicleta) qtdBicicleta++;
	}
	
	// Estacao
	public int getQtdEstacoes () {
		return qtdEstacao;
	}
	
	public Estacao[] getEstacoes () {
		return estacao;
	}
	
	// Corrida
	public String getCorrida (int pos) {
		return corrida[pos].getTempoUso() + "min - " + corrida[pos].getKmPedalado() + "km - " + corrida[pos].getDataUso();
	}
	
}
