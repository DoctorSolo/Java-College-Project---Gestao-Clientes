package br.uemg.app;
import br.uemg.clientes.PessoaFisica;
import br.uemg.clientes.PessoaJuridica;
import br.uemg.clientes.Cliente;


public class App {

	public static void main(String[] args) {
		Cliente cl0 	   = new Cliente("snaf", "eowjfoj", "646646");
		PessoaFisica cl1   = new PessoaFisica("lsjf", "sjlsf", "4646", "64646X");
		PessoaJuridica cl2 = new PessoaJuridica("sffs", "slsjlf","4646", "Ghost", "54646X");
		
		System.out.println(cl0);
		System.out.println(cl1);
		System.out.println(cl2);

	}

}
