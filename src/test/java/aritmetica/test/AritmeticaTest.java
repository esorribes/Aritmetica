package aritmetica.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.core.IsNull.*;

import org.hamcrest.core.IsNot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import aritmetica.Aritmetica;

public class AritmeticaTest {
	private static Aritmetica aritmetica;
	
	@BeforeClass
	public static void init() {
		aritmetica = new Aritmetica();
	}
	
	@AfterClass
	public static void finish() {
		aritmetica = null;
	}

	@Test
	public void testSuma() {
		assertThat(aritmetica, notNullValue());
		assertThat(aritmetica.suma(2, 3), is(5.0f));
	}

	@Test
	public void testResta() {
		assertEquals(3, aritmetica.resta(4, 1), 0);
	}

	@Test
	public void testMultiplicacion() {
		assertEquals(6, aritmetica.multiplicacion(2, 3), 0);
	}

	@Test
	public void testDivision() {
		assertEquals(5, aritmetica.division(10, 2), 0);
	}

}
