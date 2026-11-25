package ex7matrizes;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] vetor = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números inteiros:");


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }


        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }


        System.out.println("\nA soma dos elementos do vetor é: " + soma);

        scanner.close();
    }
}
