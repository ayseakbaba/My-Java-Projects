import java.util.Scanner;

public class Practice5_Arkadas_Sayi {
    public static void main(String[] args) {
       int toplam1 = 0 , toplam2 = 0 , sayi1 , sayi2 ;
       
       Scanner in = new Scanner(System.in);
       System.out.print("Sayı1 = ");
       sayi1 = in.nextInt();
       System.out.print("Sayı2 = ");
       sayi2 = in.nextInt();
       in.close();

       for(int sayac1 = 1 ; sayac1 < sayi1 ; sayac1 ++){
           if (sayi1 % sayac1 == 0){
               toplam1 += sayac1 ;
           }
       }
       if (toplam1 == sayi2){
            for (int sayac2 = 1 ; sayac2 < sayi2 ; sayac2 ++){
                if (sayi2 % sayac2 == 0){
                    toplam2 += sayac2;
                }
            }
            if (toplam2 == sayi1){
                System.out.printf("%d ve %d Arkadaş sayıdır." , sayi1 , sayi2);    
            }
       }else {
           System.out.printf("%d ve %d Arkadaş sayı değildir." , sayi1 , sayi2);
       }

    }
    
}
