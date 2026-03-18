void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("meta diaria 10.000 passos");

    IO.println("quantos passos você andou:");
    int passos = sc.nextInt();
    int meta = 10000;
    if (passos == 10000){
        IO.println("meta atingidas");
    } else if (passos >10000) {
        IO.println("meta ultrapassada");
        IO.println("vocé passou: ");
        IO.println(passos - meta);
    }else{
        IO.println("meta não atingida");
        IO.println("faltam:");
        IO.println(meta - passos);

    }
}