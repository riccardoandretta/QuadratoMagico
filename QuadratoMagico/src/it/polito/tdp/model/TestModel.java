package it.polito.tdp.model;

import java.util.List;

public class TestModel {

	public static void main(String[] args) {

		Model model = new Model();
		List<Quadrato> quadrati = model.findMagicSquare(3); // voglio tutte le soluzioni
		
		for (Quadrato q : quadrati) {
			System.out.println(q);
		}
	}

}
