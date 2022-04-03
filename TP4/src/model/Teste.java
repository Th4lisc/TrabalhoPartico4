package model;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Teste {
	
	// Variaveis para testes
	static int id = 0;
	static GregorianCalendar d= new GregorianCalendar();
	static Date agora = d.getTime();
	
	static Usuario[] allusers = new Usuario[50];
	static Bicicleta[] allbici = new Bicicleta[50];
	static Corrida[] allcorrida = new Corrida[50];
	static Estacao[] allestacoes = new Estacao[10];
	
	static Endereco end = new Endereco("0", "xo", "xo", "xo", "xo", "0");
	static Telefone tel = new Telefone("99", "999999999");
	static Plano plano = new PlanoFree(agora);
	
	
	public static void main(String[] args) {
		
		int opcao = 0;
		
		// Carregando dados
		addBicicleta();
		addUsuario();
		addCorrida();
		addEstacao();
		
		do {
			menu();	// Printa o menu
			opcao = opcao_validada();
			switchCase(opcao);
		} while (opcao != 6);
	}
	
	public static int opcao_validada () {							// Lê e valida a opcao escolhida
		boolean k;
		int opcao = 0;
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		try {
			opcao = leia.nextInt();	// Lê a opção
			k = true;
		} catch (java.util.InputMismatchException e) {		// Trata algum caracter indevido
			System.out.println("Entrada inválida, reinicie o programa");
			k = false;
		}
		
		if(k) {				// Retorna a opcao se for validada
			return opcao;
		} else {			// Retorna 0 se for invalida
			return 0;
		}
	}
	
	public static void menu() {
		println("===============================");
		println("=====Aluguel de bicicletas=====");
		println("===============================");
		println("1. Criar usuario");
		println("2. Listar usuario");
		println("3. Listar bicicleta");
		println("4. Listar corrida");
		println("5. Listar estação");
		println("6. Sair");
		println("===============================");
	}
	
	public static void switchCase(int opcao) {
		
		switch (opcao) {
			case 1:
				case1();
				break;
				
			case 2:
				case2();
				break;
				
			case 3:
				case3();
				break;
				
			case 4:
				case4();
				break;
				
			case 5:
				case5();
				break;
				
			case 6:
				println("Até mais!");
				break;
				
			default:
				println("Opcao invalida, tente novamente");
				println(" ");
				
		}
	}
	
	public static void case1() {
		println("==============Dados=============");
		println("Digite o nome: ");
		String nome = palavraValidada();
		println("Digite o sobrenome: ");
		String sobrenome = palavraValidada();
		
		println("Digite o email: ");
		String email = palavraValidada();
		
		println("============Endereço===========");
		println("Digite o pais: ");
		String pais = palavraValidada();
		println("Digite o estado: ");
		String estado = palavraValidada();
		println("Digite o bairro: ");
		String bairro = palavraValidada();
		println("Digite o rua/quadra: ");
		String ruaQuadra = palavraValidada();
		println("Digite o numero (Apenas numeros): ");
		int numero = (int) numValidado();
		println("Digite o cep (Apenas numeros): ");
		long cep = numValidado();
		
		println("============Telefone===========");
		println("Digite o ddd (Apenas numeros): ");
		int ddd = (int) numValidado();
		println("Digite o telefone (Apenas numeros): ");
		long numTelefone = numValidado();
		println("Digite o cpf (Apenas numeros): ");
		long cpf = numValidado();
		println("Digite o plano (Mensal/Anual/Free): ");
		String qualPlano = palavraValidada();
		
		id++;
		int kmPedalado = 0;
		
		Endereco endereco = new Endereco(cep, pais, estado, bairro, ruaQuadra, numero);
		Telefone telefone = new Telefone(ddd, numTelefone);
		
		Plano plano;
		if(qualPlano == "Mensal") {
			plano = new PlanoMensal(agora);
		} else if(qualPlano == "Anual"){
			plano = new PlanoAnual(agora);
		} else {
			plano = new PlanoFree(agora);
		}
		
		Usuario usuario = new Usuario(nome, sobrenome, email, endereco, telefone, cpf, plano, kmPedalado);
		println("Bem vindo " + usuario.getNomecompleto());
		println("Email: " + usuario.getEmail());
		println("CPF: " + usuario.getCpf());
		println("Endereco: " + usuario.getEndereco());
		println("Telefone: " + usuario.getTelefone());
		println("Plano: " + usuario.getPlano());
		println("Km pedalado: " + usuario.getKmPedalado());
	}
	
	public static void case2() {
		for(int i = 0; i < 50; i++) {
			println(i + " - " + allusers[i].getNomecompleto());
		}
	}

	public static void case3() {
		for(int i = 0; i < 50; i++) {
			println(i + " - " + allbici[i].getStatus());
		}
	}
	
	public static void case4() {
		for(int i = 0; i < 50; i++) {
			println(i + " - " + allcorrida[i].getUsuario() + " time: " + allcorrida[i].getTempoUso() + " bicicleta: " + allcorrida[i].getBicicletaUtilizada() + " Km: " + allcorrida[i].getKmPedalado());
		}
	}
	
	public static void case5() {
		for(int i = 0; i < 10; i++) {
			println(i + " - " + allestacoes[i].getNome() + " " + allestacoes[i].getEndereco() + " Vagas: " + allestacoes[i].getNumVagas() + " Vagas disponiveis: " + allestacoes[i].getNumVagas());
		}
	}	
	
	// Add
	public static void addBicicleta() {
		for(int i = 0; i < 50; i++) {
			allbici[i] = new Bicicleta(false, 19, "green", 10, 0);
		}
	}
	
	public static void addUsuario() {
		for(int i = 0; i < 50; i++) {
			allusers[i] = new Usuario("user", "Sr." + i, "email@email.com", end, tel, i, plano, 0);
		}
	}
	
	public static void addCorrida() {		
		for(int i = 0; i < 50; i++) {
			allcorrida[i] = new Corrida(allusers[i], 60, agora, allbici[i], i);
		}
	}
	
	public static void addEstacao() {
		for(int i = 0; i < 10; i++) {
			allestacoes[i] = new Estacao("Estacao " + i, end, 5, 5);
		}
	}
	
	// Aux.
	public static void println(String a) {
		System.out.println(a);
	}
	
	public static void print(String a) {
		System.out.print(a);
	}

	public static String palavraValidada () {						// Lê e valida a palavra digitada
		boolean k;
		String palavra = "";
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		try {
			palavra = leia.nextLine();						// Lê a linha
			k = true;
		} catch (java.util.InputMismatchException e) {		// Trata algum caracter indevido
			System.out.println("Entrada inválida");
			k = false;
		}
		
		if(k) {												// Retorna a palavra se for validada
			return palavra;
		} else {											// Retorna 0 se for invalida
			return "";
		}
	}

	public static long numValidado () {							// Lê e valida a opcao escolhida
		boolean k;
		long num = 0;
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		try {
			num = leia.nextLong();	// Lê a opção
			k = true;
		} catch (java.util.InputMismatchException e) {		// Trata algum caracter indevido
			System.out.println("Entrada inválida, reinicie o programa");
			k = false;
		}
		
		if(k) {				// Retorna a opcao se for validada
			return num;
		} else {			// Retorna 0 se for invalida
			return 0;
		}
	}
}
