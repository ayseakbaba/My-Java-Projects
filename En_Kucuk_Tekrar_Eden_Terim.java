public class En_Kucuk_Tekrar_Eden_Terim {
    public static void main(String[] args) {
        int[] dizi = {3 , 6 ,3 ,3, 3 , 4 , 9 , 12 , 4 , 4};
        secmeliSirala(dizi);
        for(int i =0; i< dizi.length; i++){
            System.out.println(dizi[i]);
        }
        tekrarAdedi(dizi);
        
    }

    public static int[] secmeliSirala(int[] dizi){
        int n = dizi.length;
        int yedek;
        int minIndex;
        for(int i = 0; i <n-1 ; i++){
            minIndex = i;
            for(int j =i ; j<n ; j ++){
                if(dizi[j] < dizi[minIndex]) minIndex = j;
            }
            yedek = dizi[i];
            dizi[i] = dizi[minIndex];
            dizi[minIndex] = yedek;
        }
        return dizi;
    }

    public static int[] tekrarAdedi(int[] dizi){
        int ucAdeti=0 , dortAdeti=0 , altiAdeti=0 , dokuzAdeti=0 , onikiAdeti=0;
        for(int i = 0; i<dizi.length ; i++){
            if(dizi[i]==3){
                ucAdeti ++;
            }else if(dizi[i] == 4){
                dortAdeti ++;
            }else if(dizi[i] == 6){
                altiAdeti ++;
            }else if (dizi[i] == 9){
                dokuzAdeti ++;
            }else{
                onikiAdeti ++;
            }
        }
        System.out.printf("Dizide %d tane üç var.%n" , ucAdeti);
        System.out.printf("Dizide %d tane dört var.%n" , dortAdeti);
        System.out.printf("Dizide %d tane altı var.%n" , altiAdeti);
        System.out.printf("Dizide %d tane dokuz var.%n" , dokuzAdeti);
        System.out.printf("Dizide %d tane on iki var.%n" , onikiAdeti);

        
        
        if(ucAdeti > dortAdeti && ucAdeti>1){
            System.out.println("En küçük tekrar eden terim: 3'tür.");            
        }else if(dortAdeti> altiAdeti && dortAdeti > 1){
            System.out.println("En küçük tekrar eden terim: 4'tür.");
        }else if(altiAdeti> dokuzAdeti && altiAdeti > 1){
            System.out.println("En küçük tekrar eden terim: 6'dır.");
        }else if(dokuzAdeti> onikiAdeti && dokuzAdeti > 1){
            System.out.println("En küçük tekrar eden terim: 4'tür.");
        }else{
            System.out.println("En küçük tekrar eden terim: 12'dir.");
        }    
        return dizi;
    }
}
