package controller;

import java.util.InputMismatchException;

import model.*;

public class ControleDados {

	private Dados dados = new Dados();
	
	public ControleDados() {
		dados.carregaDados();
	}
	
	// Usuarios
	public Usuario[] getUsuarios() {
		return this.dados.getUsuarios();
	}
	
	public void addUsuario(int pos, Usuario u) {
		dados.addUsuario(u, pos);
	}
	
	public int getQtdUsuarios () {
		return dados.getQtdUsuarios();
	}
	
	// Enderecos
	public void addEndereco(int pos, Endereco end) {
		dados.addEndereco(end, pos);
	}
	
	public Endereco getEndereco(int pos) {
		return dados.getEndereco(pos);
	}
	
	// Telefone
	public void addTelefone(int pos, Telefone tel) {
		dados.addTelefone(tel, pos);
	}
	
	public Telefone getTelefone(int pos) {
		return dados.getTelefone(pos);
	}
	
	// Bicicletas
	public Bicicleta[] getBicicletas() {
		return this.dados.getBicicletas();
	}
	
	public int getQtdBicicletas () {
		return dados.getQtdBicicletas();
	}
	
	// Estacoes
	public Estacao[] getEstacoes() {
		return this.dados.getEstacoes();
	}
	
	public int getQtdEstacoes () {
		return dados.getQtdEstacoes();
	}
	
	public Estacao getEstacaoNome(String nome) {
		for (int i = 0; i < this.getQtdEstacoes(); i++) {
			if (this.getEstacoes()[i].getNome().equals(nome)) {
				return this.getEstacoes()[i];
			}
		}
		return null;
	}
	
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
	
	// Corridas
	public String getCorrida (int pos) {
		return dados.getCorrida(pos);
	}
	
	public String[] getCorridas (int pos) {
		String[] a = new String[pos];
		for (int i = 0; i < pos; i++) {
			a[i] = (dados.getCorrida(i));
		}
		return a;
	}
	
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
	
	public boolean verificaEmail (String email) {
		if (email.contains("@") && !email.startsWith("@") && email.length() > 5) {
			return true;
		} else {
			return false;
		}
	}
	
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
	
	public boolean verificaTamanho (String entry) {	// Se a entrada for muita pequena
		if (entry.length() <= 3) {
			return false;
		} else {
			return true;
		}
	}
}
