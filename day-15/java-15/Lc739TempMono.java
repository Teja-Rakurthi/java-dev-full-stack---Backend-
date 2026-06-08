import java.util.*;
class Solution15{
    public static int[] DaysForWarmerTemp(int[] arr){
        int[] res= new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length;i++){
            while (!stack.isEmpty() && arr[i]>arr[stack.peek()]) {
                int previndex=stack.pop();
                res[previndex]=i-previndex;
            }
            stack.push(i);
        }
        return res;
    }
}
public class Lc739TempMono {
    public static void main(String[] args){
        int[] temperatures ={73,74,75,71,69,72,76,73};
        Solution15 sol=new Solution15();
        System.out.println(Arrays.toString(sol.DaysForWarmerTemp(temperatures)));
    }
}