import java.util.Scanner;

void main() {
     Scanner sc = new Scanner (System.in);
     IO.println("digite seu nome ");
     String nomedoaluno = sc.next();

     IO.println("digite o curso que está matriculado");
     String curso = sc.next();

     IO.println("digite sua idade");
     int idade = sc.nextInt();

     IO.println("cadastro feito com sucesso");
     IO.println("suas informações:");
     IO.println( "seu nome: " + nomedoaluno +"\n" + "seu curso: " + curso +"\n"+ "sua idade: " + idade);
}