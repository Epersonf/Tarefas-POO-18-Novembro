package Ex2;

public class ContaCorrente {
	private float limite;

	private float saldo;
	private float valorLimite;
	
	public void sacar(float valor) {
		if (valor < 0) throw new IllegalArgumentException("Valores negativos para saque nao sao aceitos.");
		if (valor > saldo) throw new IllegalArgumentException("Saldo insuficiente.");
		saldo -= valor;
	}
	
	public void depositar(float valor) {
		if (valor < 0) throw new IllegalArgumentException("Valores negativos para deposito nao sao aceitos.");
		saldo += valor;
	}
	
	public void setValorLimite(float valor) {
		if (valor < 0) throw new IllegalArgumentException("O valor do limite nao pode ser menor que zero.");
		this.valorLimite = valor;
	}
	
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		if (limite < 0) throw new IllegalArgumentException("O limite nao pode ser menor que zero.");
		this.limite = limite;
	}

	public float getValorLimite() {
		return valorLimite;
	}
}
