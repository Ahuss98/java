package Classes.objects.java.qa;

public class CircleDemo {
    public static void main(String[] args){
        Circle myCircle = new Circle(4);
        System.out.println(myCircle.getRadius());
        //using string format to only show 2 decimal indicated by the %.2f in string format
        System.out.println("circumfrence " + String.format("%.2f", myCircle.circumference()));
        System.out.println("area "+ String.format("%.2f", myCircle.area()));
//        System.out.println(myCircle.area());
    }
}
