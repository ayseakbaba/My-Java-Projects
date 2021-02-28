import java.util.Scanner;
public class NTanedenBuyukOlaniBulma {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("Kýyaslama Adedini Giriniz = ");
		int n = in.nextInt();
		int sayi , sayac =0 , buyukSayi ;
		do {
			System.out.print("Sayý giriniz = ");
			sayi = in.nextInt();
			buyukSayi = sayi ;
			sayac ++;
			if (sayi > buyukSayi) {
				buyukSayi = sayi ;
				sayac ++;
			}
		}while(sayac< n);
		in.close();
			System.out.print("Büyük Sayý = " + buyukSayi);
		
	}

}
