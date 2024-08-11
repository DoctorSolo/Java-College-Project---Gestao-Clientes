package br.uemg.clientes;

public class PessoaFisica extends Cliente {
	private final String CPF;
	
	
	public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.CPF = cpf;
	}


	public String getCPF() {
		return CPF;
	}


	@Override
	public String toString() {
		return "PessoaFisica [CPF=" + CPF + "]";
	}

}
