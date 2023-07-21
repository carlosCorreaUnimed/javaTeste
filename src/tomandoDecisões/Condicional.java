package tomandoDecisões;

public class Condicional {

	public static void main(String[] args) {
		int anoDeLancamento = 2022;
		boolean incluidoNoPlano = true;
		double notaDoFilme = 8.1;
		String tipoPlano = "plus";
		
		if(anoDeLancamento >= 2022) {
			System.out.println("Lançamento bom");
		} else {
			System.out.println("Filme Paia");
		}
		
		if(incluidoNoPlano == true && tipoPlano.equals("plus")){ //equal() serve para String quando for comparar nos if's
			System.out.println("Filme liberado");
		}else {
			System.out.println("Libera nada");
		}

	}

}
