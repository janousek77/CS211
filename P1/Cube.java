public class Cube implements Shape{
  double sideLength;

  public Cube(double sideLength){
    this.sideLength = sideLength;
  }

  public double getSideLength(){
    return sideLength;
  }

  public double getArea(){
    return sideLength*sideLength*sideLength;
  }

  public double getVolume(){
    return 6*sideLength*sideLength;
  }
}
