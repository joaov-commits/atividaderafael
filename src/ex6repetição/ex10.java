package ex6repetição;

import java.util.ArrayList;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Digite números entre 0 e 100.");
        System.out.println("Digite um número maior que 100 para interromper bruscamente.");
        System.out.println("Digite um número negativo para encerrar a leitura normalmente.\n");

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero > 100) {
                System.out.println("\nNúmero muito grande, interrupção realizada!");
                break;
            }

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                pares.add(numero);
                continue;
            }

            impares.add(numero);
        }

        System.out.println("Números pares digitados: " + pares);
        System.out.println("Números ímpares digitados: " + impares);

    }
}
