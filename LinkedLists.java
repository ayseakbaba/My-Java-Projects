import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

    public static void Arraylist(){
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("Java");
        languages.add("Php");
        languages.add("Pyton");
        languages.add("Kotlin");
        languages.add("C#");

        for(String s : languages){
            System.out.println(s);
        }
        System.out.println("------------------");
    /* 
    Var olan bir arraylist'e herhangi bir indexine yeni bir eleman ekleyeceğimiz zaman her bir eleman bir altındaki satıra kayar.
    Küçük ölçekli projelerde bu pek sorun olmasa da daha büyük ölçeklilerde bu olay sorun yaratır.
    Arraylistler'in iyi bir yanı ise bellekten tasarruf etmesidir.
    Kısacası Arraylistler bellekten kazanırken performanstan kaybediyorlar.  
    */
        languages.add(1,"C++");

        for(String s : languages){
            System.out.println(s);
        }

    }

    public static void Linkedlist(){
    /*LinkedListlerin mantığı ise ;
    Dallanmış grafiği şeklinde. Bu yapıda bir eleman eklenip çıkarılırken tüm elemanlar kaydırılmaz.
    Sadece bir bağlantı kopar yerine ya yenisi bağlanır ya da var olan bir yere bğlanır.
    LinkedListler , ArrayListlere göre bellekte daha fazla yer kaplarken performans açısından çok daha kullanışlıdır.
    Kısacası Linkedlistler performanstan kazanırken bellekten kaybediyorlar.
    */
        LinkedList<String> place_to_go = new LinkedList<String>();
        place_to_go.add("Post Office");
        place_to_go.add("Market");
        place_to_go.add("School");
        place_to_go.add("Library");
        place_to_go.add("Gym");
        place_to_go.add("Home");
        System.out.println("------------------");
        Write_Linkedlist(place_to_go);

        System.out.println("------------------");
        place_to_go.add(4, "Mall");
        place_to_go.remove(5);
        Write_Linkedlist(place_to_go);
    }

    public static void Linkedlist2(){
        LinkedList<String> place_to_go = new LinkedList<String>();
        System.out.println("------------------");
        Add_Sequantial(place_to_go, "Post Office");
        Add_Sequantial(place_to_go, "Market");
        Add_Sequantial(place_to_go, "School");
        Add_Sequantial(place_to_go, "Library");
        Add_Sequantial(place_to_go, "Home");
        Add_Sequantial(place_to_go, "Mall");
        Add_Sequantial(place_to_go, "Gym");
        Write_Linkedlist(place_to_go);
        
    }

    public static void Add_Sequantial(LinkedList<String> place_to_go , String recent){
        ListIterator<String> iterator = place_to_go.listIterator();
        while(iterator.hasNext()){
            int compare = iterator.next().compareTo(recent);
        //Bu işlem yazılan yeni yerleri alfabetik sıraya göre dizdiriyor.ve -1 ,0 ,1 değerlerinden birini alıyor
        //Eğer eklenen kelime alfabetik olarak diğer kelimelerden önde ise compare = 1
        //Eğer eklenen kelime zaten o listede var ise compare = 0
        //Eğer eklenen kelime alfabetik olarak diğer kelimelerden sonra ise compare = -1
            if (compare ==0){
                System.out.println("This element is already in the list");
                return;
            }else if(compare < 0){
                //Bir şey yapmaya gerek yok döngü çalışıyor demektir.
            }else if(compare >0){
            //Anlamı: eğerki eklenen yeni kelime alfabetik sırada daha önce yer alıyorsa iterator bulunduğu noktadan bir geri gidip onu ekliyor
                iterator.previous();
                iterator.add(recent);
                return;
            }
        }
        iterator.add(recent);
        
    }

    public static void Write_Linkedlist(LinkedList<String> place_to_go){
        /*for(String s : place_to_go){
            System.out.println(s);
        }*/ 
        //foreach döngüsü yerine altrnatif olarak Linkedliste özel iterator yazacağız.
        ListIterator<String> iterator = place_to_go.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        /*
        LinkedListlerden bahsetmeden önce onların Arraylistlerden farkını göstermek istiyorum.
        */
    Arraylist();

    Linkedlist();

    Linkedlist2();
     
    }
}
