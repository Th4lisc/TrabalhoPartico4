package model;

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
	//
	public boolean addKmPedalado(float km) {
		this.kmPedalado += km;
		return true;
	}
	
	public void editaUsuario(String nome, String sobrenome, String email, Endereco endereco, Telefone telefone, String cpf, Plano plano, int kmPedalado) {
		setNome(nome);
		setSobrenome(sobrenome);
		setEmail(email);
		setEndereco(endereco);
		setTelefone(telefone);
		setCpf(cpf);
		setPlano(plano);
		setKmPedalado(kmPedalado);
	}
	
	public void deletaUsuario() {		
	}
}
