class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count = new int[51];
        int n = nums.length;

        for (int i = 0; i <= n - k; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            for (int x : set) {
                count[x]++;
            }
        }

        int ans = -1;

        for (int i = 0; i <= 50; i++) {
            if (count[i] == 1) {
                ans = i;
            }
        }

        return ans;
    }
}