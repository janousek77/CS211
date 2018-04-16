public class Rectangle implements Shape {
  private double width, height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return width * height;
  }

  public double getPerimeter() {
    return 2.0 * (width + height);
  }

  public boolean equals(Rectangle r){
    return (r.width == width && r.height == height)
            || (r.width == height && r.height == width);
  }

  public String toString(){
    return "width = "+width+", height = "+height;
  }
}
