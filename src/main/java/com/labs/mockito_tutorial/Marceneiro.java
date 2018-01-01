package com.labs.mockito_tutorial;

import java.util.List;

public class Marceneiro {

	private final Serra serra;
	
	public Marceneiro(Serra serra) {
	    this.serra = serra;
	}
	
	public List<Tabua> serra(Tabua tabua) {
		return serra.corta(tabua);
	}
	
	public int serra(Pedra pedra) {
		return serra.esmirilha(pedra);
	}
	
}
