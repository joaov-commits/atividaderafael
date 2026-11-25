
package desafiofinal;
import java.util.Scanner;
public class desafio {

    static final int usuarios_maximo = 50;
    static final int colunas = 4;
    static final String[] cabecalho = {"ID", "Nome", "Email", "Idade"};

    static String[][] usuarios = new String[usuarios_maximo][colunas];
    static int IDseguinte = 1;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                default:
                    System.out.println("Opção invalida");

                case 0:
                    System.out.println("Encerrando sistema.");
                    break;

                case 1:
                    cadastrarUsuario();
                    break;

                case 2:
                    consultarUsuarios();
                    break;

                case 3:
                    atualizarUsuarios();
                    break;

                case 4:
                    deletarUsuario();
                    ;
                    break;
            }
        } while (opcao != 0);
    }

    static void exibirMenu(){
        System.out.println("\n------- Desafio Final -------");
        System.out.println("\n------- Sistema Cadastro -------");
        System.out.println("1 - cadastrar usuario");
        System.out.println("2 - consultar usuarios");
        System.out.println("3 - atualizar usuario");
        System.out.println("4 - deletar usuario");
        System.out.println("0 - sair");
        System.out.println("--------------------------------------------------");
    }

    static int buscarPosicaoLivre(){
        for (int i = 0; i < usuarios_maximo; i++){
            if (usuarios[i][0] == null) {
                return i;
            }
        }
        return -1;
    }

    static boolean existeUsuario(){
        for (int i = 0; i < usuarios_maximo; i++){
            if (usuarios[i][0] != null) {
                return true;
            }
        }
        return false;
    }

    static int buscarPosicaoPorId(int id){
        for (int i = 0; i < usuarios_maximo; i++){
            if (usuarios[i][0] == null && Integer.parseInt(usuarios[i][0]) == id) {
                return i;
            }
        }
        return -1;
    }


    static String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    static int lerInteiro(String mensagem){
        while(true){
            System.out.print(mensagem);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido - Requer um numero inteiro");
            }
        }
    }

    static void cadastrarUsuario(){
        int posicao = buscarPosicaoLivre();

        if (posicao == -1){
            System.out.println("Limite de usuarios atingido");
        }

        System.out.println("\n UsuarioCadastrar Usuario  ");

        String nome = lerTexto("Nome: ");
        String email = lerTexto("Email: ");
        int idade =  lerInteiro("Idade: ");

        usuarios[posicao][0] = String.valueOf(IDseguinte);
        usuarios[posicao][1] = nome;
        usuarios[posicao][2] = email;
        usuarios[posicao][3] = String.valueOf(idade);

        System.out.println("Usuario cadastrado com sucesso - ID: " + IDseguinte);
        IDseguinte++;
    }

    static void consultarUsuarios(){
        System.out.println("\n Usuarios Cadastrado  ");

        if (!existeUsuario()){
            System.out.println("usuarios nenhum cadastrado");
            return;
        }

        System.out.printf("%-5s %-20s %-25s %-6s%n",
                cabecalho[0],cabecalho[1],cabecalho[2],cabecalho[3]);
        System.out.println("-".repeat(60));

        for (int i = 0; i <usuarios_maximo; i++) {
            if (usuarios[i][0] != null){
                System.out.printf("%-5s %-20s %-25s %-6s%n",
                        usuarios[i][0], usuarios[i][1], usuarios[i][2], usuarios[i][3]);;
            }
        }
    }

    static void atualizarUsuarios(){
        System.out.println("Atualizar Usuario ");

        if (!existeUsuario()){
            System.out.println("usuarios nenhum cadastrado");
            return;
        }

        int id = lerInteiro("informe o ID de usuario: ");
        int posicao = buscarPosicaoPorId(id);

        if (posicao == -1) {
            System.out.println("usuario não encontrado");
            return;
        }

        usuarios[posicao][1] = lerTexto("nome novo: ");
        usuarios[posicao][2] = lerTexto("email novo: ");
        usuarios[posicao][3] = String.valueOf(lerInteiro(" idade nova: "));

        System.out.println("Usuario atualizado com sucesso");
    }

    static void deletarUsuario(){
        System.out.println(" Deletar Usuario ");

        if (!existeUsuario()){
            System.out.println(" usuarios nenhum cadastrado");
            return;
        }

        int id = lerInteiro("Informe o ID do usuario: ");
        int posicao = buscarPosicaoPorId(id);

        if (posicao == -1) {
            System.out.println("nenhum usuario encontrado");
            return;
        }

        for (int j = 0; j < colunas; j++){
            usuarios[posicao][j] = null;
        }

        System.out.println("Usuario removido");
    }
}