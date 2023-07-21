package loopings;

import java.util.Random;
import java.util.Scanner;

public class testefinal {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Random aleatorio = new Random();
		int n = aleatorio.nextInt(100);
		
		int i;
		System.out.println("Digite um número de 0 a 100 para adivinhar, você tem 5 tentativas: ");
		for(i = 1; i <= 5;i++) {
			int adivinhar = leitura.nextInt();
			if(n == adivinhar) {
				System.out.println("Parabéns você adivinhou o número!");
				System.out.println("Número aleatório da rodada: " + n);
				break;
			}else if(adivinhar< n && i < 5) {
				System.out.println("O número é maior que isso!");
				System.out.println("Tente de novo!");
		}
			else if(n < adivinhar && i < 5) {
				System.out.println("O número é menor do que isso!");
				System.out.println("Tente de novo!");
			}else{
				System.out.println("Suas tentativas acabaram!");
				System.out.println("Número aleatório da rodada: " + n);
				break;
			}
			
		}


	}

}
