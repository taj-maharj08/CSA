public class Cylinder{
    private double base;
    private double height;

    public Cylinder(double rad, double height){
        Circle cir = new Circle(rad);
        base = cir.area();
        this.height = height;
    }

    public double vol(){
        double v = base*height;
        return v;
    }

    public double sa(){
        return (cir.circumference()*height)+(base*2);
    }
}


/*·       Cylinder should have 2 attributes only, a base of type Circle and a height (double)
·       Constructor should take 2 args, radius and height(in that order) and initialize the attributes.  Don’t forget to use new to create the circle.
·       Methods that return the volume (vol) and surface area (sa) (both double).  These methods should not take arguments, but should use the class attributes to compute.
·       Use the CylinderTester class provided to test your classes.  Check your work with a calculator.
 */