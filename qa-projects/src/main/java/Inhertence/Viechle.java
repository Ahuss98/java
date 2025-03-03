package Inhertence;

public class Viechle {
    protected String model;
    private String type;
    String colour;
    public int maxSpeed;

    public void print(){

        System.out.println("Type : " + type);
        System.out.println("model : " + model);
        System.out.println("Colour : " + colour);
        System.out.println("maxSpeed : " + maxSpeed);

    }
}
