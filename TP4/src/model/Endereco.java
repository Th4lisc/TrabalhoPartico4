package model;

public class Endereco {

	// Atributos Endereco
	private long cep;
	private String pais;
	private String estado;
	private String bairro;
	private String ruaQuadra;
	private int numero;
		
	// Construtor
	public Endereco(long cep, String pais, String estado, String bairro, String ruaQuadra, int numero) {
		setCep(cep);
		setPais(pais);
		setEstado(estado);
		setBairro(bairro);
		setRuaQuadra(ruaQuadra);
		setNumero(numero);		
	}
	
	// Metodos
	public String completo() {
		return (this.getPais() + ", " + this.getEstado() + ", " + this.getBairro() + ", " + this.getRuaQuadra() + ", " + this.getNumero() + " - " + this.getCep());
	}
		// Gets
	public long getCep() {
		return this.cep;
	}
	
	public String getPais() {
		return this.pais;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public String getBairro() {
		return this.bairro;
	}
	
	public String getRuaQuadra() {
		return this.ruaQuadra;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
		// Sets
	public void setCep(long cep) {
		this.cep = cep;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setRuaQuadra(String ruaQuadra) {
		this.ruaQuadra = ruaQuadra;
	}
	
	public void setNumero(int num) {
		this.numero = num;
	}
	
	public void editaEndereco(long cep, String pais, String estado, String bairro, String ruaQuadra, int numero) {
		setCep(cep);
		setPais(pais);
		setEstado(estado);
		setBairro(bairro);
		setRuaQuadra(ruaQuadra);
		setNumero(numero);
	}
}
