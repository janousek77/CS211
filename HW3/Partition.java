import java.util.*;

public class Partition{

  public static List<Integer> partition(List<Integer> l1, int E){
    List<Integer> newList = new LinkedList<>();
    for (Integer x: l1) {
      if(x.compareTo(E)<0)
        newList.add(x);
    }
    for (Integer x: l1) {
      if(x.compareTo(E)>=0)
        newList.add(x);
    }
    return newList;
  }
}
