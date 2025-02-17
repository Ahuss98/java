package io.nology.farmyard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FarmYardChallenge {

    private FarmYard farmYard;
    private final List<Animal> animals;

    public FarmYardChallenge() {
        this.farmYard = new FarmYard();
        animals = farmYard.getAnimals();
    }

    /**
     * Get the total number of animals in the farm yard
     * @return the total number of animals in the farm yard
     */
    public int getAnimalCount() {
        return animals.size();
    }

    /**
     * The total number of cows in the farm yard.
     *
     * @return
     */
    public int getCowCount() {
        return (int) this.animals.stream().filter(animal -> animal.getType() == AnimalType.cow).count();
    }

    /**
     * Get total number of animals for the given type.
     * @param type
     * @return
     */
    public int getAnimalCountForType(AnimalType type) {
        return (int) this.animals.stream().filter(animal -> animal.getType() == type).count();
    }

    /**
     * Get total number of animals whose name begins with the given prefix
     * @param prefix
     * @return
     */
    public int getAnimalsWithNameBeginningWith(String prefix) {
        return (int) animals.stream().filter(a -> a.getName().startsWith(prefix.toLowerCase())).count();
    }

    /**
     * Get the youngest animal, based on age. If more than one is the youngest then just return the first
     * @return
     */
    public Animal getYoungestAnimal() {
        return animals.stream().sorted((a,b) -> a.getAge() - b.getAge()).findFirst().orElse(null);
    }

    /**
     * Get the oldest animal. If more than one is the eldest then just return the first
     * @return
     */
    public Animal getOldestAnimal() {
        return this.animals.stream().min((a, b) -> b.getAge() - a.getAge()).orElse(null);
    }

    /**
     * Get the oldest animals, in a List.
     * You will have to do this in two stages, using streams for both!
     * @return
     */
    public List<Animal> getOldestAnimals() {
     int eldestAge = this.getOldestAnimal().getAge();
        return this.animals.stream()
                .filter( animal -> animal.getAge() == eldestAge )
                .toList();
    }

    /**
     * Get a list of all animals of the given type.
     * Order the results by name.
     * @param type
     * @return
     */
    public List<Animal> getAnimalsForType(AnimalType type) {
        return null;
    }

    public Map<AnimalType, Long> getCountsOfAnimalsByType() {
        return null;
    }

    public Map<AnimalType, List<Animal>> getMapOfAnimalsByType() {
        return null;
    }

}
