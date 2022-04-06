package model;

import java.util.Date;

public class Corrida {

	// Atributos
	private Usuario usuario;
	private long tempoUso;
	private Date dataUso;
	private Bicicleta bicicletaUtilizada;
	private int kmPedalado;
	
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
	
	public void addKmPedalado(int km) {
		this.kmPedalado += km;
	}
	
	public void editaCorrida(Usuario usuario, long tempoUso, Date dataUso, Bicicleta bicicletaUtilizada, int kmPedalado) {
		setUsuario(usuario);
		setTempoUso(tempoUso);
		setDataUso(dataUso);
		setBicicletaUtilizada(bicicletaUtilizada);
		setKmPedalado(kmPedalado);
	}
	
	public void deletaCorrida () {
		
	}
}
