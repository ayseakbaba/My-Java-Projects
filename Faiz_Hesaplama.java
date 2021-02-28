import java.util.Scanner;

public class Faiz_Hesaplama {
    public static void main(String[] args) {
        /*
        Faiz Uygulaması :
        Kullanıcıdan ana para değerini ve parasının kaç yıl vadeli istediği
        bilgisini alın ve her senenin sonunda toplam para miktarını ekrana yazdırın

        Faiz Oranı : %6
         */
        Scanner in = new Scanner (System.in);
        System.out.print("Ana para (Yatırılacak Para Miktarı)  = ");
        double anapara = in.nextDouble();
        System.out.print("Vade Miktarı (Yıl Cinsinden)  = ");
        int vade = in.nextInt();

        double toplam = anapara;
        double faiz = 0.06;

        for(int i =1; i <= vade ; i ++){
            toplam = (toplam * faiz) + toplam;
            System.out.printf("%d. Sene Sonu Toplam Para = %.2f%n",i , toplam);
        }
        in.close();
    }
}
