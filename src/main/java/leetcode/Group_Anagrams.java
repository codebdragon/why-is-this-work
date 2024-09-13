package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
      String[] strArr = str.split("");
      Arrays.sort(strArr);
      String sortStr =  String.join("",strArr);

      if (!map.containsKey(sortStr)) {
        map.put(sortStr, new ArrayList<>());
      }
      map.get(sortStr).add(str);
    }

    return new ArrayList<>(map.values());
  }

  public static void main(String[] args) {
    Group_Anagrams groupAnagrams = new Group_Anagrams();
    System.out.println(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));;
  }

}
