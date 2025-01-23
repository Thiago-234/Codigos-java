package caixaEletronico.Aplicação_2;

import java.util.Scanner;

public class Aplicacao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();  // Criando o banco que gerenciará as contas

        // Menu de operações
        int opc;
        do {
            System.out.println("Escolha uma opção para realizar:");
            System.out.println("[1] Criar conta");
            System.out.println("[2] Encontrar conta");
            System.out.println("[3] Listar contas");
            System.out.println("[4] Sair");

            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Digite o número da agência para a nova conta:");
                    int agencia = scanner.nextInt();
                    System.out.println("Digite o valor do saldo inicial:");
                    double saldo = scanner.nextDouble();
                    Operacoes novaConta = new Operacoes(saldo, agencia);
                    banco.adicionarConta(novaConta);
                    System.out.println("Conta criada com sucesso!");
                    break;
                
                case 2:
                    System.out.println("Digite o número da agência para encontrar a conta:");
                    int agenciaBusca = scanner.nextInt();
                    Operacoes contaEncontrada = banco.encontrarConta(agenciaBusca);
                    if (contaEncontrada != null) {
                        System.out.println("Conta encontrada: " + contaEncontrada.mostrarInfo());
                    } else {
                        System.out.println("A conta " + agenciaBusca + " não existe");
                    }
                    break;

                case 3:
                    System.out.println("Listando todas as contas:");
                    banco.listarContas();
                    break;

                case 4:
                    System.out.println("Programa encerrado...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opc != 4);

        scanner.close();
    }
}
