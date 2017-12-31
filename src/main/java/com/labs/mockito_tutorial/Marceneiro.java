package com.labs.mockito_tutorial;

import java.util.ArrayList;
import java.util.List;

public class Marceneiro {

	private final Serra serra;
	
	public Marceneiro(Serra serra) {
	    this.serra = serra;
	}
	
	public List<Tabua> serra(Tabua tabua) {
	    return new ArrayList<Tabua>();
	}
	
}
