package methods.in.java;

public class CountDown {
    public static void main(String[] args) {
        //countDownFrom(10);
        countUpTo(1,4);
    }

    public static void countDownFrom(int num){
        //the recursive case
        if(num >= 0){
            System.out.println(num);
            //the base case ()once below 0 the if statement is no longer true
            countDownFrom(num -1);
        }
    }

    public static void countUpTo(int start, int end){
        if(start <= end){
            System.out.println(start);
            countUpTo(start+1,end);
        }
    }
}
