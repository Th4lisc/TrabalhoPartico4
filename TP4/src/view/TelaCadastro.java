package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.*;

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

	public void show() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
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
		
		TelaCadastro cadastro = new TelaCadastro();
		botao.addActionListener(cadastro);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		ControleUsuario us = new ControleUsuario();
		ControleEndereco end = new ControleEndereco();
		ControleTelefone tel = new ControleTelefone();
		
		if (src == botao) {
			// Verificar dados
			if (us.verificaTamanho(entrynome.getText()) && us.verificaTamanho(entrysobrenome.getText())) {
				if (us.verificaCpf(entrycpf.getText())) {
					if(us.verificaEmail(entryemail.getText()) && us.verificaTamanho(entryemail.getText())) {
						// Add usuario
						int id = us.getQtdUsuarios();
						end.addEndereco(id, entrycep.getText(), entrypais.getText(), entryestado.getText(), entrybairro.getText(), entryruaQuadra.getText(), entrynumero.getText());
						tel.addTelefone(id, entryddd.getText(), entrynumero.getText());
						us.addUsuario(id, entrynome.getText(), entrysobrenome.getText(), entryemail.getText(), end.getEndereco(id), tel.getTelefone(id), entrycpf.getText(), 0);
						
						JOptionPane.showMessageDialog(null, "Cadastrado!", "Pronto", JOptionPane.INFORMATION_MESSAGE);
						janela.dispose();
						new TelaMenu().show();
						//
					} else {
						JOptionPane.showMessageDialog(null, "Email inválido", "Erro", JOptionPane.INFORMATION_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Cpf inválido", "Erro", JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Nome ou sobrenome inválidos", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
