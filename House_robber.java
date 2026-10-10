//https://leetcode.com/problems/house-robber/submissions/2168487415/

class Solution {
    public int rob(int[] nums) {
        int prev2 = 0, prev1 = 0;

        for (int money : nums) {
            int current = Math.max(prev1, prev2 + money);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
