package com.nology.zoology.animal;
//lion inherit everything from animal
//Lion is-A animal


public class Lion extends Animal{
    public Lion(int id, String name, int age){
        super(id,name,age);;
    }


    @Override
    public String getInformation() {
        return String.format("Animal with ID: %d, is called %s, and is %d years old",this.id,this.name,this.age);
    }

    @Override
    public void makeSound(){
        System.out.println("ROARRRRR!");
    }
}
