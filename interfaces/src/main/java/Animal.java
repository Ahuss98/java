public abstract class Animal {

    private String name;
    private int legs;

    public abstract AnimalType getType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }


//    Create a class called Farm
//    add a List of type Animal
//    on creation of Farm object it should create a number of different Animal objects and add to them List of animals.
//    add a method called getAnimals(), which should return a list of all the animals
//    add a method called getAnimalsThatMakeSound(), which should return a list of only those animals that make a sound. Hint: the instance of the list should be CanMakeSound
//    add a method called getAnimalsThatFly(), which should return a list of only those animals that can fly. Hint: the type of list should be CanFly.
//            Extension
//    add a method called getAnimalsThatFlyAndMakeSound(), which should return a list of only those animals that can fly and make a sound. What could the return type be here?
}
