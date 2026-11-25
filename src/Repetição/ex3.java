package Repetição;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.println("1 - Eletrônico");
        System.out.println("2 - Alimento");
        System.out.println("3 - Vestuário");
        System.out.print("Digite um número de 1 a 3: ");

        int codigo = sca.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Categoria: Eletrônicos");
                break;
            case 2:
                System.out.println("Categoria: Alimentos");
                break;
            case 3:
                System.out.println("Categoria: Vestuário");
                break;
            default:
                System.out.println("Código inválido! Digite um número de 1 a 3.");
                break;
        }

    }
}