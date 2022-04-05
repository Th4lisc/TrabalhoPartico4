package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

import controller.*;

public class TelaPlano implements ActionListener {

	private static String[] l = {"Free", "Pago (R$ 169,9) | Anual", "Pago (R$ 19,9) | Mensal"};
	private static JFrame janela = new JFrame("Planos");
	private static JLabel titulo = new JLabel("Planos");
	private static JLabel planoAtualtexto = new JLabel("Seu plano atual:");
	private static JLabel planoAtual = new JLabel();
	private static JList<String> allPlanos = new JList<>(l);
	private static JButton botao = new JButton("Ok");
	
	//private static ControleUsuario us;
	private static ControleDados d;

	public void show(ControleDados d){//ControleUsuario us) {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		planoAtualtexto.setFont(new Font("MS Gothic", Font.BOLD, 13));
		planoAtualtexto.setForeground(Color.white);
		planoAtualtexto.setBounds(50, 100, 200, 30);
		
		planoAtual.setText(d.getUsuarios()[d.getQtdUsuarios()-1].getPlano());
		planoAtual.setFont(new Font("MS Gothic", Font.BOLD, 22));
		planoAtual.setForeground(Color.white);
		planoAtual.setBounds(170, 100, 200, 30);
		
		allPlanos.setFont(new Font("MS Gothic", Font.BOLD, 16));
		allPlanos.setForeground(Color.white);
		allPlanos.setBackground(Color.darkGray);
		allPlanos.setBounds(80, 200, 200, 90);
		
		botao.setBackground(Color.white);
		botao.setBounds(120, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(planoAtual);
		janela.add(planoAtualtexto);
		janela.add(allPlanos);
		janela.add(botao);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		TelaPlano plano = new TelaPlano();
		
		botao.addActionListener(plano);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == botao) {
			janela.dispose();
		}
	}


}
