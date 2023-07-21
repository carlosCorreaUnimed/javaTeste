package tomandoDecisões;

import java.util.Scanner;

public class Leitura {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digita um filme ai");
		String filme = leitura.nextLine();
		System.out.println(filme);
		System.out.println("Qual o ano de lançamento?");
		int anoDeLancamento = leitura.nextInt();
		System.out.println(anoDeLancamento);
		System.out.println("avaliação: ");
		double avaliacao = leitura.nextDouble();
		System.out.println(avaliacao);
	}
}

