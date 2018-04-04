public class Sphere implements Shape{
  double radius;

  public Sphere(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return radius;
  }

  public double getArea(){
    return 4*Math.PI*radius*radius;
  }

  public double getVolume(){
    return 4*Math.PI*radius*radius*radius/3;
  }
}
