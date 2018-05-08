public class HW402{
  public static void writeNums(int n){
    if(n <= 0)
      throw new IllegalArgumentException();
    else if(n == 1) {
      System.out.print(n);
      return;
    }
    writeNums(n - 1);
    System.out.print(", " + n);
  }
}
