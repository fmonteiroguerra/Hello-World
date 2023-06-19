import java.util.Scanner;

public class exercicio6MediaPonderadaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2, n3, mediaP;

        System.out.println("Escreva a nota 1 :");
        n1=input.nextDouble();

        System.out.println("Escreva a nota 2 :");
        n2=input.nextDouble();

        System.out.println("Escreva a nota 3 :");
        n3=input.nextDouble();

        mediaP=(n1*0.2)+(n2*0.3)+(n3*0.5);

        System.out.println("A media ponderada será: " + mediaP);



    }
}
