package model;

public class Telefone {

	// Atributos Telefone
	private int ddd;
	private long numero;
	
	// Construtor
	public Telefone(int ddd, long numero) {
		setDDD(ddd);
		setNumero(numero);
	}
	
	// Metodos
		// Gets
	public int getDDD() {
		return this.ddd;
	}
	
	public long getNumero() {
		return this.numero;
	}
		
		// Sets
	public void setDDD(int ddd) {
		this.ddd = ddd;
	}
	
	public void setNumero(long num) {
		this.numero = num;
	}
	
	public boolean editaTelefone(int ddd, long numero) {
		this.ddd = ddd;
		this.numero = numero;
		
		return true;
	}
	
	public boolean deletaTelefone() {
		
		return true;
	}
}
