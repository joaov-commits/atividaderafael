package Decisão;

import java.util.Scanner;

public class ex6 {
            public static void main(String[] args) {
                Scanner sca = new Scanner(System.in);

                System.out.println("Digite o primeiro número:");
                int num1 = sca.nextInt();

                System.out.println("Digite o segundo número:");
                int num2 = sca.nextInt();

                System.out.println("\n--- Resultados das Comparações ---");
                System.out.println(num1 + " > " + num2 + " (Maior que): " + (num1 > num2));
                System.out.println(num1 + " < " + num2 + " (Menor que): " + (num1 < num2));
                System.out.println(num1 + " >= " + num2 + " (Maior ou igual a): " + (num1 >= num2));
                System.out.println(num1 + " <= " + num2 + " (Menor ou igual a): " + (num1 <= num2));
                System.out.println(num1 + " == " + num2 + " (Igual a): " + (num1 == num2));
                System.out.println(num1 + " != " + num2 + " (Diferente de): " + (num1 != num2));

                sca.close();
            }
        }


