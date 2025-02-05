package org.example;

public class Variables {
    public static void main(String[] args){
        //this is a variable (a named box of memory) thats allocated to store something this tsomething is determined by its data type e.g. byte int char etc
        //must start with a lowercase letter (and camelCase)
        int myAge; //variable declaration
        myAge = 19; //initialazation variable is given its inital value

        String homeTown = "London";
        String name = "Ahmed"; //this variable holds the refrence in memory that ahmed is held in

        final int SOME_NUM = 150; // with constants we can initialize with value but can change value and we use snake case when dealing with constants using the final keyword

        System.out.println(name + " is " + myAge); //concatintation //println creates a newline after completion
        //we can use escape sequences for new lines etc e.g.
        System.out.print(name + " is " + myAge + '\n'); // \n here allows us to create a new line wherer written

        System.out.println("my home town is " + homeTown);


        //primitive types directly hold thier value
        //8 Primitive type in java

    // integers
        //byte - 1 byte
        //short - 2 bytes
        //int - 4 bytes
        //long - 8 bytes

    //real numbers(numbers with decimal points)
        //float - 4 bytes
        //double - 8 bytes

    //single charechters
        //char - 2 bytes (supports 16bit unicode stqandards which supports charchters from a lot of different languages)

    //true and false values
        //boolean - 1 byte (only true or false)


    //refrence types/ non-primitive hold the address of the object that holds the value
        // this can be anything that isnt a primitive



    }
}
