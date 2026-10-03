class Solution {
    public java.util.List<Integer> findDisappearedNumbers(int[] nums) {
        java.util.List<Integer> ans = new java.util.ArrayList<>();

        for (int n : nums) {
            int index = Math.abs(n) - 1;

            if (nums[index] > 0)
                nums[index] = -nums[index];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                ans.add(i + 1);
        }

        return ans;
    }
}