package br.com.aula4.ex.banco;

public class Main {
  public static void main(String[] args) {
    ContaCorrente cc1 = new ContaCorrente("03000321", 1000, 10000);
    System.out.println("Saldo: " + cc1.getSaldo());
    System.out.println("Saldo Total: " + cc1.consultaSaldoTotal());

    ContaPoupanca cp1 = new ContaPoupanca("72-1", 1000, 2);
    System.out.println("Saldo: " + cp1.getSaldo());
    cp1.atualizarRendimentos();
    System.out.println("Saldo após o primeiro rendimento: " + cp1.getSaldo());
  }
}
