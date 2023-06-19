import java.util.Scanner;
public class exercicioEstruturaCondicional7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número que você queira saber se é par ou ímpar:");
        double n1=input.nextDouble();

        if (n1%2==0){
            System.out.println(n1 +" é um número par.");
        }else{
            System.out.println(n1+" é um número ímpar.");
        }


    }

}
