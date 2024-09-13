package leetcode;

import java.util.Arrays;

public class Sort_Array_By_Increasing_Frequency {

  class Solution {

    public int[] frequencySort(int[] nums) {
      int[] count = new int[201]; // 문제 재한사항이 -+1100
      for (int num : nums) {
        count[num + 100]++; // 음수 0~100 양수 101~201
      }


      return Arrays.stream(nums)
          .boxed()
          .sorted((a, b) -> {
            if (count[a + 100] == count[b + 100]) {
              return b - a;
            }
            return count[a + 100] - count[b + 100];
          })
          .mapToInt(Integer::intValue)
          .toArray();
    }
  }

}
