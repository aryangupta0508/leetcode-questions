class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

         // Mark every number that exists
        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;

            nums[index] = -Math.abs(nums[index]);
        }

        // Positive index means that number is missing
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;

        
    }
}