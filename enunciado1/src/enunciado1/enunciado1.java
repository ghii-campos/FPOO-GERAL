package enunciado1;

import java.util.Scanner;

public class enunciado1 {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	Double celsius, fahrenheit;
	
	System.out.println("Digite o n�mero em celsius:");
	celsius = scanner.nextDouble();
	
	fahrenheit = (celsius * 1.8 + 32);
	
	System.out.println("Valor em fahrenheit: " + fahrenheit);
	
	}

}
