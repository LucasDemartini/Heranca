package br.com.heranca;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void testesenhagerentet() {
		Gerente gerente = new Gerente();
		gerente.Senha(4444);
		assertTrue(gerente.autentica(4444));
	}

	@Test
	public void testesenhagerentef() {
		Gerente gerente = new Gerente();
		gerente.Senha(4321);
		assertFalse(gerente.autentica(4322));
	}

	@Test
	public void terceiroteste() {
		Gerente gerente = new Gerente();
		gerente.Nome("Jonas");
		gerente.Cpf("1122133245");
		assertEquals(gerente.GetNome(), "Jonas");
		assertEquals(gerente.Getcpf(), "1122133245");
	}

	@Test
	public void testetelefone() {
		Funcionarios funcionario = new Funcionarios();
		funcionario.Telefone("98765436");
		assertEquals(funcionario.GetTelefone(), "98765436");
	}
}
