package Decisão;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor pequeno:");

        short valorShort = input.nextShort();
        int valorInt = valorShort;
        byte valorByte = (byte) valorShort;

        System.out.println("\n--- Resultados da Diferença de Tipos ---");
        System.out.println("Valor original (short): " + valorShort);
        System.out.println("Valor após casting implícito para int: " + valorInt);
        System.out.println("Valor após casting explícito para byte: " + valorByte);
    }
}
