public class Arrays_ForEach_Loop {
    public static void main(String[] args) {
        Show_The_Array_Method1();
        Show_The_Array_Method2();
        Show_The_Array_Method3();
    }

    public static void Show_The_Array_Method1(){
        String[] array = {"Apple" , "Pineapple" , "Strawberry"};
        for(int i =0 ; i< array.length ; i++){
            System.out.println(array[i]);
        }
    }

    public static void Show_The_Array_Method2(){
        int[] numbers = {1,2,3,4,5,6,7};
        for(int i : numbers){
            System.out.println(i);
        }
    }

    public static void Show_The_Array_Method3(){
        Trying[] arrays = {new Trying("Ayşe") , new Trying("Yasemen") , new Trying("Hatice")};
        for(Trying b : arrays){
            b.Write();
        }
    }
}

class Trying{
    private String name;

    public Trying(String name){
        this.name = name;
    }

    public void Write(){
        System.out.println(name);
    }
}
