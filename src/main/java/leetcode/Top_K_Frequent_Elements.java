package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements {
  class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer, Integer> map = new HashMap<>();
      for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
      }

      PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
          (a,b) -> Integer.compare(b.getValue(), a.getValue())
      );

      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        pq.offer(entry);
      }

      int[] result = new int[k];
      for (int i = 0; i < k; i++) {
        result[i] = pq.poll().getKey();
      }
      return result;
    }
  }

  public static void main(String[] args) {
    Solution solution = new Top_K_Frequent_Elements().new Solution();
    System.out.println(Arrays.toString(solution.topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2)));
  }
}
