package caixaEletronico.Aplicação_1;

import java.util.*;
public class Aplicacao {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
            
        System.out.println("Digite o número de sua agência:");
        int ag = x.nextInt();
        
        Operacoes op = new Operacoes(ag);
        System.out.println(op.mostrarInfo() + "\n");
        
        int opc;
        
        do {
            System.out.println("Escolha uma opção para realizar: ");
            System.out.println("[1] Para realizar um depósito \n[2] Para realizar um saque \n[3] Para informações da conta "
            + "\n[4] Sair da conta");
            opc = x.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Digite um valor para depósito: ");
                    double dp = x.nextDouble();
                    op.depositar(dp);
                    break;
                    
                case 2:
                    System.out.println("Digite a quantidade do saque: ");
                    double sq = x.nextDouble();
                   op.sacar(sq);
                    break;
                    
                case 3:
                    System.out.println(op.mostrarInfo());
                    break;
                    
                case 4:
                    System.out.println("Programa encerrado...");
                    break;
            }
        } while (opc != 4);
    
        x.close();
    }
    }