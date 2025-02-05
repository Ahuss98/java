package com.nology.zoology.animal;

public class Zoo {

    Tiger[] tigers;

    public Zoo(){
    tigers = new Tiger[10];
    }

    //method
    public void addTigers(){
    for(int i = 0; i < tigers.length; i++){
        tigers[i] = new Tiger("Tiger" + i);
    }
    }
    public int getAnimalCount(){
        return tigers.length;
        }
}
