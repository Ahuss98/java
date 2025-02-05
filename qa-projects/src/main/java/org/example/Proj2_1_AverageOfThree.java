package org.example;
import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double num1;
        double num2;
        double num3;

        System.out.println("please give me your first number!");
        num1 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("please give me your second number!");
        num2 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("please give me your third and final number!");
        num3 = keyboard.nextDouble();
        keyboard.nextLine();

        double mean = (num1 + num2 + num3)/3;
        System.out.println("your mean is: " + mean);
    }
}
