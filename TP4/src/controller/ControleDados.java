package controller;

import java.util.InputMismatchException;

import model.*;

/**
 * Fornece a interface para acesso as classes do pacote model
 * @author Thalis Ianzer
 * @version 1.0 (Apr 2022)
 */

public class ControleDados {

	private Dados dados = new Dados();
	
	/**
	 * Construtor da Classe
	 */
	
	public ControleDados() {
		dados.carregaDados();
	}
	
	/**
	 * Fornece acesso a uma lista com todos os usuarios
	 * @return Uma lista com todos os usuarios
	 */
	
	// Usuarios
	public Usuario[] getUsuarios() {
		return this.dados.getUsuarios();
	}
	
	/**
	 * Realiza a adição de um usuario na lista de usuarios do sistema
	 * @param pos um numero inteiro representando a posição da lista onde sera adicionado o usuario
	 * @param u usuario a ser adicionado
	 */
	
	public void addUsuario(int pos, Usuario u) {
		dados.addUsuario(u, pos);
	}
	
	/**
	 * Fornece a quantidade de usuarios cadastrados no sistema
	 * @return numero inteiro representando a quantidade de usuarios cadastrados
	 */
	
	public int getQtdUsuarios () {
		return dados.getQtdUsuarios();
	}
	
	/**
	 * Realiza a adição de um endereco na lista de enderecos do sistema
	 * @param pos um numero inteiro representando a posição da lista onde sera adicionado o endereco
	 * @param end endereco a ser adicionado
	 */
	
	// Enderecos
	public void addEndereco(int pos, Endereco end) {
		dados.addEndereco(end, pos);
	}
	
	/**
	 * Busca um endereco a partir de sua posicao na lista
	 * @param pos um numero inteiro representando a posicao na lista do endereco escolhido
	 * @return objeto endereco
	 */
	
	public Endereco getEndereco(int pos) {
		return dados.getEndereco(pos);
	}
	
	/**
	 * Realiza a adição de um telefone na lista de telefone do sistema
	 * @param pos um numero inteiro representando a posição da lista onde sera adicionado o telefone
	 * @param tel telefone a ser adicionado
	 */
	
	// Telefone
	public void addTelefone(int pos, Telefone tel) {
		dados.addTelefone(tel, pos);
	}
	
	/**
	 * Busca um telefone a partir de sua posicao na lista
	 * @param pos um numero inteiro representando a posicao na lista do telefone escolhido
	 * @return objeto telefone
	 */
	
	public Telefone getTelefone(int pos) {
		return dados.getTelefone(pos);
	}
	
	/**
	 * Fornece acesso a uma lista com todos as bicicletas
	 * @return Uma lista com todos as bicicletas
	 */
	
	// Bicicletas
	public Bicicleta[] getBicicletas() {
		return this.dados.getBicicletas();
	}
	
	/**
	 * Fornece a quantidade de bicicletas cadastradas no sistema
	 * @return numero inteiro representando a quantidade de bicicletas cadastradas
	 */
	
	public int getQtdBicicletas () {
		return dados.getQtdBicicletas();
	}
	
	/**
	 * Fornece acesso a uma lista com todos as estacoes
	 * @return Uma lista com todos as estacoes
	 */
	
	// Estacoes
	public Estacao[] getEstacoes() {
		return this.dados.getEstacoes();
	}
	
	/**
	 * Fornece a quantidade de estacoes cadastradas no sistema
	 * @return numero inteiro representando a quantidade de estacoes cadastradas
	 */
	
	public int getQtdEstacoes () {
		return dados.getQtdEstacoes();
	}
	
	/**
	 * Busca uma estacao a partir do nome desta
	 * @param nome da estacao a ser buscada
	 * @return objeto Estacao caso seja encontrada ou null caso contrario
	 */
	
	public Estacao getEstacaoNome(String nome) {
		for (int i = 0; i < this.getQtdEstacoes(); i++) {
			if (this.getEstacoes()[i].getNome().equals(nome)) {
				return this.getEstacoes()[i];
			}
		}
		return null;
	}
	
