import java.util.Scanner;
public class FaktorHesaplama {

	public static void main(String[] args) {
		int faktor = 1 , sayi;
		Scanner in = new Scanner(System.in);
		System.out.print("Sayý Giriniz = ");
		sayi = in.nextInt();
		in.close();
		while (sayi>=1) {
			faktor=faktor * sayi;
			sayi--;
		}
		System.out.println("Faktör = " + faktor);
	}

}
