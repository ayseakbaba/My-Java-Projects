import java.util.Scanner;

public class Fibonnacci2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kaçıncı basamağa kadar devam etsin? = ");
        int n = in.nextInt();
        int a =1 , b= 1 , sonuc =0;
        for(int i =0 ; i <n ; i++){
            a=b;
            b=sonuc ;
            sonuc = a+b;
            System.out.println(sonuc);
        }
        in.close();
    }
}
