package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaCorrida {

	static String corridas[] = {"primeira", "segunda", "terceira"};
	
	private static JFrame janela = new JFrame("Corridas");
	private static JLabel titulo = new JLabel("Corridas");
	private static JList<String> lista = new JList<String>(corridas);
	private static JButton botao = new JButton("Ok");

	public TelaCorrida() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		lista.setBackground(Color.white);
		lista.setBounds(30, 80, 280, 250);
		
		botao.setBackground(Color.white);
		botao.setBounds(120, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(lista);
		janela.add(botao);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaCorrida menu = new TelaCorrida();
		
	}

}
