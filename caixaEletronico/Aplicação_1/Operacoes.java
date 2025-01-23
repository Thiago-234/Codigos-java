package caixaEletronico.Aplicação_1;

public class Operacoes {
    private double saldo;
    private int agencia;
    
    public Operacoes(int agencia) {
        this.saldo = 0;
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }
    
    public void depositar(double valor) {
        if (valor > 5000) {
            System.out.println("Não é permitido depositar mais de R$5000,00");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado!");
        }
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public String mostrarInfo() {
        return "Informações da conta \nSaldo: R$" + saldo + " \nAgência: " + agencia;
    }
}

