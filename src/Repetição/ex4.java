package Repetição;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor das vendas (R$): ");
        double vendas = scanner.nextDouble();

        double porcentagem;

        if (vendas < 1000) {
            porcentagem = 0.05;
        } else if (vendas <= 5000) {
            porcentagem = 0.10;
        } else {
            porcentagem = 0.15;
        }

        double comissao = vendas * porcentagem;

        System.out.printf("Porcentagem da comissão: %.0f%%\n", porcentagem * 100);
        System.out.printf("Valor da comissão: R$ %.2f\n", comissao);

    }
}
