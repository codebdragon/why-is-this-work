package leetcode;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

/**
 * 문제
 * - 정수 배열이 주어지면 자신을 제외한 모든 요소의 곱을 자신의 인덱스와 대체해서 리턴해야한다.
 * - 알고리듬은 O(n)의 시간 복잡도
 * - 나누기 연산 없이 문제 해결
 * 풀이
 * 1. 모든 수를 곱하고 자신으로 나누면 쉽게 풀이 되지만 나누기 연산은 사용하면 안됨
 * 2. 응용력이 부족한지 몰라도 솔루션이 쉽게 떠오르지 않았다.
 * 3. 솔루션
 * prefix 인덱스를 하나씩 밀어서 곱을 구하고
 * [1, 1, 1*2, 1*2*3]
 * suffix 인덱스를 하나씩 밀어서 곱을 구해서
 * [2*3*4, 2*3, 4, 1]
 * 이 두개의 배열을 곱하면 본인을 제외한 곱을 알수 있게 된다.
 */

public class Product_of_Array_Except_Self {

  class Solution {

    public int[] productExceptSelf(int[] nums) {
      int[] prefix = new int[nums.length];
      int[] suffix = new int[nums.length];
      int[] res = new int[nums.length];

      prefix[0] = 1;
      for (int i = 1; i < nums.length; i++) {
        prefix[i] = prefix[i - 1] * nums[i - 1];
      }

      suffix[nums.length - 1] = 1;
      for (int i = nums.length - 2; i >= 0; i--) {
        suffix[i] = suffix[i + 1] * nums[i + 1];
      }

      for (int i = 0; i < nums.length; i++) {
        res[i] = prefix[i] * suffix[i];
      }

      return res;
    }
  }

  public static void main(String[] args) {
    Solution solution = new Product_of_Array_Except_Self().new Solution();
    assertThat(solution.productExceptSelf(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{24, 12, 8, 6});
    assertThat(solution.productExceptSelf(new int[]{-1, 1, 0, -3, 3})).isEqualTo(new int[]{0, 0, 9, 0, 0});
  }
}


