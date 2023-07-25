package br.com.projeto;

import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class app {

	public static void main(String[] args) {
		
		Diarista diarista = new Diarista();
		
		diarista.nome = "João da Silva";
		diarista.telefone = "11987577859";
		diarista.endereco = "Av Cajamar, N 111";
		diarista.chavePix = "123";
		
		
		
		System.out.println("Nome Diarista: " + diarista.nome);
		System.out.println("Telefone Diarista: " + diarista.telefone);
		System.out.println("Endereço Diarista: " + diarista.endereco);
		diarista.atender(" Daniel");
		
		Cliente cliente = new Cliente();
		
		System.out.println("=======================================");
		
		cliente.nome = "Daniel";
		cliente.telefone = "(11) 91246-4563";
		cliente.endereco = "Rua das Americas";
		cliente.saldo = 100.0;
		
		System.out.println("Nome Cliente: " + cliente.nome);
		System.out.println("Telefone Cliente: " + cliente.telefone);
		System.out.println("Endereço Cliente: " + cliente.endereco);
		
		

	}

}
