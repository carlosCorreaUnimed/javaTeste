package desafioBanco;

public class Clientes {

	private String nome;
	private int idade;
	private double saldo;
	private boolean contaBloqueada = false;

	public Clientes(String nome, int idade, double saldo, boolean contaBloqueada) {
		this.nome = nome;
		this.idade = idade;
		this.saldo = saldo;
		this.contaBloqueada = contaBloqueada;
	}

	public Clientes(String nome, int idade, double saldo) {
		this.nome = nome;
		this.idade = idade;
		this.saldo = saldo;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getContaBloqueada() {
		return this.contaBloqueada;
	}

	public void setContaBloqueada(boolean contaBloqueada) {
		this.contaBloqueada = contaBloqueada;
	}

	public void recebimento(double valor) {
		if (valor < 0) {
			//System.out.println("\nValor Inválido, tente novamente");
			throw new IllegalArgumentException("Valor Inválido, tente novamente");
		}else {
			double saldoNovo = this.getSaldo() + valor;
			this.setSaldo(saldoNovo);
			System.out.println("\nSaldo atualizado");
		}
	}

	public void transferir(int escolher, double transferir, Clientes pessoa2) {
		if(escolher == 1) {
			if(transferir > getSaldo()) {
		    	  //System.out.println("\nFalta de saldo para transferência!");
		    	  throw new IllegalArgumentException("Falta de saldo para tranferência");
		      }else if(transferir < 0) {
		    	  //System.out.println("\nValor inválido, tente novamente");
		    	  throw new IllegalArgumentException("Valor inválido, tente novamente");
		      }else {
			double saldoDesconto = this.getSaldo() - transferir;
			this.setSaldo(saldoDesconto);
			double saldoTransferido = pessoa2.getSaldo() + transferir;
			pessoa2.setSaldo(saldoTransferido);
			System.out.println("\nSeu saldo foi atualizado para %.2f, você enviou %.2f para %s, totalizando %.2f:".formatted(this.getSaldo(), transferir, pessoa2.getNome(), pessoa2.getSaldo()));
	  }}else if (escolher == 2){
		
		if(transferir > getSaldo()) {
	    	  //System.out.println("\nFalta de saldo para transferência!");
	    	  throw new IllegalArgumentException("Falta de saldo para tranferência");
	      }else if(transferir < 0) {
	    	  //System.out.println("\nValor inválido, tente novamente");
	    	  throw new IllegalArgumentException("Valor inválido, tente novamente");
	      }else {
		double saldoDesconto = this.getSaldo() - transferir;
		this.setSaldo(saldoDesconto);
		double saldoTransferido = pessoa2.getSaldo() + transferir;
		pessoa2.setSaldo(saldoTransferido);
		System.out.println("\nSeu saldo foi atualizado para %.2f, você enviou %.2f para %s, totalizando %.2f:".formatted(this.getSaldo(), transferir, pessoa2.getNome(), pessoa2.getSaldo()));
	      }
	  }else {
		  System.out.println("Essa conta não existe");
	  }

	
}
	}
