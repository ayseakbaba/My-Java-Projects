public class Asal_Sayi {
    public static boolean asalMı(int sayi){
        // Burda bir sayının asal olup olmadığını kontrol ediyoruz.
        for(int i = 2 ; i< sayi ; i++){
            if (sayi % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Burda 1 - 1000 arası asal sayıları asalMı fonksiyonuna gönderip asallık incelemesi yapacağız.
        for(int i = 2 ; i< 1000 ; i++){
            if(asalMı(i)){
            System.out.println(i);
        }
        }
    }
}
