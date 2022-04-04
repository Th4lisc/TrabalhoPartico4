package controller;

import java.util.Calendar;
import java.util.Date;

import javax.swing.JList;

public class ControleCorrida {

	ControleDados dados = new ControleDados();
	Date agora = Calendar.getInstance().getTime();
	
	public ControleCorrida () {
		
	}
	
	// Gets
	public JList<String> getCorridas (int pos) {
		String[] a = new String[pos];
		for (int i = 0; i < pos; i++) {
			a[i] = (dados.getCorrida(i));
		}
		return a;
	}
}
