class Solution {
    public int firstUniqChar(String s) {

        char[] arr = s.toCharArray();
        int[] count = new int[26];
        
          for (int i = 0; i < arr.length; i++) {
            count[arr[i] - 'a']++;
        }

        // Find first character whose frequency is 1
        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;


       
        
    }
}