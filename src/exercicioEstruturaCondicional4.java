import java.util.Scanner;

public class exercicioEstruturaCondicional4 {

    public static void main(String[] args) {

        Scanner input =new Scanner (System.in);

        //4. Na fórmula 1, os pontos no final de cada corrida são atribuidos da seguinte forma:
        //a. 1º Lugar: 10 pontos
        //b. 2º Lugar: 8 pontos
        //c. 3º Lugar: 6 pontos
        //d. 4º Lugar: 5 pontos
        //e. 5º Lugar: 4 pontos
        //f. 6º Lugar: 3 pontos
        //g. 7º Lugar: 2 pontos
        //h. 8º Lugar: 1 ponto
        //Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.

        System.out.println("Insira a colocação na corrida (digite um único número de 1 a 8)");
        int colocacao=input.nextInt();
        switch (colocacao){
            case 1: System.out.println("Você chegou em "+colocacao+"º lugar. Ganhou 10 pontos");
                    break;
            case 2: System.out.println("Você chegou em "+colocacao+"º lugar. Ganhou 8 pontos");
                    break;
            case 3: System.out.println("Você chegou em "+colocacao+"º lugar. Ganhou 6 pontos");
                    break;
            case 4: System.out.println("Você chegou em "+colocacao+"º lugar. Ganhou 5 pontos");
                   break;
            case 5: System.out.println("Você chegou em "+colocacao+"º lugar. Ganhou 4 pontos");
                    break;
            case 6: System.out.println("Você chegou em "+colocacao+"º lugar. Ganhou 3 pontos");
                    break;
            case 7: System.out.println("Você chegou em "+colocacao+"º lugar. Ganhou 2 pontos");
                    break;
            case 8: System.out.println("Você chegou em "+colocacao+"º lugar. Ganhou 1 ponto");
                    break;
        }


    }
}
