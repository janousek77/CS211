public class Octagon implements Shape{
  private double side;

  public Octagon(double side){
    this.side = side;
  }

  public double getArea(){
    return 2*(1+Math.sqrt(2))*Math.pow(side,2);
  }

  public double getPerimeter(){
    return 8*side;
  }

  public String toString(){
    return "side length: " +side;
  }
}
