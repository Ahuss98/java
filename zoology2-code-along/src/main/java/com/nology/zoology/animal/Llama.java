package com.nology.zoology.animal;

public class Llama extends Animal {
    String furColour;

    public void setFurColour(String furColour) {
        this.furColour = furColour;
    }

    public String getFurColour() {
        return furColour;
    }

    public Llama(int id, String name, int age, String furColour) {
        super(id, name, age);
        this.furColour = furColour;
    }

    @Override
    public void makeSound() {
        System.out.format("I am a llama and my fur colour is %s",this.getFurColour());
    }
}
