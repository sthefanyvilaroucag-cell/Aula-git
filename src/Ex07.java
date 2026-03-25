void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("resultado final");
    int nota = sc.nextInt();

    if (nota >= 7){
        IO.println("aprovado");
    } else if (nota >= 5 && nota < 7) {
        IO.println("recuperação");
    }else{
        IO.println("reprovado");

    }
}