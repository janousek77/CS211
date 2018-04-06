public class Cylinder{
  double radius, height;

  public Cylinder(double radius, double height){
    this.radius = radius;
    this.height = height;
  }

  public double getRadius(){
    return radius;
  }

  public double getHeight(){
    return height;
  }

  // A=2πrh+2πr2
  public double getArea(){
    return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
  }

  // V=πr2h
  public double getVolume(){
    return Math.PI*radius*radius*height;
  }
}
