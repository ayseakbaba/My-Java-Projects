import java.util.Scanner;
public class UcSayidanBuyugu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi1 , sayi2 , sayi3 ;
		System.out.print("Sayý Girin = ");
		sayi1= input.nextInt();
		System.out.print("Sayý Girin = ");
		sayi2 = input.nextInt();
		System.out.print("Sayý Girin = ");
		sayi3 = input.nextInt();
		input.close();
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.print("En Büyük Sayý = " + sayi1);
		}else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.print("En Büyük Sayý = " + sayi2);
		}else {
			System.out.print("En Büyük Sayý = " + sayi3);
		}
		

	}

}
