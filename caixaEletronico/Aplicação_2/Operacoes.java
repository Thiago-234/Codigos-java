package caixaEletronico.Aplicação_2;

public class Operacoes {
    private double saldo;
    private int agencia;

    // Construtor
    public Operacoes(double saldo, int agencia) {
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String mostrarInfo() {
        return "Agência: " + agencia + " | Saldo: " + saldo;
    }
}
