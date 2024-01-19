public class Points extends Shape  {
    private double x;
    private double y;
    public Points(double x, double y){
       this.x = x;
       this.y= y;
    }
    public String getName(){
        return "points";
    }
    public double calArea(){
        return 0.0 ;
    };
    public double calVolume(){
        return 0.0;
    }
}