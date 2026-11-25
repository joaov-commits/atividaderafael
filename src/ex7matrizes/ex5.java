package ex7matrizes;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[3];

        System.out.println("Digite 3 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }


        System.out.print("\nDigite o nome que deseja verificar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;


        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome '" + nomeBusca + "' está presente no vetor.");
        } else {
            System.out.println("O nome '" + nomeBusca + "' não está presente no vetor.");
        }

        scanner.close();
    }
}
