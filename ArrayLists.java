import java.util.ArrayList;
//Amaç: Bir arraylisti fonksiyon içinde yazmak
public class ArrayLists {
    public static void PrintArraylist(ArrayList<String> a) {
        for(int i =0 ; i<a.size() ; i++){
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args) {
        // Amaç: Arraylerin genişletilebilir eksiltilebilir halleridir.
        ArrayList<String> arraylist = new ArrayList<>();
        /*
         * ArrayList'lerin kendilerine has bazı özel fonksiyonları vardır. add , get
         * bunlardan birkaçıdır.
         */
        arraylist.add("Metalica"); // Amaç:Yeni data girişi sağlar.
        arraylist.add("Guns' n Roses");
        arraylist.add("Black Sabbath");
        arraylist.add("Iron Maiden");

        System.out.println("");
   
        System.out.println(arraylist.get(0)); // Amaç:İstenen indexteki veriyi çağırıp kullanılabilir yapmak.
        System.out.println(arraylist.get(3));
        System.out.println(arraylist.get(2));

        System.out.println("********************");

        System.out.println("ArrayListin Boyutu = " + arraylist.size());

        System.out.println("********************");

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

        System.out.println("********************");

        arraylist.remove(0);
        arraylist.remove("Iron Maiden");

        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }

        System.out.println("********************");

        arraylist.add("Metalica");
        arraylist.add("Iron Maiden");
        arraylist.add("Metalica");

        System.out.println(arraylist.indexOf("Metalica")); // İlk metalicanın indexini yazar
        System.out.println(arraylist.lastIndexOf("Metalica")); // taramaya sondan başlar ilk karşılaştığı andaki indexi
                                                               // yazar.
        System.out.println(arraylist.indexOf("Dream Theatre")); // Olmayan bir terim olduğunda cevap olarak -1 döndürür.

        System.out.println("********************");
        //Set fonksiyonu arraylisti güncellemek için kullanılan bir fonksiyondur.
        //Amaç arraylistin dördüncü elemanını değiştirmektir.
        arraylist.set(4, "Megadeth");   
        PrintArraylist(arraylist);
    }

}
