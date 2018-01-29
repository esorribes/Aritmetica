package aritmetica;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNull.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class AritmeticaTests {
	private static Aritmetica aritmetica;
	
	@BeforeAll
	public static void init() {
		aritmetica = new Aritmetica();
	}
	
	@AfterAll
	public static void finish() {
		aritmetica = null;
	}

	@Test
	public void testSuma() {
		assertThat(aritmetica, notNullValue());
		assertThat(aritmetica.suma(2, 3), is(5.0));
	}

	@Test
	public void testResta() {
		assertEquals(3, aritmetica.resta(4, 1), 0.0001);
	}

	@Test
	public void testMultiplicacion() {
		assertEquals(6, aritmetica.multiplicacion(2, 3), 0.0001);
	}

	@Test
	public void testDivision() {
		assertEquals(5, aritmetica.division(10, 2), 0.0001);
	}

}
