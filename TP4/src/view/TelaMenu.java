package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import controller.*;

public class TelaMenu implements ActionListener {

	private static JFrame janela = new JFrame("Menu");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton perfil = new JButton("Editar Perfil");
	private static JButton plano = new JButton("Editar Plano");
	private static JButton corrida = new JButton("Corridas");
	private static JButton buscar = new JButton("Buscar");

	public TelaMenu() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(45, 25, 250, 60);
				
		perfil.setBackground(Color.white);
		perfil.setBounds(120, 140, 100, 30);
		
		plano.setBackground(Color.white);
		plano.setBounds(120, 190, 102, 30);
		
		corrida.setBackground(Color.white);
		corrida.setBounds(120, 240, 100, 30);
		
		buscar.setBackground(Color.white);
		buscar.setBounds(120, 290, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(perfil);
		janela.add(plano);
		janela.add(corrida);
		janela.add(buscar);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		perfil.addActionListener(menu);
		plano.addActionListener(menu);
		corrida.addActionListener(menu);
		buscar.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		
		if (src == perfil) {
			new TelaUsuario();
		} else if (src == plano) {
			new TelaPlano();
		} else if (src == corrida) {
			new TelaCorrida();
		} else if (src == buscar) {
			new TelaBuscar();
		}
	}

}
