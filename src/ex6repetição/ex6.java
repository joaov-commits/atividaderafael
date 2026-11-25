package ex6repetição;

public class ex6 {
    public static void main(String[] args) {
        int contador = 0;
        int termo1 = 0, termo2 = 1;

        System.out.println("Primeiros 10 números da sequência de Fibonacci:");

        while (contador < 10) {
            System.out.print(termo1 + " ");
            termo1 = termo2;
            int proximo = termo1 + termo2;
            termo2 = proximo;
            contador++;
        }
        System.out.println();
    }
}
