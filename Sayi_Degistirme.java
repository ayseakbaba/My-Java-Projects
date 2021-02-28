import java.util.Scanner;

public class Sayi_Degistirme {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int sayi1 , sayi2 , term;
        
        System.out.print("Sayı1 = ");
        sayi1 = in.nextInt();
        System.out.print("Sayı2 = ");
        sayi2 = in.nextInt();
        in.close();

        System.out.printf("Değişmeden Önce : Sayı1 = %d ve Sayı2 = %d%n" , sayi1 , sayi2);

        term = sayi1;
        sayi1 = sayi2;
        sayi2 = term;

        System.out.printf("Değişmeden Sonra : Sayı1 = %d ve Sayı2 = %d" , sayi1 , sayi2);
    }
}
