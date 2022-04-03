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
	private static JButton botao = new JButton("Ok");

	public TelaUsuario() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocation(300, 100);
		
		nomeUsuario.setText("Usuário"); // COLOCAR NOME DO USUARIO
		nomeUsuario.setFont(new Font("MS Gothic", Font.BOLD, 24));
		nomeUsuario.setForeground(Color.white);
		nomeUsuario.setBounds(30, 15, 200, 60);
		
		botao.setBackground(Color.white);
		botao.setBounds(120, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(nomeUsuario);
		janela.add(botao);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaUsuario usuario = new TelaUsuario();
		
	}

}
