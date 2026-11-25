package ex7matrizes;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        System.out.println("Digite 4 notas (valores decimais):");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }


        double media = soma / notas.length;


        System.out.println("\nA média das notas é: " + media);

        scanner.close();
    }
}
