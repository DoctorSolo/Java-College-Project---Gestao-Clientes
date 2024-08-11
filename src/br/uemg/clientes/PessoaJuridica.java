package br.uemg.clientes;

public class PessoaJuridica extends Cliente {
	private String nomeFantasia;
	private String cnpj;
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public PessoaJuridica(String nome, String endereco, String telefone, String nomeFantasia, String cnpj) {
		super(nome, endereco, telefone);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}
	
	
	public void imprimirDados() {
		System.out.println("Nome: "		+ getNome());
		System.out.println("Endere�o: " + getEndereco());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Nome Fantasia: "	+ nomeFantasia);
		System.out.println("CNPJ: " 			+ cnpj);
	}

	@Override
	public String toString() {
		return "PessoaJuridica [nomeFantasia=" + nomeFantasia + ", cnpj=" + cnpj + "]";
	}
}
