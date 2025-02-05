package org.example;

//java.util is a package of classes and methods
import java.util.Scanner;


public class KeyboardInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double numb;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("Whats your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();// consume the new line

        System.out.println("give me a real number");
        numb = keyboard.nextDouble();
        numb *= 2;
        System.out.println("your new number " + numb);
        keyboard.nextLine();

        System.out.println("whats city do u live in?");
        city = keyboard.nextLine();

        System.out.println("Hello " + name);
        System.out.println("age is " + age);
        System.out.println("city is " + city);
    }
}
