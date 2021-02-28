import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        
        System.out.printf("1 : Toplama \n2 : Çıkarma \n3 : Çarpma \n4 : Bölme \n5 : Mod Alma\n");
        
        int islem , sayi1 , sayi2 ;
        
        Scanner in = new Scanner (System.in);
        System.out.print("Yapacağınız İşlem Türünün Numarasını Girin = ");
        islem = in.nextInt();
        do{
            System.out.println("Geçersiz İşlem Numarası. Lütfen 1-5 Arası Bir Rakam Giriniz");
            
            System.out.print("Yapacağınız İşlem Türünün Numarasını Girin = ");
            islem = in.nextInt();

        }while(islem > 5);
        System.out.print("Sayı Gir =");
        sayi1 = in.nextInt();
        System.out.print("Sayı Gir =");
        sayi2 = in.nextInt();
       
        in.close();

        switch (islem){
            case 1 :
                System.out.println("Sonuç = " + (sayi1 + sayi2));
                break;
            case 2 :
                System.out.println("Sonuç = " + (sayi1 - sayi2));
                break;
            case 3 :
                System.out.println("Sonuç = " + (sayi1 * sayi2));
                break;
            case 4 :
                System.out.println("Sonuç = " + (sayi1 / sayi2));
                break;
            case 5 :
                System.out.println("Sonuç = " + (sayi1 % sayi2));
                break;
        }
    }
}
