package ex6repetição;

import java.util.Random;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR.");
            } else {
                System.out.println("\nParabéns! Você acertou!");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Total de tentativas: " + tentativas);

        scanner.close();
    }
}
