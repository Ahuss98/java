package org.example;
import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String adjective1;
        String girlslName;
        String adective2Ocupation;
        String place;
        String clothing;
        String hobby;
        String adjective3Ocupation2;
        String boysName;
        String mansName;

        System.out.println("please provide a ADJECTIVE");
        adjective1 = keyboard.nextLine();
        System.out.println("please give me a girls name");
        girlslName = keyboard.nextLine();
        System.out.println("please give me the first occupation");
        adective2Ocupation = keyboard.nextLine();
        System.out.println("give me location");
        place = keyboard.nextLine();
        System.out.println("give me a piece of clothing");
        clothing = keyboard.nextLine();
        System.out.println("give me a hobby");
        hobby = keyboard.nextLine();
        System.out.println("give me another occupation");
        adjective3Ocupation2 = keyboard.nextLine();
        System.out.println("give me a boys name");
        boysName = keyboard.nextLine();
        System.out.println("give me a mans name");
        mansName = keyboard.nextLine();

        System.out.printf("There once was a %s girl named %s,\n who was a %s in the kingdom of %s.\n she loved to wear %s and to %s.\n she wanted to marry the %s named %s\n but her father.King %s forbid her from seeing him", adjective1,girlslName,adective2Ocupation,place,clothing,hobby,adjective3Ocupation2,boysName,mansName);

    }
}
