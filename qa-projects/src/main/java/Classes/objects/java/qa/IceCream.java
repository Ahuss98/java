package Classes.objects.java.qa;

import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numOfScoops;
    private ArrayList<String> toppings;

    public IceCream(String name, int cost, int numOfScoops){
        this.name = name;
        this.cost = cost;
        this.numOfScoops = numOfScoops;
        this.toppings = new ArrayList<>();
    }
    public void addToppings(String topping){
        toppings.add(topping);
    }
    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }
    public int getNumOfScoops() {
        return numOfScoops;
    }
    public void printTopping(){
        for (String topping : toppings) {
            System.out.println(topping);
        }
    }
}
