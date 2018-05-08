import java.util.*;

public class CountUnique{

  public static int countUnique(List<Integer> l1){
    List<Integer> newList = new LinkedList<>();
    for (Integer e : l1) {
      if(!newList.contains(e))
        newList.add(e);
    }
    return newList.size();
  }
}
