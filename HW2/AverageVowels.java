import java.util.*;

public class AverageVowels{

  public static double averageVowels(ArrayList<String> list){
    double total = 0;
    if(list.size()>0){
      for (String s : list) {
        for (int i = 0; i<s.length(); i++) {
          if(s.charAt(i) == 'a'
          || s.charAt(i) == 'e'
          || s.charAt(i) == 'i'
          || s.charAt(i) == 'o'
          || s.charAt(i) == 'u')
            total++;
        }
      }
      return total/list.size();
    } else {
      return total;
    }
  }
}
