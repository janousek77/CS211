import java.util.*;

public class Alternate{

  public static List<Integer> alternate(List<Integer> l1, List<Integer> l2){
    List<Integer> newList = new LinkedList<>();
    Iterator<Integer> itr1 = l1.iterator();
    Iterator<Integer> itr2 = l2.iterator();

    while (itr1.hasNext() || itr2.hasNext()) {
      if (itr1.hasNext())
        newList.add(itr1.next());
      if (itr2.hasNext())
        newList.add(itr2.next());
    }
    return newList;
  }
}
