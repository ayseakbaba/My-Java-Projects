import java.util.Scanner;

public class Methodlarla_Ebob_Hesaplama {
    public static int ebobhesap (int a , int b){
        int ebob =1;
        for (int i = 1 ; i <=a && i<=b ; i ++ ){
            if(a % i == 0 && b % i == 0){
                ebob = i;
            }
        }
       return ebob;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("1.Sayı = ");
        int a = in.nextInt();
        System.out.print("2.Sayı = ");
        int b = in.nextInt();
        in.close();

        System.out.printf("EBOB (%d , %d) = %d ",a,b,ebobhesap(a, b));
    }
}
