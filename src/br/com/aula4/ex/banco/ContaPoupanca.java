package br.com.aula4.ex.banco;

public class ContaPoupanca extends Conta {
  private double rendimento;

  public ContaPoupanca(String numero, double saldo, double rendimento) {
    super(numero, saldo);
    this.rendimento = rendimento;
  }

  public double getRendimento() {
    return rendimento;
  }

  public void setRendimento(double rendimento) {
    this.rendimento = rendimento;
  }

  public void atualizarRendimentos() {
    setSaldo(getSaldo() + ((getSaldo() * this.rendimento) / 100));
  }
}
