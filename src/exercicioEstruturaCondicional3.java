import java.util.Scanner;

public class exercicioEstruturaCondicional3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //3. Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
        //a. Salário até 15.000€ inclusive paga taxa de 20%
        //b. Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
        //c. Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
        //d. Salário superior a 25.000€ paga taxa de 40%

        double imposto, salario;

        System.out.println("Introduza o salário anual");
       salario=input.nextDouble();

        if (salario<=15000) {
            System.out.println("taxa 20%");
            imposto = salario * 0.2;
            System.out.println("O imposto total é :" + imposto);
            }else if (salario>15000 && salario<=20000 ){
                System.out.println("taxa 30%");
                imposto = salario * 0.3;
                System.out.println("O imposto total é :" + imposto);
            }
            else if (salario>20000 && salario<=25000){
            System.out.println("taxa 35%");
            imposto = salario * 0.35;
            System.out.println("O imposto total é :" + imposto);
        }
            else{
            System.out.println("taxa 40%");
            imposto = salario * 0.40;
            System.out.println("O imposto total é :" + imposto);
        }


    }

}
