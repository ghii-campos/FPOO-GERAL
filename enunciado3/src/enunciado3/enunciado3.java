package enunciado3;

import java.util.Scanner;

public class enunciado3 {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	double tempo, velocidade, distancia, litro;
	
	System.out.println("Tempo gasto:");
	tempo = scanner.nextDouble();
	
	System.out.println("Tempo gasto:");
	velocidade = scanner.nextDouble();
	
	distancia = (tempo * velocidade);
	
	litro = (distancia /12);
	
	System.out.println("Litros gatos: " + litro);
	
	
	}

}

