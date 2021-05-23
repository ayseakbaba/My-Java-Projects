public class Arrays_3D {
    public static void main(String[] args) {
        int i ,j , k;
        int[][][] diziA = {{{1,2,3,} ,
                            {4,5,6},
                            {7,8,9}},
                           {{1,2,3,} ,
                            {4,5,6},
                            {7,8,9}},
                           {{1,2,3,} ,
                            {4,5,6},
                            {7,8,9}}
                        };
        
        for(i = 0; i<diziA.length; i++){
            for(j = 0 ; j<diziA[0].length; j++){
                for(k = 0; k<diziA[i][j].length; k++){

                }
                System.out.println();
            }
            System.out.println();
        }                
        for(int[][] in2D_Dizi: diziA){
            for(int[] in1D_Dizi:in2D_Dizi){
                for(int veri : in1D_Dizi){
                    System.out.print(veri + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
