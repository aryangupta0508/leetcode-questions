class Solution {
    public int lengthOfLastWord(String s) {
        s=s.strip();
        
        int n=s.length();
        if(n==1){
            return 1;
        }
        int count=0;
        int i=n-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
          i--;  
        }
        
        return count;



    }
}