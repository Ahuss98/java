package com.nology.zoology.command;
import java.util.Scanner;

public class PickAnimalNumber {
    Scanner keyboard = new Scanner(System.in);
    private int numbOfAnimals;
    private int numbOfLions;
    private int numbOfLlamas;
    private int numbOfCrocs;
    private int numbOfTigers;
    private boolean isRandom ;

    public PickAnimalNumber() {
        System.out.println("Do you want to: ");
        System.out.println("1. Pick the total number of animals");
        System.out.println("2. Pick the number of each animal individually");

        int choice = keyboard.nextInt();
        keyboard.nextLine();

        if (choice == 1) {
            setRandomAnimalCount();
            isRandom = true;
        } else if (choice == 2) {
            setManualAnimalCount();
            isRandom = false;

        }
    }

    public PickAnimalNumber(boolean isRandom) {
        if (isRandom){
            setRandomAnimalCount();
        } else {
            setManualAnimalCount();
        }
    }

    private void setRandomAnimalCount() {
        System.out.println("pick a how many animals you want in the zoo");
        numbOfAnimals = keyboard.nextInt();
        keyboard.nextLine();
    }

    private void setManualAnimalCount() {
        System.out.println("Enter the number of Lions:");
        numbOfLions = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter the number of Tigers:");
        numbOfTigers = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter the number of Llamas:");
        numbOfLlamas = keyboard.nextInt();
        keyboard.nextLine();
    }

    public int getNumbOfAnimals() {
        return numbOfAnimals;
    }

    public int getNumbOfTigers() {
        return numbOfTigers;
    }

    public int getNumbOfLlamas() {
        return numbOfLlamas;
    }

    public int getNumbOfLions() {
        return numbOfLions;
    }

    public int getNumbOfCrocs() {
        return numbOfCrocs;
    }

    public boolean getChoice() {
        return isRandom;
    }
}
