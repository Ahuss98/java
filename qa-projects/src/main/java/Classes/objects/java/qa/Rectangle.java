package Classes.objects.java.qa;

public class Rectangle {
    private double length;
    private double width;

    private static int numRectangles;

    public Rectangle(){
        this(1., 1.0); //using the this keyword calls the class constructor as "this pints to the class (Rectangle)"
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        numRectangles++;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return length*width;
    } // we do this to avoid having stale data if it was a parameter instead

    public static int getNumRectangles(){
        return numRectangles;
    }
    public double perimiter(){
        return 2 * (length + width);
    }

}
