import java.util.Scanner;
public class exercicioEstruturaCondicional5 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        //5. Escreva um programa que leia dois valores numéricos e apresente o menor e depois o maior.

        System.out.println("Escreva um número:");
        double n1=input.nextDouble();

        System.out.println("Escreva outro número:");
        double n2=input.nextDouble();

        if (n1>n2){
            System.out.println("Número maior: "+n1+". Número menor:"+n2+".");
        }else{
            System.out.println("Número maior: "+n2+". Número menor:"+n1+".");
        }



    }

}
