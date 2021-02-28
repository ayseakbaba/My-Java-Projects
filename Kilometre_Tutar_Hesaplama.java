import java.util.Scanner;

public class Kilometre_Tutar_Hesaplama {
    public static void main(String[] args) {
        // Bir aracın gittiği yol miktarına göre ödeyeceği akaryakıt miktarını hesaplayan program
        double kmBasi  , yol , toplam ; 
        // kmBasi = Aracın km başı yaktığı yakıt miktarı , yol = Aracın gittiği yol miktarı
        Scanner in = new Scanner (System.in);
        System.out.print("Kilometre başı aracın yaktığı yakıt miktarını giriniz = ");
        kmBasi = in.nextDouble();
        System.out.print("Gidilen yol(km cinsinden) = ");
        yol = in.nextDouble();
        in.close();

        toplam = yol *kmBasi;
        System.out.print("Ödenecek Tutar = " + toplam);
    }
}
