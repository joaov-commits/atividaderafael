package Decisão;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor fracionado:");

        float valorFloat = input.nextFloat();
        long valorLong = (long) valorFloat;
        double valorDouble = valorLong;

        System.out.println("\n--- Resultados dos Castings ---");
        System.out.println("Valor original (float): " + valorFloat);
        System.out.println("Valor após casting explícito para long: " + valorLong);
        System.out.println("Valor após casting implícito para double: " + valorDouble);
    }
}
