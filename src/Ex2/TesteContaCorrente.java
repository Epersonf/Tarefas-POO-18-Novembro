package Ex2;

public class TesteContaCorrente {
	public static void main(String[] args) {
		try {
			ContaCorrente conta = new ContaCorrente();
			conta.setValorLimite(3200);
			conta.depositar(200);
			
			//erro
			conta.depositar(-200);
			
			//erro
			conta.sacar(-200);
			
			conta.sacar(200);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
