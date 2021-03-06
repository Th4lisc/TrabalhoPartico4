package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.*;

/**
 * A classe TelaMenu constroi a tela, mostra botoes e monitora eventos do usuario no botao
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 */

public class TelaMenu implements ActionListener {

	private static JFrame janela = new JFrame("Menu");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton alugar = new JButton("Alugar");
	private static JButton perfil = new JButton("Perfil");
	private static JButton plano = new JButton("Planos");
	private static JButton corrida = new JButton("Corridas");
	private static JButton buscar = new JButton("Buscar");
	
	private static ControleDados d;
	private static TelaCadastro cadastro;
	
	private boolean visivel = false;
	
	/**
	 * Metodo que constroi e mostra a tela e seus elementos
	 * @param d ControleDados contendo todos os dados do sistema
	 * @param cadastro TelaCadastro contendo o objeto TelaCadastro cadastro
	 */

	public void show(ControleDados d, TelaCadastro cadastro) {
		
		this.d = d;
		this.cadastro = cadastro;

		janela.getContentPane().setBackground(Color.darkGray);
		janela.setLocationByPlatform(true);
		janela.setResizable(false);
		
		titulo.setFont(new Font("MS Gothic", Font.BOLD, 24));
		titulo.setForeground(Color.white);
		titulo.setBounds(45, 25, 250, 60);
		
		alugar.setBackground(Color.white);
		alugar.setBounds(120, 140, 100, 30);
				
		perfil.setBackground(Color.white);
		perfil.setBounds(120, 190, 100, 30);
		
		plano.setBackground(Color.white);
		plano.setBounds(120, 240, 102, 30);
		
		corrida.setBackground(Color.white);
		corrida.setBounds(120, 290, 100, 30);
		
		buscar.setBackground(Color.white);
		buscar.setBounds(120, 340, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(alugar);
		janela.add(perfil);
		janela.add(plano);
		janela.add(corrida);
		janela.add(buscar);
		
		janela.setSize(360, 480);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		if (!visivel) {
			janela.setVisible(true);
		}
		
		TelaMenu menu = new TelaMenu();
		
		alugar.addActionListener(menu);
		perfil.addActionListener(menu);
		plano.addActionListener(menu);
		corrida.addActionListener(menu);
		buscar.addActionListener(menu);
	}
	
	/**
	 * Metodo que monitora click nos botoes, assim:
	 * (1) botao alugar executa o metodo show do objeto TelaAlugar()
	 * (2) botao perfil executa o metodo show do objeto TelaUsuario() passando os parametros de dados e o objeto TelaCadastro cadastro
	 * (3) botao plano executa o metodo show do objeto TelaPlano() passando o parametro de dados
	 * (4) botao corrida executa o metodo show do objeto TelaCorrida() passando o parametro de dados
	 * (5) botao buscar executa o metodo show do objeto TelaBuscar() passando o parametro de dados
	 */
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == alugar) {
			new TelaAlugar().show();
			
		} else if (src == perfil) {
			new TelaUsuario().show(d, cadastro);
			
		} else if (src == plano) {
			new TelaPlano().show(d);
			
		} else if (src == corrida) {
			new TelaCorrida().show(d);
			
		} else if (src == buscar) {
			new TelaBuscar().show(d);
		}
	}
	
	/**
	 * Metodo que define a visibilidade da tela de menu
	 * @param o booleano que representa (verdadeiro) tela visivel ou (falso) tela nao visivel
	 */
	
	public void setVisible (boolean o) {
		this.visivel = o;
		janela.setVisible(o);
	}

}
