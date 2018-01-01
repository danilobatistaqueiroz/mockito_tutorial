package com.labs.mockito_tutorial;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class NewMarceneiroTest {
	
	Serra serra;
	
	@Before
	public void setup() {
		serra = mock(Serra.class);
		
		when(serra.esmirilha(any(Pedra.class))).thenReturn(10);
		
		when(serra.corta(any(Tabua.class))).thenReturn(Arrays.asList(new Tabua(), new Tabua()));
	}
	
	@Test
	public void deveSerrarUmaTabua() {
		Marceneiro marceneiro = new Marceneiro(serra);
		List<Tabua> tabuas = marceneiro.serra(new Tabua());
	    Assert.assertEquals(2, tabuas.size());
	}
	
	@Test
	public void deveQuebrarUmaPedra() {
		Marceneiro marceneiro = new Marceneiro(serra);
	    int pedras = marceneiro.serra(new Pedra() {});
	    Assert.assertEquals(10,  pedras);
	}

}