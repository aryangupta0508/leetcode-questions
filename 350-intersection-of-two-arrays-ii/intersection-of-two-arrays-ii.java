class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<nums2.length; i++){
            list.add(nums2[i]);
        }
        for(int i = 0; i < nums1.length; i++){
             for (int j = 0; j < list.size(); j++) {

                if (nums1[i] == list.get(j)) {
                    result.add(nums1[i]);
                    list.remove(j);

                    break;
                }
            }
        }

          int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
        
    }
}