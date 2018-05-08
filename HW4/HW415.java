public class HW415{
  public static int permut(int n, int r){
    if(n>n-r)
      return n*permut(n-1,r-1);
    else
      return 1;
  }
}
