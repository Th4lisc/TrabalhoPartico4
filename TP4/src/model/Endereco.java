package model;

/**
 * A classe Endereco cadastra, edita, fornece informacoes e deleta os objetos Endereco
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class Endereco {

	// Atributos Endereco
	private String cep;
	private String pais;
	private String estado;
	private String bairro;
	private String ruaQuadra;
	private String numero;
	
	/**
	 * Metodo construtor da classe
	 * @param cep string que representa o numero do cep
	 * @param pais string que representa o nome do pais
	 * @param estado string que representa o nome do estado
	 * @param bairro string que representa o nome do bairro
	 * @param ruaQuadra string que representa o nome da rua ou quadra
	 * @param numero string que representa o numero da moradia
	 */
		
	// Construtor
	public Endereco(String cep, String pais, String estado, String bairro, String ruaQuadra, String numero) {
		setCep(cep);
		setPais(pais);
		setEstado(estado);
		setBairro(bairro);
		setRuaQuadra(ruaQuadra);
		setNumero(numero);		
	}
	
	/**
	 * Metodo que fornece o endereco completo
	 * @return string que representa o endereco completo
	 */
	
	// Metodos
	public String completo() {
		return (this.getPais() + ", " + this.getEstado() + ", " + this.getBairro() + ", " + this.getRuaQuadra() + ", " + this.getNumero() + " - " + this.getCep());
	}
		// Gets
	public String getCep() {
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
	
	public String getNumero() {
		return this.numero;
	}
	
		// Sets
	public void setCep(String cep) {
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
	
	public void setNumero(String num) {
		this.numero = num;
	}
	
	/**
	 * Metodo que possibilita a edicao de um objeto Endereco
	 * @param cep string que representa o numero do cep
	 * @param pais string que representa o nome do pais
	 * @param estado string que representa o nome do estado
	 * @param bairro string que representa o nome do bairro
	 * @param ruaQuadra string que representa o nome da rua ou quadra
	 * @param numero string que representa o numero da moradia
	 */
	
	public void editaEndereco(String cep, String pais, String estado, String bairro, String ruaQuadra, String numero) {
		setCep(cep);
		setPais(pais);
		setEstado(estado);
		setBairro(bairro);
		setRuaQuadra(ruaQuadra);
		setNumero(numero);
	}
	
	public void deletaEndereco () {
		//
	}
}
