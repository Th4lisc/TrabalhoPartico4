package model;

import java.util.Date;

/**
 * A classe Corrida cadastra, edita, fornece informacoes e deleta os objetos Corrida
 * @author Thalis Ianzer
 * @version 1.0 (apr 2022)
 *
 */

public class Corrida {

	// Atributos
	private Usuario usuario;
	private long tempoUso;
	private Date dataUso;
	private Bicicleta bicicletaUtilizada;
	private int kmPedalado;
	
	/**
	 * Metodo construtor da classe
	 * @param usuario Usuario que representa o usuario que realizou a corrida
	 * @param tempoUso long que representa o numero de minutos de duracao
	 * @param dataUso Date que representa a data da corrida
	 * @param bicicletaUtilizada Bicicleta que representa a bicicleta utilizada
	 * @param kmPedalado inteiro que representa a quantidade de quilometros pedalados
	 */
	
	// Construtor
	public Corrida(Usuario usuario, long tempoUso, Date dataUso, Bicicleta bicicletaUtilizada, int kmPedalado) {
		setUsuario(usuario);
		setTempoUso(tempoUso);
		setDataUso(dataUso);
		setBicicletaUtilizada(bicicletaUtilizada);
		setKmPedalado(kmPedalado);
	}
	
	// Metodos
		// Gets
	public String getUsuario() {
		return this.usuario.getNomecompleto();
	}
	
	public long getTempoUso() {
		return this.tempoUso;
	}
	
	public Date getDataUso() {
		return this.dataUso;
	}
	
	public String getBicicletaUtilizada() {
		return this.bicicletaUtilizada.getTipo();
	}
	
	public int getKmPedalado() {
		return this.kmPedalado;
	}
	
		// Sets
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void setTempoUso(long tempoUso) {
		this.tempoUso = tempoUso;
	}
	
	public void setDataUso(Date data) {
		this.dataUso = data;
	}
	
	public void setBicicletaUtilizada(Bicicleta bike) {
		this.bicicletaUtilizada = bike;
	}
	
	public void setKmPedalado(int km) {
		this.kmPedalado = km;
	}
	
	/**
	 * Metodo que adiciona quilometros no contador total
	 * @param km inteiro a ser adicionado
	 */
	
	public void addKmPedalado(int km) {
		this.kmPedalado += km;
	}
	
	/**
	 * Metodo que possibilita a edicao de um objeto Corrida
	 * @param usuario Usuario que representa o usuario que realizou a corrida
	 * @param tempoUso long que representa o numero de minutos de duracao
	 * @param dataUso Date que representa a data da corrida
	 * @param bicicletaUtilizada Bicicleta que representa a bicicleta utilizada
	 * @param kmPedalado inteiro que representa a quantidade de quilometros pedalados
	 */
	
	public void editaCorrida(Usuario usuario, long tempoUso, Date dataUso, Bicicleta bicicletaUtilizada, int kmPedalado) {
		setUsuario(usuario);
		setTempoUso(tempoUso);
		setDataUso(dataUso);
		setBicicletaUtilizada(bicicletaUtilizada);
		setKmPedalado(kmPedalado);
	}
	
	public void deletaCorrida () {
		//
	}
}
