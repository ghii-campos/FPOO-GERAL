package enunciado2;

import java.util.Scanner;

public class enunciado2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double celsius, fahrenheit ; 
		
		System.out.println("Digite o número em fahrenheit:");
		fahrenheit = scanner.nextDouble();
		
		celsius = (fahrenheit - 32 / 1.8 );
		
		System.out.println("Valor em fahrenheit:" + celsius);
		
	}

}
