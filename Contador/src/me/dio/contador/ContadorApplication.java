package me.dio.contador;

import me.dio.contador.exception.InvalidArgumentsException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Essa classe se propõe a resolver o Desafio de Projeto: Criando Um Pequeno Sistema Para Validação de Processo Seletivo
 * da Formação Java Developer da dio.
 *
 * @author João Guedes.
 */
public class ContadorApplication {

    /**
     * Esse método faz uma contagem começando de 1 até (primeiro parâmetro - segundo parâmetro). Caso o valor do
     * segundo parâmetro seja menor que o do primeiro será lançada uma exceção (InvalidArgumentsException).
     *
     * @param number1 Número um.
     *
     * @param number2 Número dois.
     *
     * @throws InvalidArgumentsException Caso o valor do segundo parâmetro seja menor que o do primeiro será
     * lançada essa exceção.
     */
    public static void count(int number1, int number2) throws InvalidArgumentsException {
        if (number2 < number1) {
            throw new InvalidArgumentsException();
        }
        int bound = number2 - number1;
        for (int i = 1; i <= bound; i++) {
            System.out.println("✔ Imprimindo o número " + i);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("🔢 🔢 🔢 🔢 Contador 🔢 🔢 🔢 🔢");
            System.out.println("\nDigite o primeiro parâmetro:");
            int number1 = input.nextInt();
            System.out.println("\nDigite o segundo parâmetro:");
            int number2 = input.nextInt();
            input.close();
            System.out.println();
            ContadorApplication.count(number1, number2);
            System.out.println("\n🔢  🔢 🔢 🔢 🔢 🔢 🔢 🔢 🔢  🔢");
        }
        catch (InputMismatchException ime) {
            System.err.println("""
                    
                    O  valor  passado  como parâmetro
                    deve ser um valor inteiro!""");
        } catch (InvalidArgumentsException iae) {
            System.err.println(iae.getMessage());
        }
    }

}