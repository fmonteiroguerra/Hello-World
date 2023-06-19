import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        double mult, div, n1, n2, soma, sub;
    System.out.println("Escreva o primeiro número");
    n1=input.nextInt();

    System.out.println("Escreva o seg2undo número");
    n2=input.nextInt();

    soma=n1+n2;
    sub=n1-n2;
    mult=n1*n2;
    div=n1/n2;
    System.out.println("Resultado da soma: " + soma);
    System.out.println("Resultado da subtração: " + sub);
    System.out.println("Resultado da multiplicação: " + mult);
    System.out.println("Resutado da divisão é: " + div);
    }
}
