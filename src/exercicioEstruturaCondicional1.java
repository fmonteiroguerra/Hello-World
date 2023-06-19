import java.util.Scanner;

public class exercicioEstruturaCondicional1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Leia dois números inteiros e escreva na consola o maior deles

        System.out.println("Escreva um número");
        int n1=input.nextInt();

        System.out.println("Escreva outro número");
        int n2=input.nextInt();

        if(n1==n2) {
            System.out.println("Os números são iguais");
        }else{
                if(n1>n2) {
                    System.out.println("O maior número é " + n1);
                }else{
                    System.out.println("O maior número é: "+ n2);

            }



        }
    }

}
