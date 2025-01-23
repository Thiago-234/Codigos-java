package caixaEletronico.Aplicação_2;

import java.util.List;
import java.util.ArrayList;

public class Banco {
    private List<Operacoes> contas;

    // Construtor que inicializa a lista de contas
    public Banco() {
        this.contas = new ArrayList<>();
    }

    // Método para adicionar uma conta ao banco
    public void adicionarConta(Operacoes novaConta) {
        contas.add(novaConta);
    }

    // Método para encontrar uma conta pela agência
    public Operacoes encontrarConta(int agencia) {
        for (Operacoes conta : contas) {
            if (conta.getAgencia() == agencia) {
                return conta;
            }
        }
        return null;  // Se não encontrar a conta
    }

    // Método para listar todas as contas
    public void listarContas() {
        for (Operacoes conta : contas) {
            System.out.println(conta.mostrarInfo());
        }
    }
}
