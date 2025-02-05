package com.nology.zoology.animal;

public class Tiger extends Animal{
    boolean hasStripes = true;

    public Tiger(String name) {
        super(name);
    }

    public Tiger(int id, String name, int age){
        super(id,name,age);
    }

    public Tiger(int id, String name, int age, boolean hasStripes) {
        super(id, name, age);
        this.hasStripes = hasStripes;
    }

    public void setHasStripes(boolean hasStripes) {
        this.hasStripes = hasStripes;
    }

    public boolean isHasStripes() {
        return hasStripes;
    }




    @Override
    public String getInformation() {
        return String.format("Animal with ID: %d, is called %s, and is %d years old,I have stripes %b\n",this.id,this.name,this.age, this.hasStripes);
    }

    @Override
    public void makeSound(){
        System.out.format("I am have stripes %b",this.hasStripes);
    }
}
