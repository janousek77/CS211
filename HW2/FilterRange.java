import java.util.*;

public class FilterRange{

  public static void filterRange(ArrayList<Integer> list, int min, int max){
    ArrayList<Integer> temp = new ArrayList<>();
    for (int n : list) {
      if(n<=max && n>=min)
        temp.add(n);
    }
    list.clear();
    list.addAll(temp);
  }
}
