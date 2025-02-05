package com.nology.zoology.animal;

public class ZooPlayground {

    public static void main(String[] args) {
        Lion simba = new Lion(1,"simba",13);
        simba.makeSound();
        System.out.println(simba.getInformation());
        Tiger mrT = new Tiger(1,"mrT",32,true);
        mrT.makeSound();
        Llama mrLlama = new Llama(1,"mrLLama",32,"brown");
        mrLlama.makeSound();
        Zoo myZoo = new Zoo();
        myZoo.addTigers();
        System.out.println(myZoo.getAnimalCount());
    }
//2. Creating child classes
//
//    In the package com.nology.zoology.animal
//    Modify the animal classes - Tiger, Llama and Crocodile - so they inherit from the new Animal class
//    Add a suitable constructor to each new class
//    Remove the redundant fields and methods - no longer required
//    Ensure the makeSound() method overrides the parent's version
//
//
//    In the main method for of the ZooPlayground class:
//    Use the latest version of the classes to create your animals
//    Make sure to use the new constructors!
//    Extension
//    Could you make the Animal getInformation() more useful, rather than having to override it?

//    Challenge 🐯🐵🐼
//
//    These challenges use the Zoology application.
//            1. Zoo
//
//    Create a new package com.nology.zoology.zoo
//    In the new package
//    Create a new class called Zoo
//    it should have an array for storing some Tigers, say 10
//    Add a method addTiger() which takes a Tiger object and adds it to the array of Tigers
//    Add a method getAnimalCount() which returns the number of animals in zoo
//    Can you spot any draw backs with this method? 🤔
//    In the main method for of the ZooPlayground class:
//    create a new Zoo object
//    add some Tiger objects to the zoo
//    print out how many tigers the zoo has

    String[] movies = {"lion King", "groove","jungle Books"};

//    for (String movie: movies){
//        System.out.println(movie);
//    }

}
