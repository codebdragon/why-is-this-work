package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringSplitStream {

  public static void main(String[] args) {
    HashSet<String> set = new HashSet<>();
    String s = "jar";
    String t = "aaa";
    System.out.println(set);
    Arrays.stream(t.split("")).map(t1 -> set.remove(t1));
    System.out.println(set);
    System.out.println(set.size() == 0);

  }

}
