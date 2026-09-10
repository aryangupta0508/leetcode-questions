class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;  // s ka pointer
        int j = 0;  // t ka pointer

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
        
    }
}