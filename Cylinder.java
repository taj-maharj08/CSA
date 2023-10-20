public class Cylinder{
    private Circle base;
    private double height;

    public Cylinder(double rad, double height){
        base = new Circle(rad);
        this.height = height;
    }

    public double vol(){
        double v = base.area()*height;
        return v;
    }

    public double sa(){
        return (base.circumference()*height)+(base.area()*2);
    }
}
