package practice;

public class Map {

  /**
   *  lowercase English letters.
   */
  private static boolean ransomNote(String ransomNote, String magazine) {
    // 소문자라는 전제로 int 배열을 비교 공간으로 활용
    int[] al = new int[26];

    for (char c : magazine.toCharArray()) {
      al[c -'a']++;
    }

    for (char c : ransomNote.toCharArray()) {
      if(al[c -'a'] == 0) return false;
      al[c -'a']--;
    }

    return true;
  }

  /**
   * any valid ascii character
   */
  private static boolean isomorphicString(String s, String t) {
    int[] m1 = new int[256];
    int[] m2 = new int[256];
    int n = s.length();
    for (int i = 0; i < n; ++i) {
      if (m1[s.charAt(i)] != m2[t.charAt(i)])  {
        return false;
      }
      m1[s.charAt(i)] = i + 1;
      m2[t.charAt(i)] = i + 1;
    }
    return true;
  }
}
