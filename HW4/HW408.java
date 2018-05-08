public class HW408{
  public static int multiplyEvens(int n){
    if(n <= 0)
      throw new IllegalArgumentException();
    else if(n == 1)
      return 2;
    else
      return n*2 * multiplyEvens(n-1);
  }
}
