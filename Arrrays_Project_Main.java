import java.util.Scanner;

public class Arrrays_Project_Main {
    private static Arrays_Project_Card[][] cards = new Arrays_Project_Card[4][4];

    public static void main(String[] args) {
        cards[0][0] = new Arrays_Project_Card('E');
        cards[0][1] = new Arrays_Project_Card('A');
        cards[0][2] = new Arrays_Project_Card('B');
        cards[0][3] = new Arrays_Project_Card('F');
        cards[1][0] = new Arrays_Project_Card('G');
        cards[1][1] = new Arrays_Project_Card('A');
        cards[1][2] = new Arrays_Project_Card('D');
        cards[1][3] = new Arrays_Project_Card('H');
        cards[2][0] = new Arrays_Project_Card('F');
        cards[2][1] = new Arrays_Project_Card('C');
        cards[2][2] = new Arrays_Project_Card('D');
        cards[2][3] = new Arrays_Project_Card('H');
        cards[3][0] = new Arrays_Project_Card('E');
        cards[3][1] = new Arrays_Project_Card('G');
        cards[3][2] = new Arrays_Project_Card('B');
        cards[3][3] = new Arrays_Project_Card('C');

        while(Is_The_Game_Over() == false){
            Game_Board();
            Get_Forecast();
        }
    }


    public static void Game_Board(){
        for(int i = 0 ; i<4 ; i++){
            System.out.println("____________________");
            for(int j = 0 ; j<4 ; j++){
                if(cards[i][j].isForecast()){
                    System.out.print(" |" + cards[i][j].getValue() + "| ");
                }else{
                    System.out.print(" | | ");
                }
            }
            System.out.println("");
        }
        System.out.println("____________________");
    }


    public static boolean Is_The_Game_Over(){
        for(int i = 0; i<4 ; i++){
            for(int j = 0; j<4 ; j++){
                if(cards[i][j].isForecast() == false){
                    return false;
                }
            }
        }
        return true;
    }


    public static void Get_Forecast(){
        Scanner in = new Scanner(System.in);
        System.out.print("The First Forecast(Please enter the value of line and coloumn with space): ");
        int i1 = in.nextInt();
        int j1 = in.nextInt();

        cards[i1][j1].setForecast(true);
        Game_Board();

        System.out.print("The Second Forecast(Please enter the value of line and coloumn with space): ");
        int i2 = in.nextInt();
        int j2 = in.nextInt();

        if(cards[i1][j1].getValue() == cards[i2][j2].getValue()){
            System.out.println("True choice. Well Done");
            cards[i2][j2].setForecast(true);
        }else{
            System.out.println("False choice. Try Again");
            cards[i1][j1].setForecast(false);
        }
    }
}
