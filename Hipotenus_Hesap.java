import java.util.Scanner;

public class Hipotenus_Hesap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a , b ;

        do{
            System.out.print("Üçgenin bir kenar uzunluğunu girin = ");
            a = in.nextInt();
            System.out.print("Üçgenin diğer kenar uzunluğunu girin = ");
            b = in.nextInt();
        }while(a < 0 || b < 0 );
        in.close();

       double c= Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.print("Hipotenüs = " + c);
    }
}
