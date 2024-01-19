public class Circles extends Points {
    public double radius;
    public String getName(){
        return "Circles";
    }
    public  Circles(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    public double calArea(){
        return radius * radius * 3.14;
    } 
    public double calVolume(){
        return 0.0;
    }
}
