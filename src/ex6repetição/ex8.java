package ex6repetição;

import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int par = 0;
        int impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Quantidade de par: " + par);
        System.out.println("Quantidade de ímpar: " + impar);

        scanner.close();
    }
}
