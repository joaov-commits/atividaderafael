package Repetição;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();


        System.out.println("\n--- Escolha a Operação ---");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação desejada (1-4): ");
        int opcao = scanner.nextInt();

        System.out.println();


        switch (opcao) {
            case 1:
                double soma = num1 + num2;
                System.out.printf("Resultado da Soma: %.2f\n", soma);
                break;
            case 2:
                double subtracao = num1 - num2;
                System.out.printf("Resultado da Subtração: %.2f\n", subtracao);
                break;
            case 3:
                double multiplicacao = num1 * num2;
                System.out.printf("Resultado da Multiplicação: %.2f\n", multiplicacao);
                break;
            case 4:

                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.printf("Resultado da Divisão: %.2f\n", divisao);
                } else {
                    System.out.println("Erro: Não é possível dividir por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
                break;
        }


    }
}
