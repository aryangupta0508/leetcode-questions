class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // compare both arrays
        Arrays.equals(arr1, arr2);
           
            
          
              return Arrays.equals(arr1, arr2);
}
}