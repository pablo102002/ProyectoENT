package Productos;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JTextField;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MetodosTestJUnit {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testComprobarCantidadValida() {
		
		JTextField prueba = new JTextField("0.1");
		boolean Valido = Metodos.comprobarCantidadValida(prueba);
		
		assertEquals(false, Valido);
	}

	@Test
	void testComprobarCantidadValida2() {
		
		JTextField prueba = new JTextField("-1");
		boolean Valido = Metodos.comprobarCantidadValida(prueba);
		
		assertEquals(false, Valido);
	}
	
	@Test
	void testComprobarCantidadValida3() {
		
		JTextField prueba = new JTextField("3");
		boolean Valido = Metodos.comprobarCantidadValida(prueba);
		
		assertEquals(true, Valido);
	}
}
