void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("nome do cliente");
    String nomecliente = sc.nextLine();

    IO.println("prato escolhido");
    String pratoescolhido = sc.nextLine();

    IO.println("valor do prato");
    double valorprato = sc.nextDouble();

    IO.println("--------pedido feito--------");
    IO.println("nome do cliente: " + nomecliente + "\n" + "prato escolhido: " + pratoescolhido + "\n" + "valor do prato: " + valorprato);
}