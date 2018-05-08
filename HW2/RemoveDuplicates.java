import java.util.*;

public class RemoveDuplicates{
  public static void removeDuplicates(ArrayList<String> list){
    ArrayList<String> temp = new ArrayList<>();
    for (String s : list) {
      if(!temp.contains(s))
        temp.add(s);
    }
    list.clear();
    list.addAll(temp);
  }
}
