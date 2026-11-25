package ex6repetição;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota de 0 a 10: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida registrada com sucesso: " + nota);
        scanner.close();
    }
}
