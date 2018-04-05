// Chris Janousek
// CS211 Assignment HW0 chapter 8 #18-22
// 2/7/2018


public class Rectangle{
  private int x, y, width, height;

  public Rectangle(int x, int y, int width, int height){
    if(width < 0 || height < 0){
      throw new IllegalArgumentException();
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
    return (x<=this.x+width && x>=this.x && y<=this.y+height && y>=this.y);
  }

  public boolean contains(Point p){
    return contains(p.x, p.y);
  }

  public Rectangle union(Rectangle rect){
    int newX = Math.min(x, rect.x);
    int newY = Math.min(y, rect.y);
    int newWidth = Math.max(x + width, rect.x+rect.width)-newX;
    int newHeight = Math.max(y + height, rect.y+rect.height)-newY;
    return new Rectangle(newX, newY, newWidth, newHeight);
  }

  public Rectangle intersection(Rectangle rect){
    if(this.contains(rect.x, rect.y)
    || this.contains(rect.x, rect.y+rect.height)
    || this.contains(rect.x+rect.width, rect.y)
    || this.contains(rect.x+rect.width, rect.y+rect.height)
    || ((x+width>=rect.x && y+height>=rect.y)||(x+width<=rect.x && y+height<=rect.y))){
      int newX = Math.max(x, rect.x);
      int newY = Math.max(y, rect.y);
      int newWidth = Math.min(x + width - newX, rect.x+rect.width-newX);
      int newHeight = Math.min(y + height-newY, rect.y+rect.height-newY);
      return new Rectangle(newX, newY, newWidth, newHeight);
    } else {
      return new Rectangle(0,0,0,0);
    }
  }

}
