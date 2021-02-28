public class Methodlarda_Overloading {
    public static void toplama(int a , int b , int c) {
        System.out.printf("Sayılar a= %d , b = %d , c = %d%n" , a,b,c);
        System.out.println("Toplam = " + (a+b+c));
    }
    public static void toplama(int a , int b ) {
        System.out.printf("Sayılar a= %d , b = %d%n" , a,b);
        System.out.println("Toplam = " + (a+b));
    }
    public static void toplama(String isim ,int no) {
        System.out.printf("Öğrenci ismi = %s , Okul no = %d%n" , isim,no);
        System.out.println("Toplam = " + (isim+no));
    }
    public static void main(String[] args) {
        /**
         * Overloading kelime manası aşırı yükleme
         * Aynı fonksiyon ismine sahip fonksiyonlara farklı görevler verme olayıdır.
         */
        toplama("Ayşe", 2020123018);
        toplama(45, 890);
        toplama(345, 78, 456);
    }
}
