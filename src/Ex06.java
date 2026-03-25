static void main() {
    Scanner sc = new Scanner(System.in);
    IO.println("meta de estudo 40 horas");
    IO.println("horas estudadas:");
    int horas = sc.nextInt();
    int  meta = 40;

    if (horas == meta) {
        IO.println("horas de estudo concluida");
    }else if (horas < meta){
        IO.println("faltam: " + (meta - horas) +  " horas");
        IO.println("horas de estudos não concluida");
    }

}

