import java.util.Scanner;
public class KarePiramidinAlaniHacmi {

	public static void main(String[] args) {
		int alan = 0, hacim = 0 , a , h , y ;
		Scanner klavye = new Scanner (System.in);
		System.out.print("Taban kenar uzunluðunu giriniz = ");
		a = klavye.nextInt();
		System.out.print("Piramidin yüksekliðini giriniz = ");
		h = klavye.nextInt();
		System.out.print("Yanal yüzeyin yüksekliðini giriniz = ");
		y = klavye.nextInt();
		klavye.close();
		alan +=(int) Math.pow(a, 2) + 4*a*y/2;
		System.out.println("Alan = " + alan);
		hacim +=(int) Math.pow(a, 2)*h/3;
		System.out.print("Hacim = " + hacim);
	} 

}
