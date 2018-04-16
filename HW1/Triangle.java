public class Triangle implements Shape {
  private double a, b, c;

  public Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getArea() {
    double s = (a + b + c) / 2.0;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  public double getPerimeter() {
    return a + b + c;
  }

  public String toString(){
    return "a = "+a+", b = "+b+", c = "+c;
  }

  public boolean equals(Triangle t){
    return (t.a == a && t.b == b && t.c == c)
            || (t.a == b && t.b == c && t.c == a)
            || (t.a == c && t.b == a && t.c == b);
  }
}
