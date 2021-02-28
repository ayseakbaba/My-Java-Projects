import java.util.Scanner;
public class AraliktaCiftTekAdetToplam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int altDeger , ustDeger , ciftAdet =0 , ciftToplam =0,tekAdet=0 , tekToplam =0;
		System.out.print("Alt Değer Gir = ");
		altDeger = input.nextInt();
		System.out.print("Üst Değer Gir = ");
		ustDeger = input.nextInt();
		
		while(altDeger > ustDeger) {
			System.out.print("Tekrar Alt Değer Gir = ");
			altDeger = input.nextInt();
			System.out.print("Tekrar Üst Değer Gir = ");
			ustDeger = input.nextInt();
		}do {
			if(altDeger%2==0) {
				ciftToplam += altDeger;
				ciftAdet++;
			}else {
				tekToplam += altDeger ;
				tekAdet ++;
			}altDeger++;
		}while(altDeger<ustDeger) ;
		input.close();
			System.out.println("Çift Adet = "  + ciftAdet);
			System.out.println("Çift Toplam = " + ciftToplam);
			System.out.println("Tek Adet = " + tekAdet);
			System.out.println("Tek Toplam = " + tekToplam);
			
		}
	}

