public class Cylinder extends Circles {
    private double height;
    public Cylinder(double height, double x, double y, double radius){
        super(x,y,radius);
        this.height = height;
    }
    public String getName(){
        return "Cylinder";
    }
    public double calArea(){
        return 2 * radius * height * 3.14 + 2 * 3.14* radius *radius;
    }
    public double calVolume(){
        return radius * radius * 3.14 * height;
    }
}
