package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class TelaBuscar {

	private static JFrame janela = new JFrame("Usuario");
	private static JLabel titulo = new JLabel();
	private static JButton botao = new JButton("Ok");

	public TelaBuscar() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocation(300, 100);
		
		titulo.setText("Buscar"); // COLOCAR NOME DO USUARIO
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		botao.setBackground(Color.white);
		botao.setBounds(120, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(botao);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaBuscar buscar = new TelaBuscar();
	}
}
