import java.util.*;
class Solution128{
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int split=0;
        int maxsum=Integer.MIN_VALUE;
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        for(int i=0; i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                sum++;
            }else if(nums[i+1]-nums[i]>1){
                split++;
            }

            if(split==1){
                sum=0;
                split=0;
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum+1;
    }
}
public class Lc128LongConSeq {
    public static void main(String[] args){
        int[] arr = {100,4,200,1,3,2};
        Solution128 s = new Solution128();
        System.out.println(s.longestConsecutive(arr));
    }
}