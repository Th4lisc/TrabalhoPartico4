package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TelaBoasvindas implements ActionListener {

	private static JFrame janela = new JFrame("Bem-vindo");
	private static JLabel titulo = new JLabel("Olá, seja bem-vindo");
	private static Container c = janela.getContentPane();
	private static JLabel label = new JLabel();
	private static JButton botao = new JButton("Vamos lá");

	public TelaBoasvindas () {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocation(300, 100);
		janela.setResizable(false);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(45, 25, 250, 60);
		
		label.setIcon(new ImageIcon("bike.png"));
		Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(95, 120, size.width, size.height); //Sets the location of the image
 
        c.add(label); //Adds objects to the container
		
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
		TelaBoasvindas tela1 = new TelaBoasvindas();
		
		botao.addActionListener(tela1);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botao) {
			new TelaCadastro().show();
			janela.dispose();
		}
	}

}
