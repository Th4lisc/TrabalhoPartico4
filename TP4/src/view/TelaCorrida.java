package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.*;

public class TelaCorrida implements ActionListener {
	
	private static JFrame janela = new JFrame("Corridas");
	private static JLabel titulo = new JLabel("Corridas");
	private static JLabel busca = new JLabel("Últimas 10 corridas realizadas no app:");
	private static JList<String> lista = new JList<>();
	private static JButton voltar = new JButton("Voltar");
	
	private ControleDados d;

	public void show(ControleDados d) {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		this.d = d;
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		busca.setForeground(Color.white);
		busca.setBounds(30, 85, 280, 15);
		
		lista.setListData(d.getCorridas(10));
		lista.setFont(new Font("MS Gothic", Font.BOLD, 12));
		lista.setBackground(Color.white);
		lista.setBounds(30, 115, 280, 230);
		
		voltar.setBackground(Color.white);
		voltar.setBounds(120, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(busca);
		janela.add(lista);
		janela.add(voltar);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		TelaCorrida menu = new TelaCorrida();
		
		voltar.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == voltar) {
			janela.dispose();
		} 
	}
}
