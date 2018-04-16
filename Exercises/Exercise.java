import java.util.*;
import java.io.*;
public class Exercise{
  public static void main(String[] args) throws FileNotFoundException   {
    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner input = new Scanner(new File("numbers.txt"));
    while (input.hasNextInt()) {
        int n = input.nextInt();
        list.add(n);
    }
    System.out.println(list);
    System.out.println("Array average: "+average(list));
    System.out.println();
    System.out.println(highLow(list));
    System.out.println();
    filterEvens(list);
    System.out.println("Array - evens: "+list);
  }

  public static double average(ArrayList<Integer> list){
    int total = 0;
    for (int num : list) {
      total+=num;
    }
    return total/list.size();
  }

  public static String highLow(ArrayList<Integer> list){
    int high = list.get(0);
    int low = high;
    for (int i = 1; i<list.size(); i++) {
      if(list.get(i)>high)
        high = list.get(i);
      if(list.get(i)< low)
        low = list.get(i);
    }
    return "Highest number: " + high + ", Lowest number: " + low;
  }

  public static void filterEvens(ArrayList<Integer> list) {
    for (int i = list.size() - 1; i >= 0; i--) {
        if (list.get(i) % 2 == 0)
          list.remove(i);
    }
  }
}
