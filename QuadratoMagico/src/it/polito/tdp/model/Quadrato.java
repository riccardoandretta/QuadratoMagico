package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.List;

public class Quadrato {

	int n;
	int magic;
	List<Integer> matrice;

	public Quadrato(int n) {
		this.n = n;
		this.magic = n * (n * n + 1) / 2;
		this.matrice = new ArrayList<Integer>();
	}

	public Quadrato(Quadrato q) {
		this.n = q.n;
		this.magic = q.magic;
		this.matrice = new ArrayList<Integer>(q.getMatrice());
	}
	
	private List<Integer> getMatrice() {
		return matrice;
	}

	private boolean checkRows() {
		//TODO
		return false;
		
	}
	
	private boolean checkColumns() {
		//TODO
		return false;
		
	}
	
	private boolean checkDiagonals() {
		//TODO
		return false;
		
	}
	
	public boolean isValid() {
		// quadrato e' una soluzione valida
		return checkRows() & checkColumns() & checkDiagonals(); //se tutti ritornano true allora ritorna true
	}
	
	public boolean contains(int i) {
		return this.matrice.contains(i);
	}
	
	public void add(int i) {
		this.matrice.add(i);
	}
	
	public void remove(int i) {
		this.matrice.remove(Integer.valueOf(i)); // se mettessi solo i non funzionerebbe: rimuoverebbe l'oggetto in posizione i, e non il valore i!
	}
}
