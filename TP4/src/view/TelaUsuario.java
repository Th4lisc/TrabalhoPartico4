package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.*;

/**
 * A classe TelaUsuario constroi a tela, mostra informacoes do usuario e monitora eventos do usuario no botao
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class TelaUsuario implements ActionListener {

	private static JFrame janela = new JFrame("Usuario");
	private static JLabel nomeUsuario = new JLabel();
	private static JLabel email = new JLabel();
	private static JLabel telefone = new JLabel();
	private static JLabel cpf = new JLabel();
	private static JLabel plano = new JLabel();
	private static JLabel kmPedalado = new JLabel();
	private static JButton editar = new JButton("Editar");
	private static JButton botao = new JButton("Ok");
	
	private static ControleDados d;
	private static TelaCadastro cadastro;
	
	/**
	 * Metodo que constroi e mostra a tela e seus elementos
	 * @param d ControleDados contendo todos os dados do sistema
	 * @param cadastro TelaCadastro contendo o objeto TelaCadastro cadastro
	 */

	public void show(ControleDados d, TelaCadastro cadastro){
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		this.d = d;
		this.cadastro = cadastro;
		
		int id = this.d.getQtdUsuarios()-1;

		// Title
		nomeUsuario.setText(d.getUsuarios()[id].getNomecompleto());
		nomeUsuario.setFont(new Font("MS Gothic", Font.BOLD, 24));
		nomeUsuario.setForeground(Color.white);
		nomeUsuario.setBounds(30, 15, 300, 60);
		
		// Body
		email.setText("Email: " + d.getUsuarios()[id].getEmail());
		email.setBounds(50, 90, 200, 60);
		email.setForeground(Color.white);
		telefone.setText("Telefone: (" + d.getUsuarios()[id].getTelefone().getDDD() + ") " + d.getUsuarios()[id].getTelefone().getNumero());
		telefone.setBounds(50, 120, 200, 60);
		telefone.setForeground(Color.white);
		cpf.setText("Cpf: " + d.getUsuarios()[id].getCpf());
		cpf.setBounds(50, 150, 200, 60);
		cpf.setForeground(Color.white);
		plano.setText("Plano: " + d.getUsuarios()[id].getPlano());
		plano.setBounds(50, 180, 200, 60);
		plano.setForeground(Color.white);
		kmPedalado.setText("Km pedalados: " + d.getUsuarios()[id].getKmPedalado());
		kmPedalado.setBounds(50, 210, 200, 60);
		kmPedalado.setForeground(Color.white);
		
		// Botoes
		editar.setBackground(Color.white);
		editar.setBounds(120, 320, 100, 30);
		botao.setBackground(Color.white);
		botao.setBounds(120, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(nomeUsuario);
		janela.add(email);
		janela.add(telefone);
		janela.add(cpf);
		janela.add(plano);
		janela.add(kmPedalado);
		janela.add(editar);
		janela.add(botao);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		TelaUsuario usuario = new TelaUsuario();
		
		botao.addActionListener(usuario);
		editar.addActionListener(usuario);
	}
	
	/**
	 * Metodo que monitora click nos botoes, assim:
	 * (1) botao Ok executa metodo de fechar janela
	 * (2) botao Editar executa o metodo editar(true) e setVisible(true) do objeto TelaCadastro cadastro
	 */

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == botao) {
			janela.dispose();
		} else if (src == editar) {
			janela.dispose();
			
			cadastro.editar(true);
			cadastro.setVisible(true);
		} 
	}

}
