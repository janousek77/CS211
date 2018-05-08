import java.util.*;

public class Test{
  public static void main(String[] args) {
    System.out.println();
    System.out.println("Average Vowels test");
    ArrayList<String> list1 = new ArrayList<>();    //ArrayList that will be populated
    ArrayList<String> list2 = new ArrayList<>();    //ArrayList that will be empty
    list1.add("alpha");
    list1.add("bravo");
    list1.add("charlie");
    list1.add("delta");
    list1.add("echo");
    list1.add("aaeeeiiiioooouuuu");
    System.out.print("First list: ");
    System.out.println(list1);
    System.out.print("Second list: ");
    System.out.println(list2);
    System.out.print("Average number of vowels first list: ");
    System.out.println(AverageVowels.averageVowels(list1));
    System.out.print("Average number of vowels second list: ");
    System.out.println(AverageVowels.averageVowels(list2));
    System.out.println();

    System.out.println("Remove Even Length tests");
    ArrayList<String> list3 = new ArrayList<>();
    list3.add("even");
    list3.add("odd");
    list3.add("four");
    list3.add("three");
    System.out.print("List before: ");
    System.out.println(list3);
    RemoveEvenLength.removeEvenLength(list3);
    System.out.print("List after: ");
    System.out.println(list3);
    System.out.println();

    System.out.println("Remove Duplicates Test");
    ArrayList<String> list4 = new ArrayList<>();
    list4.add("even");
    list4.add("even");
    list4.add("even");
    list4.add("odd");
    list4.add("odd");
    list4.add("four");
    list4.add("four");
    list4.add("three");
    System.out.print("List before: ");
    System.out.println(list4);
    RemoveDuplicates.removeDuplicates(list4);
    System.out.print("List after: ");
    System.out.println(list4);
    System.out.println();

    System.out.println("Filter Range tests");
    ArrayList<Integer> list5 = new ArrayList<>();
    list5.add(1);
    list5.add(10);
    list5.add(100);
    list5.add(25);
    list5.add(50);
    list5.add(75);
    list5.add(33);
    list5.add(66);
    System.out.println("List before: ");
    System.out.println(list5);
    FilterRange.filterRange(list5, 20, 80);
    System.out.println("List after filtering below 20 and above 80: ");
    System.out.println(list5);
    System.out.println();

    System.out.println("Point class tests ");
    Point a = new Point(4,5);
    Point b = new Point(3,4);
    Point c = new Point(4,6);
    System.out.println("Point a " + a);
    System.out.println("Point b " + b);
    System.out.println("Point c " + c);
    System.out.println("a compare to b: "+a.compareTo(b));
    System.out.println("a compare to c: "+a.compareTo(c));
    System.out.println("a compare to a: "+a.compareTo(a));
  }
}
