package testeDeConversão;

public class Conversão {

	public static void main(String[] args) {
		/*
		double media = (5.5 + 8.7 + 3.6) / 3;
		
		int classificacao = (int) (media/2); //O int está dentro de () pq está sendo convertido por casting
		System.out.println(classificacao);*/

		
		double temperatura = 25.6;
		double conversao = (temperatura * 1.8) + 32;
		int fEmInt = (int) (conversao);
		System.out.println("Sua temperatura era de: " + temperatura + " Graus Celsius e virou: " + fEmInt+ " Graus Farenheit");
		
	}

}
