import java.util.*;

public class RemoveEvenLength{

  public static void removeEvenLength(ArrayList<String> list){
    ArrayList<String> temp = new ArrayList<>();
    for (String s : list) {
      if(s.length()%2 != 0)
        temp.add(s);
    }
    list.clear();
    list.addAll(temp);
  }
}
