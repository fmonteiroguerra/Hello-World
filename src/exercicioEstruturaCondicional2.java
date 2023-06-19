import java.util.Scanner;

public class exercicioEstruturaCondicional2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


    // Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
    // a. Salário até 15.000€ inclusive paga taxa de 20%
    // b. Salário superior a 15.000€ paga taxa de 30%

        System.out.println("Introduza o salário anual (introduza somente números:");
        double salario=input.nextDouble();

        if(salario>15000){
          double desconto=salario*0.3;
          System.out.println("taxação: 30%");
          System.out.println("O total de imposto será: "+ desconto);

        }else {
            double desconto = salario * 0.2;
            System.out.println("taxação: 20%");
            System.out.println("O total de imposto será: "+ desconto);
        }


    }

}
