package methods.in.java;

public class MethodsDemo {
    public static void main(String[] args){
        printHello();
        printNumber(1);
        System.out.println(giveMe10());
        System.out.println(add2Numbs(2,3 ));//arguments when passed in
        System.out.println(returnSquare(3.0));
    }

    //void parameterless method
    public static void printHello(){
        System.out.println("Hello");
    }

    //void, parameterized
    public static void printNumber(int a){ // parameters when initialising them
        System.out.println("the number is " + a);
    }
    //value returning parameterless
    public static int giveMe10(){
        return 10;
    }

    //vlaue returning, parametereized
    public static int add2Numbs(int a, int b){
        return a + b;
    }

    //challenge
    public static double returnSquare(double num){
        return num * num;
    }
}
