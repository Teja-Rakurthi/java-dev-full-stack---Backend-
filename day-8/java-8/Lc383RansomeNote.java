class Solution8{
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
public class Lc383RansomeNote {
    public static void main(String[] args){
        String mag = "aab";
        String ran = "aa";
        Solution8 sol =new Solution8();
        if(sol.canConstruct(ran,mag)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}