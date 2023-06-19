import java.util.Scanner;

public class exercicio4Cincunferencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Programa para calcular a area de uma circunferencia
        // a=pi * raio ao quadrado

        double area, raio, pii;

        pii=3.14;

        System.out.println("Escreva o raio da circunferência");
        raio=input.nextDouble();

        area = (raio*raio)*pii;

        System.out.println("A área é: " + area);
    }
}
