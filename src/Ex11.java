void main() {
 Scanner sc = new Scanner(System.in);
    IO.println("baixando o arquivo");
    IO.println("quanto ja foi baixado:");
    double GB = sc.nextDouble();

    IO.println("percentual baixado: " + (GB / 2 ) * 100 + "%");

}