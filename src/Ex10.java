void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("quantas paginas vc leu?");
    double livro = sc.nextDouble();

    IO.println("você leu " + (livro / 300) * 100 + "%" + " porcento do livo");
}
