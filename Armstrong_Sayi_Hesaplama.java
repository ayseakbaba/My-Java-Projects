import java.util.Scanner;

public class Armstrong_Sayi_Hesaplama {
    public static void main(String[] args) {
        /*
        Bu programın amacı klavyeden girilen bir sayının Armstrong sayı olup olmadığını bulma
        Armstrong Sayılar :
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (4 basamaklı)
        371 = 3^3 + 7^3 + 1^3 (3 basamaklı)
        */
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak Sayısı : ");
        int basamak_sayisi = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_degeri,basamak_sayisi);
            
        }while(gecici_sayi > 0);
        
        if (sayi == toplam) {
            
            System.out.println("Bu sayı bir armstrong sayısıdır...");
        }
        else {
            System.out.println("Bu sayı bir armstrong sayısı değildir...");
        }
        scanner.close();
    }
}
