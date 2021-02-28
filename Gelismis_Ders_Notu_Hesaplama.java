import java.util.Scanner;

public class Gelismis_Ders_Notu_Hesaplama {
    public static void main(String[] args) {
        /*
        Programın amacı üniversitedeki ders notunu hesaplamak ve harflendirmek.
            1. vizenin %20 'si 
            2. vizenin %20 'si
        Finalin &60 'ı 
        Esas alınarak hesaplanan bir programdır.
        Toplam Not ;
            90 ve üstü--> AA
            85 - 90  ---> BA
            80 - 85  ---> BB
            75 - 80  ---> CB
            70 _ 75  ---> CC
            65 - 70  ---> DC
            60 - 65  ---> DD
            50 - 60  ---> FD
            50 ve altı -> FF
        */
        double vize1 , vize2 , finall , not;

        Scanner in = new Scanner (System.in);
        System.out.print("1. Vize = ");
        vize1 = in.nextDouble();
        System.out.print("2. Vize = ");
        vize2 = in.nextDouble();
        System.out.print("Final = ");
        finall = in.nextDouble();
        in.close();

        not = (vize1 * 1/5 ) + (vize2 * 1/5) + (finall * 3/5);
            System.out.println("Not Ortalaman = " + not);

        if (not >= 90){
            System.out.println("AA");
        }
        else if (not >= 85 && not < 90){
            System.out.println("BA");
        }
        else if (not >= 80 && not < 85){
            System.out.println("BB");
        }
        else if (not >= 75 && not < 80){
            System.out.println("CB");
        }
        else if (not >= 70 && not < 75){
            System.out.println("CC");
        }
        else if (not >= 65 && not < 70){
            System.out.println("DC");
        }
        else if (not >= 60 && not < 65){
            System.out.println("DD");
        }
        else if (not >= 50 && not < 60){
            System.out.println("FD");
        }
        else {
            System.out.println("FF\nDersten Kaldınız...");
        }
    }
}