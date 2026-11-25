package ex7matrizes;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] vetor = new String[6];

        System.out.println("Digite 6 caracteres:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            vetor[i] = scanner.next();
        }


        System.out.print("\nDigite uma letra para procurar no vetor: ");
        String busca = scanner.next();

        boolean encontrado = false;


        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equalsIgnoreCase(busca)) {
                System.out.println("A letra '" + busca + "' está presente na posição " + i + " do vetor.");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("A letra '" + busca + "' não foi encontrada no vetor.");
        }

        scanner.close();
    }
}
