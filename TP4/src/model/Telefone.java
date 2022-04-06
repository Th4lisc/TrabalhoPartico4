package model;

public class Telefone {

	// Atributos Telefone
	private String ddd, numero;
	
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
	
	public void editaTelefone(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public void deletaTelefone() {

	}
}
