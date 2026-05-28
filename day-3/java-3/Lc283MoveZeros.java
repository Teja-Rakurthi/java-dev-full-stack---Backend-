import java.util.Arrays;

class Solution {

    public int[] moveZeroes(int[] nums) {

        if(nums.length == 1){
            return nums;
        }

        int j = 0;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] != 0 && nums[j] == 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if(nums[j] != 0) {
                j++;
            }
        }

        return nums;
    }
}

public class Lc283MoveZeros {

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,5};

        Solution s = new Solution();

        int[] result = s.moveZeroes(arr);

        System.out.println(Arrays.toString(result));
    }
}