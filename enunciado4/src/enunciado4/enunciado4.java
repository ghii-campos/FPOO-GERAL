package enunciado4;

import java.util.Scanner;

public class enunciado4 {

public static void main(String[] args) {
	
	String A, B, C;
	
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Informe um nome para A: ");
	A = scanner.next();
	
	System.out.println("Informe um nome para B: ");
	B = scanner.next();
	
	C = A;
	B = A;
	B = C;
	
	System.out.println("A: "+ A);
	System.out.println("B: "+ B);
	System.out.println("c: "+ A);

}

}
