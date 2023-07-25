package br.com.main;

import br.com.classes.veiculo;

public class main {

	public static void main(String[] args) {
		
		//INICIANDO OBJETO
		veiculo carro = new veiculo();
		carro.nome = "Corsa";
		carro.cor = "Amarelo";
		carro.motor = "16cv";
		carro.velocidade = 100;
		
		
		System.out.println("Nome: "+ carro.nome);
		System.out.println("Cor: "+ carro.cor);
		System.out.println("Motor: "+ carro.motor);
		System.out.println("Velocidade: "+ carro.velocidade);
		
		carro.ligar();
		
		
		//INICIANDO OBJETO
				veiculo carro2 = new veiculo();
				carro2.nome = "Prisma";
				carro2.cor = "Azul";
				carro2.motor = "16cv";
				carro2.velocidade = 100;
			
				
				System.out.println("Nome: "+ carro2.nome);
				System.out.println("Cor: "+ carro2.cor);
				System.out.println("Motor: "+ carro2.motor);
				System.out.println("Velocidade: "+ carro2.velocidade);
				
				carro2.ligar();
				
				
		
	}

}

