import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        Arrays.sort(nums);

        findpermutations(nums, res, current, used);
        return res;
    }

    private void findpermutations(int[] nums,
                                  List<List<Integer>> res,
                                  List<Integer> current,
                                  boolean[] used) {

        if (current.size() == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        int i = 0;

        while (i < nums.length) {
            if (!used[i]) {

                // Skip duplicate values at the same recursion level
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    i++;
                    continue;
                }

                current.add(nums[i]);
                used[i] = true;

                findpermutations(nums, res, current, used);

                current.remove(current.size() - 1);
                used[i] = false;
            }

            i++;
        }
    }
}
