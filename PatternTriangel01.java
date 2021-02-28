import java.util.Scanner;

public class PatternTriangel01 {
    public static void main(String[] args) {
        int satir, sutun, boyut;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyutunu Giriniz : ");
        boyut = input.nextInt();
        
        for (satir = 0; satir < boyut; satir++) {
            for (sutun = 0; sutun < boyut-satir; sutun++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
