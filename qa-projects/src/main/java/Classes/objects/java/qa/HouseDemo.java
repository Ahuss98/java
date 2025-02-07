package Classes.objects.java.qa;

public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3,8,"blue");
        printHouseData(myHouse);
        printHouseData(yourHouse);

        //constructors are a special type of method which is created by calling the class is no cinstructor is created in class we have a default constuctor which is a constructor wth no arguments prvided by the compiler

        //because these are instance methods they only apply to the specific instance of this object
        //this shows that my fields and methods on the class are encapsulated (self contianed entities)

        //setters are called mutators
//        myHouse.setNumStories(2);
//        myHouse.setNumWindows(6);
//        myHouse.setColour("red");

//        yourHouse.setNumStories(3);
//        yourHouse.setNumWindows(10);
//        yourHouse.setColour("blue");


        //and getters are called accessors or observors
//        System.out.println("my House is " + myHouse.getColour() + "and has " + myHouse.getNumStories() +  " stories and " + myHouse.getNumWindows() + " windows");
//        System.out.println("you House is " + yourHouse.getColour() + "and has "  + yourHouse.getNumStories() +  " stories and " + yourHouse.getNumWindows() + " windows");
    }
        //has to be static so we can call from the main method which is also static
        public static void printHouseData (House house){
            System.out.println("house color: " + house.getColour() + " stories: " + house.getNumStories() + " windows: " + house.getNumWindows());
        }
}//end
