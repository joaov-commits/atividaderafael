void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("sua idade é" + idade);

    System.out.println("digite seu nome:");
    scanner.nextLine();
    String nome = scanner.nextLine();

    System.out.println("seu nome é:" + nome);

    scanner.close();
}