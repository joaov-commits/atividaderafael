package Decisão;

import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("digite idade");
        int idade = sca.nextInt();
        System.out.println("sua altura:");
        float altura = sca.nextFloat();
        System.out.println("seu peso:");
        double peso = sca.nextDouble();

        System.out.println("seu idade: "+ idade);
        System.out.println("seu altura:"+altura);
        System.out.println("seu peso:"+peso);

    }
}
