void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("nome:(nickname)");
    String nickname = sc.nextLine();

    IO.println("jogo favorito");
    String jogofavorito = sc.nextLine();

    IO.println("pontuação atual");
    double pontuacao = sc.nextDouble();

    IO.println("perfil do usuario");
    IO.println("nickname: " + nickname +"\n" + "jogo favorito: " + jogofavorito + "\n" + "pontuação atual: " + pontuacao);
}