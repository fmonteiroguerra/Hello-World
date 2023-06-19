import java.util.Scanner;
public class exercicio3Retangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lado1, lado2, area, perimetro;

        System.out.println("Escreva o tamanho do maior lado do seu retângulo");
        lado1=input.nextDouble();

        System.out.println("Escreva o tamanho do menor lado do seu retângulo");

        lado2=input.nextDouble();

        area=lado1*lado2;
        perimetro= 2* (lado1+lado2);

        System.out.println("A área é: " + area);
        System.out.println("O perímetro é: " + perimetro);
    }
}
