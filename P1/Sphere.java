public class Sphere implements Shape{
  double radius;

  public Sphere(double r){           //Constructs the Sphere with radius r.
    radius = r;
  }

  public double getRadius(){         //Returns the radius of the Sphere.
    return radius;
  }

  public double getArea(){           //Returns Surface Area of sphere 4*π*(radius)^2.
    return 4*Math.PI*Math.pow(radius,2);
  }

  public double getVolume(){         //Returns volume of sphere (4*π*(radius)^3)/3.
    return 4*Math.PI*Math.pow(radius,3)/3;
  }
}
