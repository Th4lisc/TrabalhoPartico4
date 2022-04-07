package model;

/**
 * A classe Usuario cadastra, edita, fornece informacoes e deleta os objetos Usuario
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class Usuario {
	
	// Atributos usuario
	private String nome;
	private String sobrenome;
	private String email;
	private Endereco endereco;
	private Telefone telefone;
	private String cpf;
	private Plano plano;
	private int kmPedalado;
	
	/**
	 * Metodo construtor da classe
	 * @param nome string que representa o nome do usuario
	 * @param sobrenome string que representa o sobrenome do usuario
	 * @param email string que representa o email do usuario
	 * @param endereco Endereco que representa o endereco do ususario
	 * @param telefone Telefone que representa o telefone do ususario
	 * @param cpf string que representa o cpf do usuario
	 * @param plano Plano que representa o plano do usuario
	 * @param kmPedalado inteiro que representa o numero de quilometros pedalado pelo usuario
	 */
	
	// Construtor
	public Usuario (String nome, String sobrenome, String email, Endereco endereco, Telefone telefone, String cpf, Plano plano, int kmPedalado) {
		setNome(nome);
		setSobrenome(sobrenome);
		setEmail(email);
		setEndereco(endereco);
		setTelefone(telefone);
		setCpf(cpf);
		setPlano(plano);
		setKmPedalado(kmPedalado);
	}
	
	// Metodos	
		// Gets	
	public String getNomecompleto() {
		return (this.nome + " " + this.sobrenome);
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public Telefone getTelefone() {
		return this.telefone;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getPlano() {
		return plano.getTipo();
	}
	
	public int getKmPedalado() {
		return this.kmPedalado;
	}
	
		// Sets	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setEndereco(Endereco end) {
		this.endereco = end;
	}
	
	public void setTelefone(Telefone tel) {
		this.telefone = tel;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setPlano(Plano plan) {
		this.plano = plan;
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
	 * Metodo que possibilita a edicao de um objeto Usuario
	 * @param nome string que representa o nome do usuario
	 * @param sobrenome string que representa o sobrenome do usuario
	 * @param email string que representa o email do usuario
	 * @param endereco Endereco que representa o endereco do ususario
	 * @param telefone Telefone que representa o telefone do ususario
	 * @param cpf string que representa o cpf do usuario
	 * @param plano Plano que representa o plano do usuario
	 * @param kmPedalado inteiro que representa o numero de quilometros pedalado pelo usuario
	 */
	
	public void editaUsuario(String nome, String sobrenome, String email, Endereco endereco, Telefone telefone, String cpf, int kmPedalado) {
		setNome(nome);
		setSobrenome(sobrenome);
		setEmail(email);
		setEndereco(endereco);
		setTelefone(telefone);
		setCpf(cpf);
		setKmPedalado(kmPedalado);
	}

	public void deletaUsuario() {
		//
	}
}
