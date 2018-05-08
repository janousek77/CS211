public class HW404{
  public static int doubleDigits(int n) {
    if (n == 0) {
      return 0;
    } else {
      return 100 * doubleDigits(n / 10) + 11 * (n % 10);
    }
  }
}
