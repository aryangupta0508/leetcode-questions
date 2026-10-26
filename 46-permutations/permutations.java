import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

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
