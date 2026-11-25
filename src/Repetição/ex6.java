package Repetição;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        } else if (nota >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Situação: Em Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }

    }
}
