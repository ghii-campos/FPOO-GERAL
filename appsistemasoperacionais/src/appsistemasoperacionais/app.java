package appsistemasoperacionais;

public class app {

	public static void main (String[] args) {
		
		System.out.println("sistema operacional: ");
		System.out.println(System.getProperty("os.name"));
		
		System.out.println("Arquitetura do sistema operacional: ");
		System.out.println(System.getProperty("os.arch"));
		
		System.out.println("Versão do sistema operacional: ");
		System.out.println(System.getProperty("os.version"));
		
		System.out.println("Separador de arquivos do Sistema operacional: ");
		System.out.println(System.getProperty("path.saparator"));
		
		System.out.println("Separador de linha: ");
		System.out.println(System.getProperty("line.separator"));
		
		System.out.println("Home do usuario: ");
		System.out.println(System.getProperty("user.name"));
		
		System.out.println("Diretório Corrente de trabalho: ");
		System.out.println(System.getProperty("user.home"));
		
			
	}
}
