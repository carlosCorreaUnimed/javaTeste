package desafioBanco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		double sInicial = 850.00;
		int i = 0;
		while (i == 0) {
		
		System.out.println("Seu saldo inicial é de R$%.2f".formatted(sInicial));
		System.out.print("""

				1 - Consultar Saldo
				2 - Receber Valor
				3 - Transferir Valor
				4 - Sair
				
				O que deseja fazer?
				""");

		int digita = leitura.nextInt();
		switch (digita) {
		   case 1:
		      System.out.println("\nSeu saldo é de: " + sInicial);
		      break;
		   case 2:
		      System.out.println("\nQuanto você irá receber? ");
		      double receber = leitura.nextDouble();
		      sInicial += receber;
		      System.out.println("\nSaldo atualizado %.2f:".formatted(sInicial));
		      break;
		   case 3:
		      System.out.println("\nQuanto você irá transferir? ");
		      double transferir = leitura.nextDouble();
		      if(transferir > sInicial) {
		    	  System.out.println("\nFalta de saldo para transferência!");
		    	  break;
		      }
		      sInicial -= transferir;
		      System.out.println("\nSaldo atualizado %.2f:".formatted(sInicial));
		      break;
		   case 4:
			      System.out.println("\nVocê saiu do aplicativo");
			      i++;
			      break;
		   default:
		      System.out.println("\nNúmero digitado não é valido!");
		      break;
		}
		}
			
		
	}

}
