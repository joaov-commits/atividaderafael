package ex6repetição;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += scanner.nextDouble();
        }

        double media = soma / 5;
        System.out.printf("Média das notas: %.2f%n", media);

        scanner.close();
    }
}
