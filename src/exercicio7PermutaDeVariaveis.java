import java.util.Scanner;

public class exercicio7PermutaDeVariaveis {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double a, b , c;

        System.out.println("Escreva um numero que será A:");
        a=input.nextDouble();

        System.out.println("Escreva um número que será B:");
        b=input.nextDouble();

        c=b;

        b=a;

        a=c;

        //sem acrescentar a variavel auxiliar, no caso foi c:
        //a 1    b 2
        //a=a+b
        //b=a-b
        //a=a-b
        //

        System.out.print(a +" "+b);

    }
}

