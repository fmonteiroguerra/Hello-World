import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, resultado;

        System.out.println("Escreva o primeiro número");
        n1=input.nextInt();

        System.out.println("Escreva o Segundo número");
        n2=input.nextInt();

        resultado=n1+n2;

        System.out.println("O resultado é:" + resultado);



    }
}

