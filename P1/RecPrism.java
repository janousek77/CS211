public class RecPrism extends Cube implements Shape{
	double width, height;

	public RecPrism(double l, double w, double h){ 	//Constructs new RectPrism with length, width and height.
  	super(l);
  	width = w;
  	height = h;
	}

  public double getWidth(){												//Returns the width.
    return width;
  }

  public double getHeight(){											//Returns the height.
    return height;
  }

	public double getArea(){												//Returns Surface Area 2*l*w + 2*l*h + 2*h*w.
		return (2*(length*width)) + (2*(length*height)) + (2*(height*width));
	}

	public double getVolume(){ 											//Returns Volume l*w*h.
		return length*width*height;
	}

	public String toString(){												//toString method to easily identfy field values.
    return "Length = " + length  + ", Width = " + width + ", Height = " + height;
  }
}
