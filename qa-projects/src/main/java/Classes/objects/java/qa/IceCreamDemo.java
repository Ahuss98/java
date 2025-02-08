package Classes.objects.java.qa;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIcecream = new IceCream("ahmed",4,2);
        myIcecream.printTopping();
        myIcecream.addToppings("sprinkles");
        myIcecream.addToppings("choclate");
        myIcecream.printTopping();
        System.out.println(myIcecream.getCost());
        System.out.println(myIcecream.getName());
        System.out.println(myIcecream.getNumOfScoops());
    }
}
