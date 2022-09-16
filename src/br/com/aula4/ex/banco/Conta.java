package br.com.aula4.ex.banco;

public class Conta {
  private String numero;
  private double saldo;

  public Conta(String numero, double saldo) {
    this.numero = numero;
    this.saldo = saldo;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    if (valor <= this.saldo) {
      this.saldo -= valor;
    }
  }
}
