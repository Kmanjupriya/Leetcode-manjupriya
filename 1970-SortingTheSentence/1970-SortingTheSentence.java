// Last updated: 11/08/2026, 14:17:39
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];
        
        for (String word : words) {
            int len = word.length();
            
            int targetIdx = word.charAt(len - 1) - '1'; 
            
            sortedWords[targetIdx] = word.substring(0, len - 1);
        }
        
        return String.join(" ", sortedWords);
    }
}