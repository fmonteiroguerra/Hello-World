import java.util.Scanner;

public class exercicio8ComprasComDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double p1, p2, p3, total, desconto, totalComDesconto;

        System.out.println("Valor Produto 1");
        p1=input.nextDouble();

        System.out.println("Valor do produto 2");
        p2=input.nextDouble();

        System.out.println("Valor do produto 3:");
        p3=input.nextDouble();

        total =p1+p2+p3;
        desconto=total*0.10;
        // outra opção sem precisar da variavel desconto é
        //  é saber que, se o cliente terá desconto 10%, quer dizer que pagará só 90%
        // preço=preço*0.9

        totalComDesconto=total-desconto;

        System.out.println("O total com desconto será: "+ totalComDesconto + "euros");

    }
}
