package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * A classe TelaAlugar constroi a tela, mostra um qrcode para aluguel e monitora eventos do usuario no botao
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class TelaAlugar implements ActionListener {

	private static JFrame janela = new JFrame("Alugar");
	private static JLabel titulo = new JLabel("Alugar");
	private static JLabel texto = new JLabel("Mostre o QR Code para a estação");
	private static JLabel qr = new JLabel();
	private static JButton botao = new JButton("Ok");
	
	/**
	 * Metodo que constroi e mostra a tela e seus elementos
	 */

	public void show() {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);

		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		texto.setForeground(Color.white);
		texto.setBounds(30, 60, 200, 60);
		
		qr.setIcon(new ImageIcon("images\\qr.png"));
		qr.setBackground(Color.white);
		qr.setBounds(60, 115, 230, 230);

		botao.setBackground(Color.white);
		botao.setBounds(120, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(texto);
		janela.add(qr);
		janela.add(botao);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		TelaAlugar alugar = new TelaAlugar();
		
		botao.addActionListener(alugar);
	}
	
	/**
	 * Metodo que monitora click no botao e executa metodo de fechar janela
	 */

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == botao) {
			janela.dispose();
		} 
	}
}
