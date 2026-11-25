package Decisão;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o seu salario");
        int salario = scan.nextInt();
        System.out.println("sua hora trabalho");
        float hora = scan.nextFloat();

        float resultado = salario+hora;

        System.out.println("seu resultado e:" + resultado);
    }
}
