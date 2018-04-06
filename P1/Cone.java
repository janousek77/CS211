public class Cone extends Cylinder{
  double radius, height;

  public Cone(double radius, double height){
    this.radius = radius;
    this.height = height;
  }

  // A=πr(r+h2+r2)
  public double getArea(){
    return Math.PI*radius*(radius+Math.sqrt(height*height+radius*radius));
  }

  // V=πr2h/3
  public double getVolume(){
    return Math.PI*radius*radius*height/3;
  }
}
