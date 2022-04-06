package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import controller.*;

class Teste {
	ControleDados d = new ControleDados();

	@Test
	void testValidaCPF() {
		assertTrue(d.verificaCpf("05522646101")); // cpf valido
		assertFalse(d.verificaCpf("a5522646101")); // cpf invalido
		assertFalse(d.verificaCpf("666"));	// cpf invalido
		assertFalse(d.verificaCpf("1234568919"));	// cpf invalido
	}
	
	@Test
	void testValidaEmail() {
		assertTrue(d.verificaEmail("thaliscezar@gmail.com")); // email valido
		assertTrue(d.verificaEmail("example@mail.com")); // email valido
		assertFalse(d.verificaEmail("@gmail.comABLUBLE")); // email invalido
		assertFalse(d.verificaEmail("@")); // email invalido
		assertFalse(d.verificaEmail("")); // email invalido
	}
	
	@Test
	void testValidaDDD() {
		assertTrue(d.verificaDDD("061"));	// ddd valido
		assertTrue(d.verificaDDD("011"));	// ddd valido
		assertFalse(d.verificaDDD("abc"));	// ddd invalido
		assertFalse(d.verificaDDD("11"));	// ddd invalido
		assertFalse(d.verificaDDD(""));	// ddd invalido
	}
	
	@Test
	void testValidaNumero() {
		assertTrue(d.verificaNumero("995958134")); // numero valido
		assertFalse(d.verificaNumero("002568984")); // numero invalido
		assertFalse(d.verificaNumero("9e5958134")); // numero invalido
		assertFalse(d.verificaNumero("umdoistres")); // numero invalido
	}
	
	@Test
	void testValidaEntrada() {
		assertTrue(d.verificaTamanho("João")); // entrada valida
		assertFalse(d.verificaTamanho("oi")); // entrada invalida
		assertFalse(d.verificaTamanho("")); // entrada invalida
	}

}
