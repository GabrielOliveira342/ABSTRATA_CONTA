package model;

public abstract class ContaBancaria {
	
	protected double saldo;

	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
	public abstract double consultarSaldo();
	
	protected void exibirSaldo() {
		System.out.printf("Saldo atual: R$ %.2f%n", saldo);
	}
}

