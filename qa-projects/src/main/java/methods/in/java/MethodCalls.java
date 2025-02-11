package methods.in.java;



public class MethodCalls {
    public static void main(String[] args) {
        doSomething();//user defined method
    }

    public static void doSomething(){
        System.out.println("in do something");

        int result = getSomeValue();

        System.out.println("result: " + result);
    }

    public static int getSomeValue(){
        return 150;
    }
}
