package br.com.heranca;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void primeiroteste() {
		Gerente gerente = new Gerente();
		gerente.Senha(4444);
		assertEquals(gerente.autentica(4444), true);
	}

	@Test
	public void segundotest() {
		Gerente gerente = new Gerente();
		gerente.Senha(4321);
		assertEquals(gerente.autentica(4322), false);
	}

	@Test
	public void terceiroteste() {
		Gerente gerente = new Gerente();
		gerente.Nome("Jonas");
		assertEquals(gerente.GetNome(), "Jonas");
	}
	
	@Test 
	public void quartoteste() {
		Gerente gerente = new Gerente();
		gerente.Cpf("1122133245");
		assertEquals(gerente.Getcpf(), "1122133245");
	}

	@Test
	public void testetelefone() {
		Funcionarios funcionario = new Funcionarios();
		funcionario.Telefone("98765436");
		assertEquals(funcionario.GetTelefone(), "98765436");
	}
}
