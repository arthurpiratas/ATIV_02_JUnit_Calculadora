package teste;

import static org.junit.jupiter.api.Assertions.*;
import negocio.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTeste {
	
	ICalculadora calc; 
	
	@BeforeEach
	void setUp() throws Exception {
		
		calc = new Calculadora(); 
	}

	@Test
	void testSomar() {
		assertEquals(7, calc.somar("2", "5"));
	}
	
	@Test
	void testSomarNegativo() {
		assertEquals(-3, calc.somar("2", "-5"));
	}
	
	@Test
	  void testeSomarNulo() {
		 
	    assertThrows(NullPointerException.class, () -> {
	    assertEquals(5, calc.dividir("10" , "")); 
	    });
	  }
	
	
	@Test
	void testeResultadoNaoNulo() {
		assertNotNull(calc.somar("2", "-5"));
	}

	@Test
	void testDividir() {
		assertEquals(5, calc.dividir("10", "2")); 
	}
	 
	@Test()
	void testDividirPorStringErro() {
		/*Erro a*/
		assertEquals(5, calc.dividir("10", "aaaaaa")); 
	}
	
	@Test
	void testRauzQuadrada() {
		assertEquals(9, calc.rauzQuadrada("81")); 
	}
	
	@Test
	  void testeDividirStriong() {
		 
	    assertThrows(NumberFormatException.class, () -> {
	    assertEquals(5, calc.dividir("10", "aaaaaa")); 
	    });
	  }

}
