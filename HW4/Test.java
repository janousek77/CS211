public class Test{
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Write nums test");
    System.out.print("Using 5: ");
    HW402.writeNums(5);
    System.out.println();
    System.out.print("Using 12: ");
    HW402.writeNums(12);
    System.out.println();

    System.out.println();
    System.out.println("Double digits test");
    System.out.print("Using 348: ");
    System.out.println(HW404.doubleDigits(348));
    System.out.print("Using -789: ");
    System.out.println(HW404.doubleDigits(-789));
    System.out.print("Using 0: ");
    System.out.println(HW404.doubleDigits(0));
    System.out.println();

    System.out.println("Write squares test");
    System.out.print("Using 8: ");
    HW406.writeSquares(8);
    System.out.println();
    System.out.println();

    System.out.println("Multiply evens test");
    System.out.print("Using 4: ");
    System.out.println(HW408.multiplyEvens(4));
    System.out.print("Using 1: ");
    System.out.println(HW408.multiplyEvens(1));
    System.out.println();

    System.out.println("Permut test");
    System.out.print("Using 7 and 4: ");
    System.out.println(HW415.permut(7,4));
    System.out.print("Using 6 and 3: ");
    System.out.println(HW415.permut(6,3));
  }
}
