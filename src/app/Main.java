package app;

import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente (500.0, 300.0);
		contaCorrente.consultarSaldo();
		contaCorrente.sacar(600.0);
		contaCorrente.depositar(200.0);
		
		System.out.println();
	
		ContaPoupanca contaPoupanca = new ContaPoupanca (500.0);
		contaPoupanca.consultarSaldo();
		contaPoupanca.sacar(600.0);
		contaPoupanca.depositar(200.0);
	}

}
