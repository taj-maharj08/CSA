public class Circle{

    private double radius;

    //Constructor
    public Circle(double rad){
        radius = rad;
    }

    public double area(){
        return Math.PI*(radius*2);
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }
}