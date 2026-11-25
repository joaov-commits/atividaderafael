package ex7matrizes;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean[] vetor = new boolean[8];
        int contadorTrue = 0;

        System.out.println("Digite 8 valores booleanos (true ou false):");


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor " + (i + 1) + " (true/false): ");
            vetor[i] = scanner.nextBoolean();


            if (vetor[i]) {
                contadorTrue++;
            }
        }


        System.out.println("\nForam inseridos " + contadorTrue + " valores true.");

        scanner.close();
    }
}
