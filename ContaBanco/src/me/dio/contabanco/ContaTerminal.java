package me.dio.contabanco;

import java.util.Scanner;

/**
 * Essa classe se propõe a resolver o Desafio de Projeto: Simulando Uma Conta Bancária Através Do Terminal/Console
 * da Formação Java Developer da dio.
 *
 * @author João Guedes.
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("💰 💲 💰 💲 💰 💲 💰 💲 💰 💲 CONTA BANCO 💰 💲 💰 💲 💰 💲 💰 💲 💰 💲");
        System.out.print("\nDigite o seu nome: ");
        String customerName = input.nextLine();
        System.out.print("\nDigite a agência da conta: ");
        String agency = input.next();
        System.out.print("\nDigite o número da conta: ");
        Integer accountNumber = input.nextInt();
        System.out.print("\nDigite o saldo da conta: ");
        Double accountBalance = input.nextDouble();
        input.close();
        System.out.printf("""
                        
                        Olá %s, obrigado por criar uma conta
                        em nosso banco, sua agência é %s, conta %d e
                        seu saldo de R$%.2f já está disponível para saque.
                        
                        """,
                customerName,
                agency,
                accountNumber,
                accountBalance);
        System.out.println("💰 💲 💰 💲 💰 💲 💰  💲 💰 💲 💰 💲 💰 💲 💰 💲 💰 💲 💰 💲 💰 💲 💰 💲\n");
    }

}