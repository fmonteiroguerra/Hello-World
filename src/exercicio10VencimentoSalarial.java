import java.util.Scanner;

public class exercicio10VencimentoSalarial {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Double codigof, diast, vencimentob, aliment, retIRS, ssEmpregado, ssEmpresa,  valorliqTotal, valorliqVenc, ssTotal;

    //solicitar código do funcionario:
    System.out.println("Insira o código de funcionário");
    codigof=input.nextDouble();

    //solicitar número de dias trabalhados neste mes:
    System.out.println("Insira número de dias trabalhados no mês");
    diast=input.nextDouble();

    // Vencimento base
        vencimentob=diast*40;

    // Subsidio Alimentação
        aliment=diast*6;

    //Retenção IRS:
        retIRS=vencimentob*0.10;

    //Segurança Social paga pelo empregado
    ssEmpregado=vencimentob*0.11;

    //Segurança Social paga pelo EMPRESA
        ssEmpresa=vencimentob*0.2375;

        //Total segurança social, ambos
        ssTotal= ssEmpregado+ssEmpresa;

    //VALORES A APRESENTAR
        valorliqVenc=vencimentob-ssEmpregado;
        valorliqTotal=(vencimentob-ssEmpregado)+aliment;

        System.out.println("Valor líquido a receber fruto do vencimento: "+ valorliqVenc);
        System.out.println("Total subsídio de alimentação: "+ aliment);
        System.out.println("Valor da retenção de IRS a entregar ao Estado: "+retIRS);
        System.out.println("Valor total a entregar à Segurança Social (ambos os encargos): "+ ssTotal);
        System.out.println("Valor líquido Total (Vencimento + Alimentação):"+ valorliqTotal);

    }
}
