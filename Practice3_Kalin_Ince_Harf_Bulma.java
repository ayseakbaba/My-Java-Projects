
import java.util.Scanner;

public class Practice3_Kalin_Ince_Harf_Bulma {
    public static void main(String[] args) {
        String harf ;
        Scanner in = new Scanner (System.in);
        System.out.print("Sesli Bir Harf Giriniz : ");
        harf = in.next();
        switch (harf) {
            case "a" :
            case "ı" :
            case "o" :
            case "u" :
                System.out.println("Kalın Sesli Harftir.");
                break;
                    default :
                    System.out.println("İnce Sesli Harftir.");
        }
        in.close();
    }
}
