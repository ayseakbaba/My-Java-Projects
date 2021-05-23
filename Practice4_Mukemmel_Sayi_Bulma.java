import java.util.Scanner;

public class Practice4_Mukemmel_Sayi_Bulma {
    public static void main(String[] args) {
        int toplam = 0 , sayi;
        Scanner in = new Scanner (System.in) ;
        System.out.print("Sayı Girin = ");
        sayi = in.nextInt();
        for (int sayac = 1 ; sayac < sayi ; sayac ++) {
            if (sayi % sayac == 0){
                toplam += sayac;
            }
        }
         if (toplam == sayi) {
                System.out.printf(" %d Mükemmel Sayıdır", sayi);
            }else {
                System.out.printf(" %d Mükemmel Sayı Değildir" , sayi);
            }
            
        
        in.close();
    }
}
