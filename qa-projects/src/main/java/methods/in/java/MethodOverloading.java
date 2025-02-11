package methods.in.java;

public class MethodOverloading {
    public static void main(String[] args) {

        //the signature is the number of , order and type of the parameters
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5,4);
        System.out.println(result);

        result = getResult(5,4,2);
        System.out.println(result);

        String newResult = getResult("hello", "world");
        System.out.println(newResult);
    }
    public static int getResult(int num){
        return num * 2;
    }
    public static int getResult(int num1,int num2){
        return num1 * num2;
    }
    public static int getResult(int num1, int num2,int num3){
        return num1 * num2 * num3;
    }
    public static String getResult(String s1, String s2){
        return s1 + " " + s2;
    }
}
