package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.*;

public class TelaCorrida implements ActionListener {
	
	private static ControleCorrida cor = new ControleCorrida();
	
	private static JFrame janela = new JFrame("Corridas");
	private static JLabel titulo = new JLabel("Corridas");
	private static JLabel busca = new JLabel("Digite uma data (mm/dd/yyyy):");
	private static JTextField entrybusca = new JTextField();
	private static JList<String> lista = new JList<>(cor.getCorridas(5));
	private static JButton botao = new JButton("Buscar");
	private static JButton voltar = new JButton("Voltar");

	public void show() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		busca.setForeground(Color.white);
		busca.setBounds(30, 85, 280, 15);
		
		entrybusca.setForeground(Color.white);
		entrybusca.setBounds(30, 105, 280, 20);
		
		lista.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lista.setBackground(Color.white);
		lista.setBounds(30, 140, 280, 190);
		
		botao.setBackground(Color.white);
		botao.setBounds(60, 360, 100, 30);
		
		voltar.setBackground(Color.white);
		voltar.setBounds(180, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(busca);
		janela.add(entrybusca);
		janela.add(lista);
		janela.add(botao);
		janela.add(voltar);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		TelaCorrida menu = new TelaCorrida();
		
		botao.addActionListener(menu);
		voltar.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == botao) {
			// buscar
		} else if (src == voltar) {
			//new TelaMenu().show();
			janela.dispose();
		} 
	}
}
