public class Main  {
    public static void main(String[] args){
      Circles a = new Circles(1, 2, 5);
      Cylinder b = new Cylinder(2, 1, 3, 6);
      System.out.println("the area of " + a.getName() + " is " + a.calArea() +" ;");
      System.out.println("the area of " + b.getName() + " is " + b.calArea() + " and the vol is " + b.calVolume());
    }
}
