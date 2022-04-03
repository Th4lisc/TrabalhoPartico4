package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.*;
import model.*;

public class TelaCadastro implements ActionListener {

	private static JFrame janela = new JFrame("Cadastro");
	private static JLabel titulo = new JLabel("Cadastro");
	private static JLabel nome = new JLabel("Nome:");
	private static JTextField entrynome = new JTextField();
	private static JLabel sobrenome = new JLabel("Sobrenome:");
	private static JTextField entrysobrenome = new JTextField();
	private static JLabel cpf = new JLabel("Cpf:");
	private static JTextField entrycpf = new JTextField();
	private static JLabel email = new JLabel("Email:");
	private static JTextField entryemail = new JTextField();
	private static JLabel ddd = new JLabel("DDD:");
	private static JTextField entryddd = new JTextField();
	private static JLabel num = new JLabel("N° telefone:");
	private static JTextField entrynum = new JTextField();
	private static JLabel cep = new JLabel("Cep:");
	private static JTextField entrycep = new JTextField();
	private static JLabel pais = new JLabel("Pais:");
	private static JTextField entrypais = new JTextField();
	private static JLabel estado = new JLabel("Estado:");
	private static JTextField entryestado = new JTextField();
	private static JLabel bairro = new JLabel("Bairro:");
	private static JTextField entrybairro = new JTextField();
	private static JLabel ruaQuadra = new JLabel("Rua/Quadra:");
	private static JTextField entryruaQuadra = new JTextField();
	private static JLabel numero = new JLabel("Número:");
	private static JTextField entrynumero = new JTextField();
	private static JButton botao = new JButton("Ok");

	public TelaCadastro() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocation(300, 100);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		nome.setBounds(40, 85, 200, 15);
		nome.setForeground(Color.white);
		entrynome.setBounds(90, 85, 200, 20);
		entrynome.setForeground(Color.black);
		
		sobrenome.setBounds(20, 105, 200, 15);
		sobrenome.setForeground(Color.white);
		entrysobrenome.setBounds(90, 105, 200, 20);
		entrysobrenome.setForeground(Color.black);
		
		cpf.setBounds(40, 125, 200, 15);
		cpf.setForeground(Color.white);
		entrycpf.setBounds(90, 125, 200, 20);
		entrycpf.setForeground(Color.black);
		
		email.setBounds(40, 145, 200, 15);
		email.setForeground(Color.white);
		entryemail.setBounds(90, 145, 200, 20);
		entryemail.setForeground(Color.black);
		
		ddd.setBounds(40, 185, 200, 15);
		ddd.setForeground(Color.white);
		entryddd.setBounds(90, 185, 200, 20);
		entryddd.setForeground(Color.black);
		
		num.setBounds(15, 205, 200, 15);
		num.setForeground(Color.white);
		entrynum.setBounds(90, 205, 200, 20);
		entrynum.setForeground(Color.black);
		
		cep.setBounds(40, 245, 200, 15);
		cep.setForeground(Color.white);
		entrycep.setBounds(90, 245, 200, 20);
		entrycep.setForeground(Color.black);
		
		pais.setBounds(40, 265, 200, 15);
		pais.setForeground(Color.white);
		entrypais.setBounds(90, 265, 200, 20);
		entrypais.setForeground(Color.black);
		
		estado.setBounds(40, 285, 200, 15);
		estado.setForeground(Color.white);
		entryestado.setBounds(90, 285, 200, 20);
		entryestado.setForeground(Color.black);
		
		bairro.setBounds(40, 305, 200, 15);
		bairro.setForeground(Color.white);
		entrybairro.setBounds(90, 305, 200, 20);
		entrybairro.setForeground(Color.black);
		
		ruaQuadra.setBounds(15, 325, 200, 15);
		ruaQuadra.setForeground(Color.white);
		entryruaQuadra.setBounds(90, 325, 200, 20);
		entryruaQuadra.setForeground(Color.black);
		
		numero.setBounds(35, 345, 200, 15);
		numero.setForeground(Color.white);
		entrynumero.setBounds(90, 345, 200, 20);
		entrynumero.setForeground(Color.black);
		
		botao.setBackground(Color.white);
		botao.setBounds(120, 380, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(nome);
		janela.add(entrynome);
		janela.add(sobrenome);
		janela.add(entrysobrenome);
		janela.add(cpf);
		janela.add(entrycpf);
		janela.add(email);
		janela.add(entryemail);
		janela.add(ddd);
		janela.add(entryddd);
		janela.add(num);
		janela.add(entrynum);
		janela.add(cep);
		janela.add(entrycep);
		janela.add(pais);
		janela.add(entrypais);
		janela.add(estado);
		janela.add(entryestado);
		janela.add(bairro);
		janela.add(entrybairro);
		janela.add(ruaQuadra);
		janela.add(entryruaQuadra);
		janela.add(numero);
		janela.add(entrynumero);
		janela.add(botao);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaCadastro cadastro = new TelaCadastro();
		
		botao.addActionListener(cadastro);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == botao) {
			// Verificar dados
			// entao:
			GregorianCalendar d= new GregorianCalendar();
			Date agora = d.getTime();
			
			Telefone tel = new Telefone(entryddd.getText(), entrynum.getText());
			Endereco end = new Endereco(entrycep.getText(), entrypais.getText(), entryestado.getText(), entrybairro.getText(), entryruaQuadra.getText(), entrynumero.getText());
			Usuario usuario = new Usuario(entrynome.getText(), entrysobrenome.getText(), entryemail.getText(), end, tel, entrycpf.getText(), new PlanoFree(agora), 0);
		}
	}

}
