import java.util.*;

public class IsUnique{

  public static boolean isUnique(Map<String,String> m1){
    List<String> newList = new LinkedList<>();
    for (String key : m1.keySet()) {
      if (newList.contains(m1.get(key)))
        return false;
      newList.add(m1.get(key));
    }
    return true;
  }
}
