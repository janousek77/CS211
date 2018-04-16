public class Test{
  public static void main(String[] args) {
    Sphere p1 = new Sphere(5);
    System.out.println("Sphere radius: " + p1.getRadius());
    System.out.println("Sphere surface area: " + p1.getArea());
    System.out.println("Sphere volume: " + p1.getVolume());
    System.out.println();

    Cube p2 = new Cube(5);
    System.out.println("Cube side length: " + p2.getLength());
    System.out.println("Cube surface area: " + p2.getArea());
    System.out.println("Cube volume: " + p2.getVolume());
    System.out.println();

    Cylinder p3 = new Cylinder(3, 5);
    System.out.println("Cylinder radius: " + p3.getRadius());
    System.out.println("Cylinder height: " + p3.getHeight());
    System.out.println("Cylinder dimensions: " + p3);
    System.out.println("Cylinder surface area: " + p3.getArea());
    System.out.println("Cylinder volume: " + p3.getVolume());
    System.out.println();

    Cone p4 = new Cone(5, 6);
    System.out.println("Cone radius: " + p4.getRadius());
    System.out.println("Cone height: " + p4.getHeight());
    System.out.println("Cone dimensions: " + p4);
    System.out.println("Cone surface area: " + p4.getArea());
    System.out.println("Cone volume: " + p4.getVolume());
    System.out.println();

    RecPrism p5 = new RecPrism(3,4,5);
    System.out.println("Rectangular prism length: " + p5.getLength());
    System.out.println("Rectangular prism width: " + p5.getWidth());
    System.out.println("Rectangular prism height: " + p5.getHeight());
    System.out.println("Rectangular prism dimensions: " + p5);
    System.out.println("Rectangular prism surface area: " + p5.getArea());
    System.out.println("Rectangular prism volume: " + p5.getVolume());
    System.out.println();

    TriPrism tri = new TriPrism(2,3,4,5);
  	System.out.println("Triangular Prism side c length: "+tri.getSideThree());
  	System.out.println("Triangular Prism dimensions: "+tri);
  	System.out.println("Volume of Triangular Prism: "+tri.getVolume());
  	System.out.println("Surface area of Triangular Prism: "+tri.getSurfaceArea());
  	System.out.println("Third side of Triangular Prism: "+tri.getSideThree());
  }
}
