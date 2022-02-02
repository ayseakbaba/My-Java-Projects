import java.util.Scanner;

public class gelismishesapmakinesi {
    public static int cıkarma(int a,int b) {
        return(a-b);
        
    }
    public static double bolme(int a ,int b){
        return((double)a/b);
    }
    public static int toplama(int a ,int b){
        return(a+b);
    }
    public static int toplama(int a,int b,int c){
        return(a+b+c);
    }
    public static int carpma(int a,int b){
        return(a*b);
    }
    public static int carpma(int a,int b,int c){
        return (a*b*c);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String islemler="1 Toplama işlemi\n"
                        +"2 çıkarma işlemi\n"
                        +"3 çarpma işlemi\n" 
                        +"4 bölme işlemi\n"
                        +"çıkkış için q'ya basın";
        System.out.println("******************");
        System.out.println(islemler);
        System.out.println("******************");
        while(true){
            System.out.println("yapmak istediğiniz işlemi seçin");
            String islem=sc.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor....");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("kaç değer toplayacaksınız (2 veya 3)");
                int kacsayi=sc.nextInt();
                if(kacsayi==2){
                    System.out.print("a= ");
                    int a=sc.nextInt();
                    System.out.print("b= ");
                    int b=sc.nextInt();
                    System.out.print("girilen sayıların toplamı= "+toplama(a, b));
                }
                else if(kacsayi==3){
                    System.out.print("a= ");
                    int a=sc.nextInt();
                    System.out.print("b= ");
                    int b=sc.nextInt();
                    System.out.print("c= ");
                    int c=sc.nextInt();
                    System.out.println("girilen sayıların toplamı= "+toplama(a, b, c));

                }
                else{
                    System.out.println("uygun metod bulunamadı...");

                }

            }
            else if(islem.equals("2")){
                System.out.print("a= ");
                int a=sc.nextInt();
                System.out.println("b= ");
                int b=sc.nextInt();
                System.out.println("girilen sayıların farkı "+cıkarma(a, b));
            }
            else if(islem.equals("3")){
                System.out.println("kaç değer çarpacaksınız (2 veya 3)");
                int kacsayi=sc.nextInt();
                if(kacsayi==2){
                    System.out.print("a= ");
                    int a=sc.nextInt();
                    System.out.print("b= ");
                    int b=sc.nextInt();
                    System.out.print("girilen sayıların çarpımı= "+carpma(a, b));
                if(kacsayi==3){
                    System.out.print("a= ");
                    a=sc.nextInt();
                    System.out.print("b= ");
                    b=sc.nextInt();
                    System.out.print("c= ");
                    int c=sc.nextInt();
                    System.out.println("girilen sayıların çarpımı= "+carpma(a, b, c));
                }
                else{
                    System.out.println("uygun metod bulunamadı.....");
                }
            }
        }
            else if(islem.equals("4")){
                System.out.print("a= ");
                int a=sc.nextInt();
                System.out.println("b= ");
                int b=sc.nextInt();
                System.out.println("girilen sayıların bölümü= "+bolme(a, b));
            }

        else{
            System.out.println("geçersiz işlem....");
        }
    }
    

    sc.close();
   }
   
}