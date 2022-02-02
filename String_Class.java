public class String_Class {
    public static void main(String[] args) {
        //Stringler iki şekilde tanımlanabilir.Bu tanımalamalarda ufak bir fark vardır.String gösterme şekilleri:
        String a = "Yasemen";
        String b = new String("Yasemen");

        System.out.println(a);
        System.out.println(b);
        System.out.println("Harf Sayısı: " + b.length());
        System.out.println("The First Letter: " + b.charAt(0));//charAt girilen indexteki harfi gösterir.
        System.out.println("2.İndex: " + b.charAt(2));
        System.out.println("The Last Letter: " + b.charAt(b.length()-1));

        for(int i =0 ; i< b.length() ;i++){
            System.out.println(b.charAt(i));
        }

        System.out.println(b.startsWith("Ya"));//startsWith : b String'i ... ile başlıyor mu? Cevabı true veya false
        System.out.println(b.endsWith("se"));//endsWith : b String'i ... ile bitiyor mu? Cevabı true veya false

        System.out.println(b.indexOf("e"));//Baştan başlayarak b'nin içinde ilk gördüğü e harfinin indexini yazar.Eğer o harf yoksa -1 döndürür.
        System.out.println(b.lastIndexOf("e"));//Sondan başlayarak b'nin içinde ilk gördüğü e harfinin indexini yazar.Eğer o harf yoksa -1 döndürür.
        System.out.println(b.indexOf("g"));

        System.out.println(b.toLowerCase());//Tüm harfleri küçük yazar.
        System.out.println(b.toUpperCase());//Tüm harfleri büyük yazar.

        //Tür Dönüşüşmleri:
        //String'den Integer'e:
        String c = "1923";
        int d = Integer.parseInt(c);
        System.out.println(d-42);

        //Integer'den String'e:
        int e = 1923;
        String f = String.valueOf(e);
        System.out.println(f);

        /*İki farklı gösterim şeklinin birbirinden farkı ;
        Birincisinde aynı değerlere sahip iki stringi eşit mi diye kontrol ettiğimizde bize eşit sonucunu verir.
        İkincisinde ise farklı referanslara kaydedildikleri için eşit değiller sonucunu görürüz.
        İkincisindeki içerkilerin eşitliğini kıyaslamak için equals() fonksiyonunu kullanırız.
        */

        String a1 = "Ayse";
        String a2 = "Ayse";
        if (a1==a2){
            System.out.println("Eşitler");
        }else{
            System.out.println("Eşit Değiller");
        }

        String b1 = new String();
        String b2 = new String();
        //Bu haldeyken ise eşitler sonucunu döndürüyor.
        if(b1.equals(b2)){  //if (b1==b2)= Bu haldeyken eşit değiller sonucunu döndürüyor. 
            System.out.println("Eşitler");
        }else{
            System.out.println("Eşit Değiller");
        }
    }
}
