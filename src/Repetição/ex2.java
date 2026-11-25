package Repetição;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("valor da compra:");
        float com1 = input.nextFloat();
        if (com1>100){
            double rel = com1 * 0.10;
            System.out.println("sua conta é" + rel);

        }
        else {
            System.out.println(" não ganhou desconto" +com1);

        }
    }
}
