package model;

public class Estacao {
	
	// Atributos
	private String nome;
	private Endereco endereco;
	private int numVagas;
	private int numVagasDisponiveis;
	
	// Construtor
	public Estacao(String nome, Endereco endereco, int numVagas, int numVagasDisponiveis) {
		setNome(nome);
		setEndereco(endereco);
		setNumVagas(numVagas);
		setNumVagasDisponiveis(numVagasDisponiveis);
	}
	
	// Metodos
		// Gets
	public String getNome() {
		return this.nome;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public int getNumVagas() {
		return this.numVagas;
	}
	
	public int getNumVagasDisponiveis() {
		return this.numVagasDisponiveis;
	}
	
		// Sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(Endereco end) {
		this.endereco = end;
	}
	
	public void setNumVagas(int i) {
		this.numVagas = i;
	}
	
	public void setNumVagasDisponiveis(int j) {
		this.numVagasDisponiveis = j;
	}
	
	public void editaEstacao(String nome, Endereco endereco, int numVagas, int numVagasDisponiveis) {
		this.nome = nome;
		this.endereco = endereco;
		this.numVagas = numVagas;
		this.numVagasDisponiveis = numVagasDisponiveis;
	}
	
	public void editaEstacao(int numVagasDisponiveis) {
		this.numVagasDisponiveis = numVagasDisponiveis;
	}
	
	public void deletaEstacao() {
		//
	}

}
