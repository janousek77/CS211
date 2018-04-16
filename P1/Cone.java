public class Cone extends Cylinder implements Shape{

  public Cone(double r, double h){            // Cone constructor
    super(r,h);
  }

  public double getArea(){                    // Returns the area of the Cone
    return Math.PI*radius*(radius+Math.sqrt(Math.pow(height,2)+Math.pow(radius,2)));
  }

  public double getVolume(){                  // Returns the volume of the Cone using the super() method and dividing by 3
    return super.getVolume()/3;
  }

  public String toString() {                  //toString method to easily identfy field values.
        return "Cone, has a radius of "+radius+", and a height of "+height+".";
    }
}
