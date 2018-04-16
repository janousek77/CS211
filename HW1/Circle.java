public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }

  public double getPerimeter() {
    return 2.0 * Math.PI * radius;
  }

  public boolean equals(Circle c){
    return c.radius == radius;
  }
}
