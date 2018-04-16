public class Test{
  public static void main(String[] args) {
    System.out.println("TimeSpan Tests");
    TimeSpan one = new TimeSpan(1, 20);
    TimeSpan two = new TimeSpan(4, 30);
    TimeSpan three = new TimeSpan(4, 30);
    System.out.println("First object: "+one.toString());
    System.out.println("Second object: "+two.toString());
    System.out.println("Third object: "+three.toString());
    System.out.println("Does first equal second: "+one.equals(two));
    System.out.println("Does third equal second: "+three.equals(two));
    System.out.println();

    System.out.println("Cash Tests");
    Cash c1 = new Cash(20);
    Cash c2 = new Cash(30);
    Cash c3 = new Cash(20);
    System.out.println("First amount: "+c1);
    System.out.println("Second amount: "+c2);
    System.out.println("Third amount: "+c3);
    System.out.println("Does first amount = second: "+c1.equals(c2));
    System.out.println("Does first amount = third: "+c3.equals(c1));
    System.out.println();

    System.out.println("Circle Tests");
    Circle circ1 = new Circle(2);
    Circle circ2 = new Circle(3);
    Circle circ3 = new Circle(2);
    System.out.println("First circle radius: "+circ1.getRadius());
    System.out.println("Second circle radius: "+circ2.getRadius());
    System.out.println("Third circle radius: "+circ3.getRadius());
    System.out.println("Does first circle = second: "+circ1.equals(circ2));
    System.out.println("Does first circle = third: "+circ3.equals(circ1));
    System.out.println();

    System.out.println("Triangle Tests");
    Triangle t1 = new Triangle(3,4,5);
    Triangle t2 = new Triangle(4,5,6);
    Triangle t3 = new Triangle(3,4,5);
    System.out.println("First triangle: "+t1);
    System.out.println("Second triangle: "+t2);
    System.out.println("Third triangle: "+t3);
    System.out.println("Does first triangle = second: "+t1.equals(t2));
    System.out.println("Does first triangle = third: "+t3.equals(t1));
    System.out.println();

    System.out.println("Rectangle Tests");
    Rectangle r1 = new Rectangle(5, 8);
    Rectangle r2 = new Rectangle(2, 3);
    Rectangle r3 = new Rectangle(5, 8);
    System.out.println("First rectangle: "+r1);
    System.out.println("Second rectangle: "+r2);
    System.out.println("Third rectangle: "+r3);
    System.out.println("Does first rectangle = second: "+r1.equals(r2));
    System.out.println("Does first rectangle = third: "+r3.equals(r1));
    System.out.println();

    System.out.println("Octagon Tests");
    Octagon o1 = new Octagon(5);
    System.out.println("Octagons "+o1);
    System.out.println("Octagons area: "+o1.getArea());
    System.out.println("Octagons perimeter: "+o1.getPerimeter());
    System.out.println();
    
    System.out.println("Hexagon Tests");
    Hexagon h1 = new Hexagon(5);
    System.out.println("Hexagons side length: "+h1.getSide());
    System.out.println("Hexagons area: "+h1.getArea());
    System.out.println("Hexagons perimeter: "+h1.getPerimeter());

  }
}
