package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaBuscar implements ActionListener {

	static String opcoes[] = {"Corrida por data", "Estação por nome", "Estação por número de vagas"};
	
	private static JFrame janela = new JFrame("Buscar");
	private static JLabel titulo = new JLabel("Buscar");
	private static JComboBox<String> lista = new JComboBox<String>(opcoes);
	private static JTextField entrybusca = new JTextField();
	private static JButton botao = new JButton("Buscar");

	public TelaBuscar() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		lista.setForeground(Color.white);
		lista.setBounds(30, 80, 280, 20);
		
		entrybusca.setBounds(30, 120, 280, 20);
		
		botao.setBackground(Color.white);
		botao.setBounds(120, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(lista);
		janela.add(entrybusca);
		janela.add(botao);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaBuscar buscar = new TelaBuscar();
		
		botao.addActionListener(buscar);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botao)
			switch (lista.getSelectedIndex()){
				case 0:
					// Corrida por data
					System.out.println(entrybusca.getText());
					break;
				case 1:
					// Estacao por nome
					break;
				case 2:
					// Estacao por num de vagas
					break;
				default:
					break;
			}
	}
}
