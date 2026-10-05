class Solution {
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        int end = s.length() - 1;

        while (end >= 0) {

            
            while (end >= 0 && s.charAt(end) == ' ') {
                end--;
            }

            if (end < 0) {
                break;
            }

            int start = end;

            while (start >= 0 && s.charAt(start) != ' ') {
                start--;
            }

            if (result.length() > 0) {
                result.append(' ');
            }

            result.append(s.substring(start + 1, end + 1));

            end = start - 1;
        }

        return result.toString();
    }
}