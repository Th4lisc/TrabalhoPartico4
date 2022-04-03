package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaUsuario {

	private static JFrame janela = new JFrame("Usuario");
	private static JLabel nomeUsuario = new JLabel();
	private static JLabel email = new JLabel("email");
	private static JLabel telefone = new JLabel("telll");
	private static JLabel cpf = new JLabel("cpff");
	private static JLabel plano = new JLabel("plano????");
	private static JLabel kmPedalado = new JLabel("km pedalado");
	
	private static JButton editar = new JButton("Editar");
	private static JButton botao = new JButton("Ok");

	public TelaUsuario() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		// Title
		nomeUsuario.setText("Usuário"); // COLOCAR NOME DO USUARIO
		nomeUsuario.setFont(new Font("MS Gothic", Font.BOLD, 24));
		nomeUsuario.setForeground(Color.white);
		nomeUsuario.setBounds(30, 15, 200, 60);
		
		// Body
		
		//email.setText();
		email.setBounds(50, 70, 200, 60);
		email.setForeground(Color.white);
		//telefone.setText();
		telefone.setBounds(50, 100, 200, 60);
		telefone.setForeground(Color.white);
		//cpf.setText();
		cpf.setBounds(50, 130, 200, 60);
		cpf.setForeground(Color.white);
		//plano.setText();
		plano.setBounds(50, 160, 200, 60);
		plano.setForeground(Color.white);
		//kmPedalado.setText();
		kmPedalado.setBounds(50, 190, 200, 60);
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
	}
	
	public static void main(String[] args) {
		TelaUsuario usuario = new TelaUsuario();
		
	}

}
