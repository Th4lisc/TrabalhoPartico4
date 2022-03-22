package model;

public class Bicicleta {

	// Atributos
	private int id;
	private boolean status;
	private String tipo;
	private int aro;
	private String cor;
	private float peso;
	private int kmPedalado;
	
	// Construtor
	public Bicicleta(int id, boolean status, int aro, String cor, float peso, int kmPedalado) {
		setId(id);
		setStatus(status);
		setAro(aro);
		setCor(cor);
		setPeso(peso);
		setKmPedalado(kmPedalado);
	}
	
	// Metodos
		// Gets
	public int getId() {
		return this.id;
	}
	
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
	public void setId(int id) {
		this.id = id;
	}
	
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
	
	public void deletaBicicleta() {
		//
	}
}

