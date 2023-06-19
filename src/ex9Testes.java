import java.util.Scanner;

public class ex9Testes {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int m1, s1, m2, s2, m3, s3, m4,s4, m5,s5, htotal, mtotal, mstotal, stotal, sstotal,rhoras,rminutos,rsegundos;

        System.out.println("Minutos da música 1");
        m1= input.nextInt();

        System.out.println("Segundos da música 1");
        s1=input.nextInt();



        mtotal=m1;
        stotal=s1;

        htotal=mtotal/60;
        rhoras=mtotal%60;
        mstotal=stotal%60;

        System.out.println("resto horas"+ rhoras);

    }

}

