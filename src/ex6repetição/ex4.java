package ex6repetição;

import java.util.Scanner;

public class ex4 {
    public static boolean Primo(int numero) {
        if (numero <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();
        if (Primo(num)) {
            System.out.println(num +" É um número primo");
        }
        else {
            System.out.println(num+" Não é um número primo");
        }
    }
}
