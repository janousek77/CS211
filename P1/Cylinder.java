public class Cylinder implements Shape{
  double radius, height;

  public Cylinder(double r, double h){           // Cylinder constructor
    radius=r;
    height=h;
  }

  public double getRadius(){                      // returns the radius
    return radius;
  }

  public double getHeight(){                      // return the height
    return height;
  }

  public double getArea(){                        // returns the area A=2πrh+2πr2
    return 2*Math.PI*radius*height+2*Math.PI*Math.pow(radius,2);
  }

  public double getVolume(){                      // returns the volume V=πr2h.
    return Math.PI*Math.pow(radius,2)*height;
  }

  public String toString(){	                      //toString method to easily identfy field values.
    return "Cylinder, has a radius of "+radius+", and a height of "+height+".";
    }
}
