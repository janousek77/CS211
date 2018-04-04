public class Test{
  public static void main(String[] args) {
    Sphere one = new Sphere(5);
    System.out.println("Sphere radius: " + one.getRadius());
    System.out.println("Sphere surface area: " + one.getArea());
    System.out.println("Sphere volume: " + one.getVolume());
    Cube two = new Cube(5);
    System.out.println("Cube side length: " + two.getSideLength());
    System.out.println("Cube surface area: " + two.getArea());
    System.out.println("Cube volume: " + two.getVolume());
    Cylinder three = new Cylinder(3, 5);
    System.out.println("Cylinder radius: " + three.getRadius());
    System.out.println("Cylinder height: " + three.getHeight());
    System.out.println("Cylinder surface area: " + three.getArea());
    System.out.println("Cylinder volume: " + three.getVolume());
  }
}
