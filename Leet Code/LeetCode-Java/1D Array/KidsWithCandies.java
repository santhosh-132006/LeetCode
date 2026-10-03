class Solution {
    public java.util.List<Boolean> kidsWithCandies(
            int[] candies, int extraCandies) {

        int max = 0;

        for (int n : candies)
            max = Math.max(max, n);

        java.util.List<Boolean> ans = new java.util.ArrayList<>();

        for (int n : candies)
            ans.add(n + extraCandies >= max);

        return ans;
    }
}