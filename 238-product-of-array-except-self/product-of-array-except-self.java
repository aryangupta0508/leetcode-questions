class Solution {
    public int[] productExceptSelf(int[] nums) {
          int n = nums.length;
        int[] answer = new int[n];

        // Prefix product
        int left = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = left;
            left = left * nums[i];
        }

        // Suffix product
        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right = right * nums[i];
        }

        return answer;
        
    }
}