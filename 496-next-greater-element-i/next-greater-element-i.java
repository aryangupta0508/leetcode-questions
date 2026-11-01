class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        // Find Next Greater Element for nums2
        for (int i = 0; i < nums2.length; i++) {

            while (!st.isEmpty() && st.peek() < nums2[i]) {

                map.put(st.pop(), nums2[i]);
            }

            st.push(nums2[i]);
        }

        // Remaining elements have no greater element
        while (!st.isEmpty()) {
            map.put(st.pop(), -1);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
        
    }
}