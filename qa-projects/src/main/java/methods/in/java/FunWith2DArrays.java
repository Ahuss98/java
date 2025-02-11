package methods.in.java;

import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        //2row x 3column
        int[][] my2DArray = new int[2][3];
        fill2DArray(my2DArray);
        print2DArray(my2DArray);
        System.out.println();
        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }

    public static void fill2DArray(int[][] twoDArr){
        Random rand = new Random();

        for(int i = 0; i < twoDArr.length; i++){
            for (int j = 0; j < twoDArr[i].length; j++){
                //randomize 0 through to 100
                //row i column j
                twoDArr[i][j] = rand.nextInt(100);
            }
        }
    }
    public static void print2DArray(int[][] twoDArr){
        for(int[] arr: twoDArr){
            for(int num : arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void twice2DArray(int[][] twoDArr){
        for(int i = 0; i < twoDArr.length; i++){
            for (int j = 0; j < twoDArr[i].length; j++){
                //randomize 0 through to 100
                //row i column j
                twoDArr[i][j] *= 2;
            }
        }
    }
}
