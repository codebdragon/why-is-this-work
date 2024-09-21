package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_Encode_and_Decode {

  public String encode(List<String> strs) {
    StringBuilder encodedString = new StringBuilder();
    for (String str : strs) {
      encodedString.append(str.length()).append("#").append(str);
    }
    return encodedString.toString();
  }

  public List<String> decode(String str) {
    List<String> list = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
      int j = i;
      while (str.charAt(j) != '#') j++;

      int length = Integer.valueOf(str.substring(i, j));
      i = j + 1 + length;
      list.add(str.substring(j + 1, i));
    }
    return list;
  }


  public static void main(String[] args) {
    String_Encode_and_Decode stringEncodeAndDecode = new String_Encode_and_Decode();

    List<String> strs = new ArrayList<>(Arrays.asList("neet", "code", "love", "you"));
    String encode = stringEncodeAndDecode.encode(strs);
    System.out.println(encode);
    System.out.println(stringEncodeAndDecode.decode(encode));


    List<String> strs1 = new ArrayList<>(Arrays.asList(""));
    String encode1 = stringEncodeAndDecode.encode(strs1);
    System.out.println(encode1);
    System.out.println(stringEncodeAndDecode.decode(encode1));


    List<String> strs2 = new ArrayList<>();
    String encode2 = stringEncodeAndDecode.encode(strs2);
    System.out.println(encode2);
    System.out.println(stringEncodeAndDecode.decode(encode2));
  }
}
