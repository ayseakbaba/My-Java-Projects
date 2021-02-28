import java.util.Scanner;
public class Fibonacci {

    public  static int fibonnacci(int n ){
        if (n==0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonnacci(n-1) + fibonnacci(n-2);
        }
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Kaçıncı basamakta dursun ? = ");
        int n = in.nextInt();

        for (int i = 0; i<=n; i++){
            fibonnacci(n);
            System.out.println(fibonnacci(i));

        }
        in.close();
    }
}
