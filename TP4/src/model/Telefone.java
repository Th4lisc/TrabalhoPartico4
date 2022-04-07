package model;

/**
 * A classe Telefone cadastra, edita, fornece informacoes e deleta os objetos Telefone
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class Telefone {

	// Atributos Telefone
	private String ddd, numero;
	
	/**
	 * Metodo construtor da classe
	 * @param ddd string que representa o numero de ddd
	 * @param numero string que representa o numero de telefone
	 */
	
	// Construtor
	public Telefone(String ddd, String numero) {
		setDDD(ddd);
		setNumero(numero);
	}
	
	// Metodos
		// Gets
	public String getDDD() {
		return this.ddd;
	}
	
	public String getNumero() {
		return this.numero;
	}
		
		// Sets
	public void setDDD(String ddd) {
		this.ddd = ddd;
	}
	
	public void setNumero(String num) {
		this.numero = num;
	}
	
	/**
	 * Metodo que possibilita a edicao de um objeto Telefone
	 * @param ddd string que representa o numero de ddd
	 * @param numero string que representa o numero de telefone
	 */
	
	public void editaTelefone(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public void deletaTelefone() {
		//
	}
}
