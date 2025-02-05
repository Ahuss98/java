package org.example;

public class ConversionFun {
    //casting
    public static void main(String[] args){
        //litral constants e.g. 3.14 has a default type (double)
        //converting data types into smaller data types is called narrowing/losey(lo-see) converstion
        float myFLoat1 = 3.14f; //adding a f at the end to let java know i want convert as a float
        float myFLoat2 = (float)3.14; //put float in brackets to let java know

        // widening/lossless converstion i dont need to cast type
        double yourDouble = myFLoat1;

    }
}
