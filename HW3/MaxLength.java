import java.util.*;

public class MaxLength{

  public static int maxLength(List<String> l1){
    int longest = 0;
    for (String e : l1) {
      if(e.length()>longest)
        longest = e.length();
    }
    return longest;
  }
}
