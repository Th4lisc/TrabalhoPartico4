package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.ControleDados;

/**
 * A classe TelaBuscar constroi a tela que possibilita buscar estacoes por dois diferentes modos:
 * (1) pelo nome da estacao
 * (2) pelo numero de vagas disponiveis na estacao
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class TelaBuscar implements ActionListener {

	static String opcoes[] = {"Estação por nome", "Estação por número de vagas"};
	
	private static JFrame janela = new JFrame("Buscar");
	private static JLabel titulo = new JLabel("Buscar Estação");
	private static JComboBox<String> lista = new JComboBox<String>(opcoes);
	private static JTextField entrybusca = new JTextField();
	private static JLabel nomeEstacao = new JLabel();
	private static JTextArea endEstacao = new JTextArea();
	private static JLabel qtdVagas = new JLabel();
	private static JLabel vagasDisponiveis = new JLabel();
	private static JButton botao = new JButton("Buscar");
	private static JButton voltar = new JButton("Voltar");
	private static ControleDados d;
	
	/**
	 * Metodo que constroi e mostra a tela e seus elementos
	 * @param d ControleDados contendo todos os dados do sistema
	 */

	public void show(ControleDados d) {
		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		this.d = d;
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(30, 15, 200, 60);
		
		lista.setBackground(Color.white);
		lista.setBounds(30, 80, 280, 20);
		
		entrybusca.setBounds(30, 120, 280, 20);
		
		nomeEstacao.setForeground(Color.white);
		nomeEstacao.setBounds(50, 160, 200, 60);
		
		endEstacao.setFont(nomeEstacao.getFont());
		endEstacao.setForeground(Color.white);
		endEstacao.setBackground(Color.darkGray);
		endEstacao.setBounds(50, 220, 260, 40);
		endEstacao.setLineWrap(true);
		
		qtdVagas.setForeground(Color.white);
		qtdVagas.setBounds(50, 250, 200, 60);
		
		vagasDisponiveis.setForeground(Color.white);
		vagasDisponiveis.setBounds(50, 290, 200, 60);
		
		botao.setBackground(Color.white);
		botao.setBounds(60, 360, 100, 30);;
		
		voltar.setBackground(Color.white);
		voltar.setBounds(180, 360, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(lista);
		janela.add(entrybusca);
		janela.add(nomeEstacao);
		janela.add(endEstacao);
		janela.add(qtdVagas);
		janela.add(vagasDisponiveis);
		janela.add(botao);
		janela.add(voltar);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		TelaBuscar buscar = new TelaBuscar();
		
		botao.addActionListener(buscar);
		voltar.addActionListener(buscar);
	}
	
	/**
	 * Metodo que monitora click nos botoes, assim:
	 * (1) o botao for "buscar" realiza uma busca nos dados do sistema levando em conta seu nome ou numero de vagas disponiveis
	 * (2) caso seja o outro botao, fecha a janela
	 */

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botao) {
			switch (lista.getSelectedIndex()){
				case 0:
					if(d.getEstacaoNome(entrybusca.getText()) != null) {
						nomeEstacao.setText("Nome: " + d.getEstacaoNome(entrybusca.getText()).getNome());
						endEstacao.setText("Endereço: " + d.getEstacaoNome(entrybusca.getText()).getEndereco().completo());
						qtdVagas.setText("Total de vagas: " + d.getEstacaoNome(entrybusca.getText()).getNumVagas());
						vagasDisponiveis.setText("Vagas disponíveis: " + d.getEstacaoNome(entrybusca.getText()).getNumVagasDisponiveis());
					} else {
						JOptionPane.showMessageDialog(null, "Estação não encontrada", "Erro", JOptionPane.INFORMATION_MESSAGE);
						}
						
					break;
				case 1:
					if(d.getEstacaoNumVagas(entrybusca.getText()) != null) {
						nomeEstacao.setText("Nome: " + d.getEstacaoNumVagas(entrybusca.getText()).getNome());
						endEstacao.setText("Endereço: " + d.getEstacaoNumVagas(entrybusca.getText()).getEndereco().completo());
						qtdVagas.setText("Total de vagas: " + d.getEstacaoNumVagas(entrybusca.getText()).getNumVagas());
						vagasDisponiveis.setText("Vagas disponíveis: " + d.getEstacaoNumVagas(entrybusca.getText()).getNumVagasDisponiveis());
					} else {
						JOptionPane.showMessageDialog(null, "Estação não encontrada", "Erro", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				default:
					break;
			}
		} else {
			janela.dispose();
		}
	}
}
