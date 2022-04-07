package model;

/**
 * A classe Bicicleta cadastra, edita, fornece informacoes e deleta os objetos Bicicletas
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class Bicicleta {

	// Atributos
	private boolean status;
	private String tipo;
	private int aro;
	private String cor;
	private float peso;
	private int kmPedalado;
	
	/**
	 * Metodo construtor da classe
	 * @param status booleano que representa se a bicicleta esta em uso ou nao
	 * @param aro inteiro que representa o numero de polegadas da roda
	 * @param cor string que representa a cor
	 * @param peso float que representa o peso
	 * @param kmPedalado inteiro que representa a quantidade de quilometros pedalados
	 */
	
	// Construtor
	public Bicicleta(boolean status, int aro, String cor, float peso, int kmPedalado) {
		setStatus(status);
		setAro(aro);
		setCor(cor);
		setPeso(peso);
		setKmPedalado(kmPedalado);
	}
	
	// Metodos
		// Gets
	public boolean getStatus() {
		return this.status;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getAro() {
		return this.aro;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public int getKmPedalado() {
		return this.kmPedalado;
	}
	
		// Sets
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setAro(int aro) {
		this.aro = aro;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void setKmPedalado(int km) {
		this.kmPedalado = km;
	}
	
	/**
	 * Metodo que adiciona quilometros no contador total
	 * @param km inteiro a ser adicionado
	 */
	
	public void addKmPedalado(int km) {
		this.kmPedalado += km;
	}
	
	/**
	 * Metodo que possibilita a edicao de um objeto Bicicleta
	 * @param status booleano que representa se a bicicleta esta em uso ou nao
	 * @param aro inteiro que representa o numero de polegadas da roda
	 * @param cor string que representa a cor
	 * @param peso float que representa o peso
	 * @param kmPedalado inteiro que representa a quantidade de quilometros pedalados
	 */
	
	public void editaBicicleta(boolean status, int aro, String cor, float peso, int kmPedalado) {
		setStatus(status);
		setAro(aro);
		setCor(cor);
		setPeso(peso);
		setKmPedalado(kmPedalado);
	}
	
	public void deletaBicicleta() {
		//
	}
}

