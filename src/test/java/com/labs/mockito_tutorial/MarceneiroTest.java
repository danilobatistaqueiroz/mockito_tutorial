package com.labs.mockito_tutorial;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MarceneiroTest {

	@Mock
	private Serra serra;
	
	@Before
	public void setup() {
	    MockitoAnnotations.initMocks(this);
	    when(serra.corta((Tabua)notNull()))
	      .thenReturn(Arrays.asList(new Tabua(), new Tabua()));
	}
	
	@Test
	public void deveSerrarUmaTabua() {
		Marceneiro marceneiro = new Marceneiro(serra);
		List<Tabua> tabuas = marceneiro.serra(new Tabua());
	    Assert.assertEquals(2, tabuas.size()); 
	}

}