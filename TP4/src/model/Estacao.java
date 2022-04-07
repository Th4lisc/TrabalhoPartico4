package model;

/**
 * A classe Estacao cadastra, edita, fornece informacoes e deleta os objetos Estacao
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class Estacao {
	
	// Atributos
	private String nome;
	private Endereco endereco;
	private int numVagas;
	private int numVagasDisponiveis;
	
	/**
	 * Metodo construtor da classe
	 * @param nome string que representa o nome da estacao
	 * @param endereco Endereco que representa o endereco da estacao
	 * @param numVagas inteiro que representa o numero de vagas da estacao
	 * @param numVagasDisponiveis inteiro que representa o numero de vagas disponiveis da estacao
	 */
	
	// Construtor
	public Estacao(String nome, Endereco endereco, int numVagas, int numVagasDisponiveis) {
		setNome(nome);
		setEndereco(endereco);
		setNumVagas(numVagas);
		editaEstacao(numVagasDisponiveis);
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
	
	/**
	 * Metodo que possibilita a edicao de um objeto Estacao
	 * @param nome string que representa o nome da estacao
	 * @param endereco Endereco que representa o endereco da estacao
	 * @param numVagas inteiro que representa o numero de vagas da estacao
	 * @param numVagasDisponiveis inteiro que representa o numero de vagas disponiveis da estacao
	 */
	
	public void editaEstacao(String nome, Endereco endereco, int numVagas, int numVagasDisponiveis) {
		this.nome = nome;
		this.endereco = endereco;
		this.numVagas = numVagas;
		this.numVagasDisponiveis = numVagasDisponiveis;
	}
	
	/**
	 * Metodo que possibilita a edicao do numero de vagas disponiveis
	 * @param numVagasDisponiveis inteiro com novo numero de vagas disponiveis
	 */
	
	public void editaEstacao(int numVagasDisponiveis) {
		this.numVagasDisponiveis = numVagasDisponiveis;
	}
	
	public void deletaEstacao() {
		//
	}

}
