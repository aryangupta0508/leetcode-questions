class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLen = 0;

        HashSet<Character> hm = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            while (hm.contains(s.charAt(right))) {

                hm.remove(s.charAt(left));
                left++;
            }

            hm.add(s.charAt(right));

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}