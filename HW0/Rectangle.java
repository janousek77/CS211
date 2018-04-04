// Chris Janousek
// CS211 Assignment HW0 chapter 8 #18-22
// 2/7/2018


public class Rectangle{
  // public static void main(String[] args) {
  //
  // }

  int x, y, width, height;

  public Rectangle(int x, int y, int width, int height){
    if(width < 0 || height < 0){
      throw IllegalArgumentException();
    }

    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public int getHeight(){
    return height;
  }

  public int getWidth(){
    return width;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public String toString(){
    return "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
  }

  public Rectangle(Point p, int width, int height){
    this.x = p.x;
    this.y = p.y;
    this.width = width;
    this.height = height;
  }

  public boolean contains(int x, int y){
    return this.x == x && this.y == y;
  }

  public boolean contains(Point p){
    return contains(p.x, p.y);
  }

  public Rectangle union(Rectangle rect){

  }

  public Rectangle intersection(Rectangle rect){

  }

}
