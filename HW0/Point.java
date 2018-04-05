// Chris Janousek
// CS211 Assignment HW0 chapter 8 #18-22
// 2/7/2018

public class Point{
  int x, y;

  public Point(){
    this(0,0);
  }

  public Point(int x, int y){
    setLocation(x, y);
  }

  public void setLocation(int x, int y){
    this.x = x;
    this.y = y;
  }
}
