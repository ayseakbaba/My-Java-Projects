import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Linkedlist_City_Tour{

    public static void Cities(){
        LinkedList<String> cities = new LinkedList<String>();
        cities.add("Ankara");
        cities.add("Eskişehir");
        cities.add("Afyon");
        Tour_The_Cities(cities);
    }

    public static void Write_Options(){
        System.out.println("\t0. Show the All Cities\n"
                          +"\t1. Go to Next City.\n"
                          +"\t2. Go to Previous City.\n"
                          +"\t3. Quit the Tour Program.\n "
        );
    }

    public static void Tour_The_Cities(LinkedList<String> cities){
        ListIterator<String> iterator = cities.listIterator();
        int option;
        Write_Options();

        Scanner in = new Scanner(System.in);
        if(iterator.hasNext()){
            System.out.println("There is not found any city.");
        }
        boolean quit = false;
        boolean next = true;
        while(!quit){
            System.out.print("Please choose an option: ");
            option = in.nextInt();

            switch(option){
                case 0:
                    Write_Options();
                    break;
                
                case 1:
                    if (!next){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        next = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Going to City: " + iterator.next());
                    }else{
                        System.out.println("There is not any city to go");
                        next = true;
                    }
                    break;
                case 2:
                    if (next){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                    }
                    next = false;
                }
                    if(iterator.hasPrevious()){
                        System.out.println("Going to City: " + iterator.previous());
                    }else{
                        System.out.println("There is not any city to go");
                    }
                    break;
                case 3:
                    quit = true;
                    System.out.println("Quiting The Program...\n ***Have a Nice Day***");
                    break;
            }
        }
        in.close();
    }
    public static void main(String[] args) {
        System.out.println("---Welcome to Touring te Cities Program---");
        Write_Options();
        Cities();
        
    }
}