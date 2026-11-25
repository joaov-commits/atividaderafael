package Decisão;

import java.util.Scanner;

public class ex8 {
    static void main() {
        Scanner input =new Scanner(System.in);
        System.out.println("digite um lado pro retangulo:");
        float lad1 = input.nextFloat();
        System.out.println("digite um outro lado pro retangulo:");
        float lad2 = input.nextFloat();

        float relsu = lad1 * lad2;

        System.out.println("o seu resulatdo de area é:"+ relsu);

    }
}
