package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaPlano {

	private static JFrame janela = new JFrame("Planos");
	private static JLabel titulo = new JLabel("Planos");
	
	private static JButton botao = new JButton("Ok");

	public TelaPlano() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		// Faltando imagem
		
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
		TelaPlano menu = new TelaPlano();
		
	}


}
