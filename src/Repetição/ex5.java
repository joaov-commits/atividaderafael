package Repetição;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de horas trabalhadas no mês/semana: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor do ganho por hora (R$): ");
        double valorHora = scanner.nextDouble();

        if (horasTrabalhadas > 40) {
            double horasExtras = horasTrabalhadas - 40;
            double valorHoraExtra = valorHora * 1.5;
            double totalHorasExtras = horasExtras * valorHoraExtra;

            System.out.printf("Horas extras realizadas: %.2f horas\n", horasExtras);
            System.out.printf("Valor do adicional de horas extras: R$ %.2f\n", totalHorasExtras);
        } else {
            System.out.println("Não houve realização de horas extras.");
        }

    }
}
