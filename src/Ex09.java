void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("digite quanto vc gastou:");
    double valordacompra = sc.nextDouble();

    if (valordacompra >100) {
        IO.println("Frete grátis");
    }else {
        IO.println("adicione mais produtos para ganhar frete grátis");
    }
}