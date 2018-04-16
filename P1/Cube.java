public class Cube implements Shape{
  double length;

  public Cube(double l){        //Constructs cube with length 'l' since all dimensions are the same for cubes.
    length = l;
  }

   public double getLength(){   //Returns the length of the cube's sides.
    return length;
  }

  public double getArea(){      //Gets surface area finds area of one side (l^2) and multiply by 6 sides.
    return Math.pow(length,3);
  }

  public double getVolume(){    //Gets volume of cube length^3.
    return Math.pow(length,2)*6;
  }
}