	/**
	 * Busca uma estacao a partir do numero de vagas disponiveis desta
	 * @param numero de vagas disponiveis a ser buscada
	 * @return objeto Estacao, caso seja encontrada, ou null caso contrario
	 */
	
	public Estacao getEstacaoNumVagas(String num) {
		
		int numero;
		try {
			numero = Integer.parseInt(num);
		} catch (Exception e) {
			return null;		// Se não for um número, retorna null
		}
		
		for (int i = 0; i < this.getQtdEstacoes(); i++) {
			if (this.getEstacoes()[i].getNumVagasDisponiveis() == numero) {
				return this.getEstacoes()[i];
			}
		}
		return null;
	}
	
	/**
	 * Busca uma corrida a partir de sua posicao na lista
	 * @param pos um numero inteiro representando a posicao na lista da corrida escolhida
	 * @return objeto corrida
	 */
	
	// Corridas
	public String getCorrida (int pos) {
		return dados.getCorrida(pos);
	}
	
	/**
	 * Fornece acesso a uma lista de informacoes de um numero pos de corridas
	 * @param pos numero inteiro representando a quantidade de corridas
	 * @return Uma lista de String com informacoes de cada corrida 
	 */
	
	public String[] getCorridas (int pos) {
		String[] a = new String[pos];
		for (int i = 0; i < pos; i++) {
			a[i] = (dados.getCorrida(i));
		}
		return a;
	}
	
	/**
	 * Verifica se o cpf inserido está no formato correto, verificando se 
	 * (1) os numeros sao iguais
	 * (2) o tamanho da entrada é diferente de 11 (onze)
	 * (3) calculo dos 2 digitos verificadores
	 * @param cpf string representando o cpf inserido
	 * @return verdadeiro ou falso, indicando se a entrada eh um cpf valido ou nao
	 */
	
	// Verificacoes
	public boolean verificaCpf (String cpf) {
		// considera-se erro cpf's formados por uma sequencia de numeros iguais
        if (cpf.equals("00000000000") ||
            cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") ||
            (cpf.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do cpf em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
	}
	
	/**
	 * Verifica se o email inserido esta no formato correto, verificando se 
	 * (1) a entrada contem o caracter @
	 * (2) a entrada comeca com o caracater @
	 * (3) o tamanho da entrada eh menor que 5 (cinco)
	 * @param email string representando o endereco de email inserido
	 * @return verdadeiro ou falso, indicando se a entrada eh um email valido ou nao
	 */
	
	public boolean verificaEmail (String email) {
		if (email.contains("@") && !email.startsWith("@") && email.length() > 5) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Verifica se o ddd inserido esta no formato correto, verificando se:
	 * (1) Eh possivel transformar a entrada em um int
	 * (2) a entrada tem tamanho igual a 3 (três)
	 * @param ddd string representando o ddd inserido
	 * @return verdadeiro ou falso, indicando se a entrada eh um ddd valido ou nao
	 */
	
	public boolean verificaDDD (String ddd) {
		try {
			Integer.parseInt(ddd);
			
			if (ddd.length() != 3) {
				return false;
			} else {
				return true;
			}
			
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Verifica se o numero de telefone inserido esta no formato correto, verificando se:
	 * (1) Eh possivel transformar a entrada em um long
	 * (2) o tamanho da entrada eh igual a 9 (nove)
	 * (3) a entrada comeca com o algarismo "9"
	 * @param numero string representando o numero de telefone inserido
	 * @return verdadeiro ou falso, indicando se a entrada eh um numero valido ou nao
	 */
	
	public boolean verificaNumero (String numero) {
		try {
			Long.parseLong(numero);
			
			if (numero.length() != 9 || !numero.startsWith("9")) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * Verifica se o tamanho da entrada eh maior que 3 (tres)
	 * @param entry string representando a entrada
	 * @return verdadeiro ou falso, indicando se a entrada eh valida ou nao
	 */
	
	public boolean verificaTamanho (String entry) {	// Se a entrada for muita pequena
		if (entry.length() <= 3) {
			return false;
		} else {
			return true;
		}
	}
}
