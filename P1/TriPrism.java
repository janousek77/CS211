public class TriPrism extends RecPrism implements Shape{
  double s3;

  public TriPrism(double a, double b, double c ,double h){  //Constructs TriPrism; same dimensions as a RectPrism except side c.
  super(a,b,h);
  s3 = c;
  }

  public double getVolume(){                                //Returns volume of TriPrism; half of a RectPrism's volume.
    return super.getVolume()/2;
  }

  public double getSurfaceArea(){                           //Returns surface area of TriPrism; 2*Base+Height*(a+b+c).
    return (width*length)+height*(length+width+s3);
  }

  public double getSideThree(){                             //Returns the third side of the triangle.
    return s3;
  }

  public String toString(){                                 //toString method for easier identification of field values.
    return "Side a = " + length + ", Side b = " + width + ", Side c = " + s3 + ", Height = " + height;
  }
}
