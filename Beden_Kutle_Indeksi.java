import java.util.Scanner;

public class Beden_Kutle_Indeksi {
    public static void main(String[] args) {
        int kilo;
        double bki, boy ;
        Scanner input = new Scanner (System.in);
        System.out.print("Kilo = ");
        kilo = input.nextInt();
        System.out.print("Boy(Metre cinsinden 1,80 gibi) = ");
        boy = input.nextDouble();
        input.close();

        bki = kilo / Math.pow(boy, 2.0);
        if (bki >=30){
            System.out.println("Aşırı Kilolu (Obez)");
        }
        else if (bki <30 && bki >= 25){
            System.out.println("Şişman");
        }
        else if (bki <25 && bki >= 20){
            System.out.println("Normal");
        }
        else if (bki < 20 && bki >= 15){
            System.out.println("Zayıf");
        }
        else {
            System.out.println("Aşırı Zayıf");
        }
    }
}
