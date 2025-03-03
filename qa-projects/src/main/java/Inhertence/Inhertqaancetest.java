package Inhertence;

public class Inhertqaancetest {
    public static void main(String[] args) {
        car myCar = new car();
        myCar.isAutomatic = true;
        myCar.printGear();
        myCar.model = "Ferrari";
        myCar.colour = "red";
        myCar.maxSpeed = 300;
        myCar.print();


        Motercycle myMotercysle = new Motercycle();
        myMotercysle.model = "Honda";
        myMotercysle.colour = "blue";
        myMotercysle.maxSpeed = 300;

        myMotercysle.cyclindarVolume = "900 cc";

        myMotercysle.print();
        myMotercysle.printVolume();



    }
}
