import java.util.*;
class Solution12 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.pop();
                if(ch==')' && top!='(' ||
                        ch==']' && top!='[' ||
                        ch=='}' && top!='{' ){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
public class Lc20Validparanthesis {
 public static void main(String [] args){
     String s = "()";
     Solution12 sol = new Solution12();
     if(sol.isValid(s)){
         System.out.println("true");
     }else{
         System.out.println("false");
     }

 }
}
