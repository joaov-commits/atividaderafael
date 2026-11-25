package Decisão;

import java.util.Scanner;

public class ex7 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in)
         System.out.println("digite um numero:");
        boolean num1 = input.hasNextBoolean();
        System.out.println("digite outro numero:");
        boolean num2 = input.hasNextBoolean();
        System.out.println("digite denovo:");
        boolean num3 = input.hasNextBoolean();


        System.out.println("o boo1 com boo2 é:"+ (num1 && num2));
        System.out.println("o boo1 com boo3 é:"+ (num1 && num3));
        System.out.println("o boo2 com boo3 é:"+ (num2 && num3));

        System.out.println("o boo1 nao e igual  boo2 é:"+ (num1 && num2));
        System.out.println("o boo1 nao e igual  boo3 é:"+ (num1 && num3));
        System.out.println("o boo2 nao e igual boo3 é:"+ (num2 && num3));
    }
}
