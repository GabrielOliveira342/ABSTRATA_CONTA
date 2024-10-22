package model;

public class ContaPoupanca extends ContaBancaria {

	private final double taxaSaque = 1.5;
	private final double taxaDeposito = 0.75;
	private final double taxaConsulta = 0.25;
	
	public ContaPoupanca (double saldoInicial) {
		super (saldoInicial);
	}
	
	@Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaSaque;
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.printf("Saque de R$ %.2f realizado com sucesso (taxa de R$ %.2f).%n", valor, taxaSaque);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        exibirSaldo();
	}
    
	@Override
	public void depositar (double valor) {
		saldo += valor - taxaDeposito;
		System.out.printf("Depósito de R$ %.2f realizado com sucesso (taxa de R$ %.2f).%n", valor, taxaDeposito);
		exibirSaldo();
	}

	@Override
	public double consultarSaldo() {
		System.out.printf("Consulta de saldo realizada (taxa de R$ %.2f).%n", taxaConsulta);
		saldo -= taxaConsulta;
		exibirSaldo();
		return saldo;
	}

	
}
