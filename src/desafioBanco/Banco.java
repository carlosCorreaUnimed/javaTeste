package desafioBanco;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		
		
		Clientes pessoa1 = new Clientes("Ruan", 15, 800.00, false);
		Clientes pessoa2 = new Clientes("Júlio", 23, 1250.00, false);
		
		//double pessoa1.getSaldo()= 850.00;
		System.out.println("Escolha com qual usuário você quer entrar: ");
		int escolher = leitura.nextInt();
		int i = 0;
		if (escolher == 1) {
			System.out.println("Seu saldo inicial é de R$%.2f".formatted(pessoa1.getSaldo()));
		}else if (escolher == 2) {
			System.out.println("Seu saldo inicial é de R$%.2f".formatted(pessoa2.getSaldo()));
		}else {
			System.out.println("Essa conta não existe");
		}
		while (i == 0) {
		System.out.print("""

				1 - Consultar Saldo
				2 - Receber Valor
				3 - Transferir Valor
				4 - Sair
				
				O que você deseja fazer?
				""");

		int digita = leitura.nextInt();
		switch (digita) {
		   case 1:
		      System.out.println("\nSeu saldo é de: " + pessoa1.getSaldo());
		      break;
		      
		   case 2:
			   
		      System.out.println("\nQuanto você irá receber? ");
		      double receber = leitura.nextDouble();
		      try {
		    	  pessoa1.recebimento(receber);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		      break;
		      
		   case 3:
			   
		      System.out.println("\nQuanto você irá transferir? ");
		      double transferir = leitura.nextDouble();
		      try {
		    	  pessoa1.transferir(escolher, transferir, pessoa2);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		      
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
