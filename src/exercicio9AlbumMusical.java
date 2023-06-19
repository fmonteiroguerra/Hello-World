import java.util.Scanner;

public class exercicio9AlbumMusical {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int m1, s1, m2, s2, m3, s3, m4,s4, m5,s5, htotal, mtotal, msubtotal,  msubtotal2, stotal, ssubtotal,rhoras,rminutos,rsegundos;

        System.out.println("Minutos da música 1:");
        m1= input.nextInt();

        System.out.println("Segundos da música 1:");
        s1=input.nextInt();


        System.out.println("Minutos da música 2:");
        m2= input.nextInt();

        System.out.println("Segundos da música 2:");
        s2=input.nextInt();

        System.out.println("Minutos da música 3:");
        m3= input.nextInt();

        System.out.println("Segundos da música 3:");
        s3=input.nextInt();



        System.out.println("Minutos da música 4:");
        m4= input.nextInt();

        System.out.println("Segundos da música 4:");
        s4=input.nextInt();




        System.out.println("Minutos da música 5:");
        m5= input.nextInt();

        System.out.println("Segundos da música 5:");
        s5=input.nextInt();

        mtotal=m1+m2+m3+m4+m5;
        stotal=s1+s2+s3+s4+s5;



        //SEGUNDOS//
        ssubtotal=stotal%60;

        //MINUTOS

        rhoras=mtotal%60; //resto de horas em minutos dados
        msubtotal=(stotal/60)+mtotal; //  minutos tirados do total de segundos + resto de horas
        msubtotal2=msubtotal%60;

        //HORAS
        htotal=msubtotal/60;



        System.out.println("Duração total: "+ htotal +":"+ msubtotal2+":"+ ssubtotal);


    }

}
