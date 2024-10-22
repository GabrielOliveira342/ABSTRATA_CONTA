package model;

public class ContaCorrente extends ContaBancaria {

	private double limite;
	private final double taxaSaque = 2.5;
	private final double taxaDeposito = 1.0;
	private final double taxaConsulta = 0.5;

	public ContaCorrente (double saldoInicial, double limite) {
		super (saldoInicial);
		this.limite = limite;
	}
	
	@Override
	public void sacar (double valor) {
		double valorComTaxa = valor + taxaSaque;
		if (saldo + limite >= valorComTaxa ) {
			saldo -= valorComTaxa;
			System.out.printf("Saque de R$ %.2f realizado com sucesso (taxa de R$ %.2f).%n", valor, taxaSaque);
		}
		else {
			System.out.println("Saldo insuficiente ");
		}
		exibirSaldo();
	}

	@Override
	public void depositar (double valor) {
		saldo += valor - taxaDeposito;
		System.out.printf("Deposito de R$ %.2f realizado com sucesso (taxa de R$ %.2f).%n", valor, taxaDeposito);
		exibirSaldo();
	}

	@Override
	public double  consultarSaldo() {
		System.out.printf("Consulta de saldo realizada (taxa de R$ %.2f).%n", taxaConsulta);
		saldo -= taxaConsulta;
		exibirSaldo();
		return saldo;
	}
}

