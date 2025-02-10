import java.util.ArrayList;
import java.util.List;

public class Farm {
    public ArrayList<Animal> animals;

    Farm() {
        animals = new ArrayList<>();
//        Dog myDog = new Dog();
//        Cow myCow = new Cow();
//        Duck myDuck = new Duck();
        animals.add(new Dog());
        animals.add(new Cow());
        animals.add(new Duck());
    }

    public List<Animal> addMethods() {
        return animals;
    }

    public List<Animal> getAnimalThatMakeSound(){
        final ArrayList<Animal> soundArray = new ArrayList<>();
        for(Animal animal:animals){
            if(animal instanceof CanMakeSound){
                soundArray.add(animal);
            }
        }
        return soundArray;
    }

    public List<Animal> getAnimalsThatFly(){
        final ArrayList<Animal> flyArray = new ArrayList<>();
        for(Animal animal:animals){
            if(animal instanceof CanFly){
                flyArray.add(animal);
            }
        }
        return flyArray;
    }

    public List<Animal> getAnimalsThatFlyAndMakeSound(){
        final ArrayList<Animal> bothArray = new ArrayList<>();
        for(Animal animal:animals){
            if(animal instanceof CanFly && animal instanceof CanMakeSound){
                bothArray.add(animal);
            }
        }
        return bothArray;
    }
}
