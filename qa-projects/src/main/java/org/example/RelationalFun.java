package org.example;

public class RelationalFun {
    public static void main(String[] args){
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 26;
        int yourAge = 20;
        int bobsAge = 20;
        System.out.println("mybool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        String myName = "Ahmed";
        String yourName = "Ahmed";
        //realtional operations

        boolean ageComparison  = myAge > yourAge;
        System.out.println("myAge > yourAge? :" + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge " + ageComparison);


        //can compare memory address of non-primitive types
        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bohbsAge " + ageComparison);


        //this compares actual lexical value of charecters if used == it will comapre the memory address
        boolean nameComparison = myName.equals(yourName);
        System.out.println("do names match: " + nameComparison);

        int currentAge = 26;
        System.out.println("is age larger than 21: " + (currentAge > 21));
    }
}
