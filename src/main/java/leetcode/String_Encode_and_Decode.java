package practice;

import java.util.List;

public class JavaStream {

  public String encode(List<String> strs) {
    StringBuilder encodedString = new StringBuilder();
    strs.stream().map( s ->encodedString.append("#").append(s));
    return encodedString.toString();
  }


  public static void main(String[] args) {
    
  }
}
