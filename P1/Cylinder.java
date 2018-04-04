public class Cylinder implements Shape{
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

  public double getArea(){
    return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
  }

  public double getVolume(){
    return Math.PI*radius*radius*height;
  }
}
