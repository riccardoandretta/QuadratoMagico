package it.polito.tdp.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

	List<Quadrato> soluzione;

	public List<Quadrato> findMagicSquare(int n) {

		soluzione = new ArrayList<Quadrato>(); // ogni volta che chiamo il metodo creo una nuova soluzione

		int step = 0;
		Quadrato parziale = new Quadrato(n);

		recursive(step, parziale, n);

		return soluzione;
	}

	private void recursive(int step, Quadrato parziale, int dim) {
		/* DEBUG
		 * 
		 * System.out.println(parziale);
		 * 
		 * */

		// Condizione di terminazione
		if (step >= dim * dim) {
			// soluzione completa
			if (parziale.isValid()) {
				// devo salvare la soluzione completa
				soluzione.add(new Quadrato(parziale)); // Se salvo 'parziale' salvo solo il riferimento e non mi serve,
														// perchè 'parziale' cambia nel tempo
														// ---> devo fare una DEEP COPY
			}
		}

		for (int i = 1; i <= dim * dim; i++) {
			if (!parziale.contains(i)) { // filtro le sol parziali; NOTA: l'if è simmettrico rispetto alle operazioni di
											// add e remove (o entrambe dentro al filtro o entrambe fuori dal filtro)
				parziale.add(i);
				recursive(step + 1, parziale, dim);
				parziale.remove(i);
			}

		}

	}
}
