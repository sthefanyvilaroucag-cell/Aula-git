void main() {
    Scanner sc =new Scanner(System.in);
    IO.println("qual sua idade:");
    int idade = sc.nextInt();

    if (idade > 18){
        IO.println("entrada permitida");
    }else{
        IO.println("entrada proibida");}
}


