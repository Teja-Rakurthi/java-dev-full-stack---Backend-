//You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
//
//Evaluate the expression. Return an integer that represents the value of the expression.
//
//Note that:
//
//The valid operators are '+', '-', '*', and '/'.
//Each operand may be an integer or another expression.
//The division between two integers always truncates toward zero.
//There will not be any division by zero.
//The input represents a valid arithmetic expression in a reverse polish notation.
//The answer and all the intermediate calculations can be represented in a 32-bit integer.
//Example 1:
//
//Input: tokens = ["2","1","+","3","*"]
//Output: 9
//Explanation: ((2 + 1) * 3) = 9

import java.util.Stack;

class Solution16{
    public int Evalute(String [] tokens){
        int res=0;
        Stack<Integer> stack= new Stack<>();
        for(String s:tokens){
            if(!("+").equals(s) && !("-").equals(s) && !("*").equals(s) && !("/").equals(s)){
                int num= Integer.parseInt(s);
                stack.push(num);
            }else{
                int b=stack.pop();
                int a=stack.pop();

                if("+".equals(s)){
                    res=a+b;

                }else if("*".equals(s)){
                    res=a*b;

                }else if("-".equals(s)){
                    res=a-b;
                }else{
                    res=a/b;
                }
                stack.push(res);
            }
        }
        return  stack.peek();
    }
}
public class LcRPN {
    public static void main(String [] args){
        String[] arr = {"2","1","+","3","*"};
        Solution16 sol = new Solution16();
        System.out.println(sol.Evalute(arr));
    }
}