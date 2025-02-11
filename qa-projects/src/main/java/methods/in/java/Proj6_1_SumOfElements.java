package methods.in.java;

import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {

    }

    public static int sumElements(ArrayList<Integer> myArr){
        int total = 0;
        for (Integer integer : myArr) {
            total += integer;
        }
        return total;
    }
}
