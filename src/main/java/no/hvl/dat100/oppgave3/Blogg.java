package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {
	Innlegg[] innleggsTabell;
	int nesteLedig;

	public Blogg() {
		innleggsTabell = new Innlegg[5];
		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		this.innleggsTabell = new Innlegg[lengde];
		this.nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggsTabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggsTabell[i] != null && innleggsTabell[i].getId() == innlegg.getId()) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggsTabell[i] != null && innleggsTabell[i].getId() == innlegg.getId()) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		return nesteLedig < innleggsTabell.length;
	}

	public boolean leggTil(Innlegg innlegg) {
		if (nesteLedig < innleggsTabell.length && !finnes(innlegg)) {
			innleggsTabell[nesteLedig++] = innlegg;
			return true;
		}
		return false;
	}


	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(nesteLedig).append("\n");

		for (int i = 0; i < nesteLedig; i++) {
			result.append(innleggsTabell[i].toString());
		}

		return result.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}