import java.util.*;
class SolutionAna{
    public boolean isAnagram(String s, String t) {


        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
public class Lc242Anagram {
    public static void main(String[] args){
        String s="anagram";
        String t="nagaram";
        SolutionAna sol = new SolutionAna();
        if(sol.isAnagram(s,t)){
            System.out.println("yes anagram ra chintu");
        }else{
            System.out.println("anagram kadhura chintu");

        }
    }

}