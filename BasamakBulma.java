import java.util.Scanner;

public class BasamakBulma {

	public static void main(String[] args) {
		int  basamak = 0 , sayi , kalan ;
		Scanner input = new Scanner (System.in);
		System.out.print("Sayı Gir = ");
		sayi = input.nextInt();
		input.close();
		do {
			kalan =sayi%10 ;
			sayi = (sayi - kalan)/10;
			basamak++;
		}while (sayi>0);
		System.out.print("Basamak Sayısı = " + basamak);
	}

}
