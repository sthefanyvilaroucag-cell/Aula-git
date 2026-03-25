void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("meta guardar R$500 em um mês");
    IO.println("quanto vc juntou?:");
    int meta = 500;
    double valorguardado = sc.nextDouble();

    if (meta == valorguardado) {
        IO.println("meta concluida");
    }else if (valorguardado >500) {
        IO.println("meta ultrapassada");
        IO.println("vc ultrapassou:" + (valorguardado - meta));
    }else {
        IO.println("faltam:" + (meta - valorguardado));
        IO.println("meta não atingida");


    }
}