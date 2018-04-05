// Chris Janousek
// CS211 Assignment HW0 chapter 8 #18-22
// 2/7/2018

public class Test{
  public static void main(String[] args) {
    Point one = new Point(7,7);
    Rectangle two = new Rectangle(0,1,6,5);
    Rectangle three = new Rectangle(new Point(4,4),3,4);
    Rectangle four = new Rectangle(new Point(0,1),6,2);
    Rectangle five = new Rectangle(new Point(3,0),3,4);
    Rectangle six = new Rectangle(new Point(0,0),2,2);
    Rectangle seven = new Rectangle(new Point(0,3),2,2);
    // System.out.println("First rectangle's x coordinate: "+two.getX());
    // System.out.println("First rectangle's y coordinate: "+two.getY());
    // System.out.println("First rectangle's width: "+two.getWidth());
    // System.out.println("First rectangle's height: "+two.getHeight());
    // System.out.println("Does the rectangle contain point (7,7): "+two.contains(one));
    // System.out.println();
    // System.out.println("First rectangle's x coordinate: "+three.getX());
    // System.out.println("First rectangle's y coordinate: "+three.getY());
    // System.out.println("First rectangle's width: "+three.getWidth());
    // System.out.println("First rectangle's height: "+three.getHeight());
    // System.out.println("Does the rectangle contain point (7,7): "+three.contains(one));
    // System.out.println();
    // System.out.println("Union of both rectangles "+three.union(two));
    System.out.println("Intersection of both rectangles "+two.intersection(three));
    System.out.println("Intersection of two rectangles where edges only cross "+four.intersection(five));
    System.out.println("Where two rectangles don't intersect "+six.intersection(seven));
  }
}
