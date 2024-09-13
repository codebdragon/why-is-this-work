package practice;

import java.util.List;

public class Tree {
  private class Solution {
    public String[] solution(int[] nodes) {
      String[] result = new String[3];
      result[0] = preorder(nodes, 0);
      return null;
    }

    private String preorder(int[] nodes, int idx) {
      if (idx >= nodes.length) return "";

      return null;
    }
  }

  public static void main(String[] args) {
    Solution solution = new Tree().new Solution();

    System.out.println(solution.solution(new int[] {1, 2, 3,4,5,6,7}));
  }

}
