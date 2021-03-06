package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * A classe TelaBoasVindas constroi a tela inicial e responde a eventos do usuario nesta
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class TelaBoasvindas implements ActionListener {

	private static JFrame janela = new JFrame("Bem-vindo");
	private static JLabel titulo = new JLabel("Ol?, seja bem-vindo");
	private static Container c = janela.getContentPane();
	private static JLabel label = new JLabel();
	private static JButton botao = new JButton("Vamos l?");

	public TelaBoasvindas () {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocation(300, 100);
		janela.setResizable(false);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(45, 25, 250, 60);
		
		label.setIcon(new ImageIcon("images\\bike.png"));
		Dimension size = label.getPreferredSize(); // Tamanho da Imagem
        label.setBounds(95, 130, size.width, size.height); // Posi??o da imagem
 
        c.add(label);
		
		botao.setBackground(Color.white);
		botao.setBounds(120, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(botao);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	/**
	 * Cria novo objeto TelaBoasvindas e adiciona monitorador ao evento de click no botao
	 * @param args
	 */
	
	public static void main(String[] args) {
		TelaBoasvindas tela1 = new TelaBoasvindas();
		
		botao.addActionListener(tela1);
	}
	
	/**
	 * Metodo que monitora click no botao e executa metodo de fechar janela
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botao) {
			new TelaCadastro().show();
			janela.dispose();
		}
	}

}
