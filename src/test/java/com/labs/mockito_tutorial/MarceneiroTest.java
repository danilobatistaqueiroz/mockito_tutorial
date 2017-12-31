package com.labs.mockito_tutorial;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MarceneiroTest {

	private Serra serra;
	
	@Test
	public void deveSerrarUmaTabua() {
		Marceneiro marceneiro = new Marceneiro(serra);
		List<Tabua> tabuas = marceneiro.serra(new Tabua());
	    Assert.assertEquals(2, tabuas.size()); 
	}

}