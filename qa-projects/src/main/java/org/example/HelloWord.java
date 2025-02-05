package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloWord {
    //the word public allows other classes and methods outside of this class have full access to something
    //the word static means the main method belongs to the main class and can be called by the system directly on this class
    // the main method is a special method that acts as an entry point into our application (this method is loaded into memory when the program starts) and whatever is in main is what is executed in the programs lifecycle
    public static void main(String[] args) {
        //system is a class
        //out is a refrence to an object that lives in that class that gives us access to the print screen
        //methods are behaviours and operations with which we can tell our program to do something
        // using double quotes for string
        System.out.println("hello world!"); // semi colon needs to be here or wont compile( and will cause a syntax error and must be avoided)
        System.out.println("Hello Ahmed!");
    }
}