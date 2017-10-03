package br.com.heranca;

public class Gerente extends Funcionarios {

	int senha;
	int codigo;

	public int Senha(int senhaa) {
		return senha = senhaa;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

}
