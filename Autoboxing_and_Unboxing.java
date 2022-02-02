import java.util.ArrayList;

public class Autoboxing_and_Unboxing {
    public static void main(String[] args) {
        /*
         *Wrapper Class:
         Bu class yapısı ilkel veri tiplerini tıpkı String gibi bir class'a çeviriyor.
         Örneğin int tipinde bir arraylist oluşturacağımız zaman bu classları kullanırız.

         boolean ---> Boolean
         char ---> Character
         byte ---> Byte
         short ---> Short
         int ---> Integer
         long---> Long
         float ---> Float
         double ---> Double
         */

         ArrayList<String> arraylist = new ArrayList<String>();
         //ArrayList<int> arraylist2 = new ArrayList<int>();
         //21. Kod hatalı kabul edilir ve çalışmaz.Çalışması için:
         ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
         /*
         23.Satırdaki gibi bir kodun anlamı :
         İçinde int tipi veriler bulunduran bir arraylist oluşturdum.
         */

         /*Autoboxing:
         Örneğin; Anlamı ilkel bir veri tipi olan int i'yi bu yöntemle sanki bir kutuya koyuyoruz.
         Bu koyduğumuz kutu integer değer taşıyan Arraylistimiz olacak.
         Aslında bizim bu işlemi yapmamıza gerek yok . Çünkü;
         Bu işi java zaten kendi içinde yapıyor.Extradan yapmamıza gerek yok.
         */

         for(int i =0;i<10 ; i++){
             arraylist2.add(Integer.valueOf(i*4));
         }

         /*Unboxing:
         Yukarıda ArrayListin içine attığımız değerleri yazdırırken değeri çağırmak için unboxing uygularız.
         Bunu da yapmamıza gerek yok.Çünkü ;
         Bu işlemi de java bizim yerimize yapıyor.
         */ 
         for(int i =0;i<arraylist2.size();i++){
             System.out.println(arraylist2.get(i).intValue());
         }

         arraylist.add("Autoboxong ve Unboxing bu kadar...");
         System.out.println(arraylist);

    }
}
