import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        int row;
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number of rows");
        row = in.nextInt();
        in.close();
        for(int i = 1 ; i<= row ; ++i){
            for(int j = 1 ; j <= i ; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
