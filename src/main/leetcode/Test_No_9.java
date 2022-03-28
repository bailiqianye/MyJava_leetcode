import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_No_9 {


    @Test
    public void main() {
        int []nums = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums, 1));

    }


    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);


        int res = nums[0]+nums[1]+nums[nums.length-1];// -4

        for(int i =0 ;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int cur = nums[i] + nums[left] + nums[right];
                if (cur == target) return target;
                if (Math.abs(res - target) > Math.abs(cur - target)) res = cur;
                if (cur > target) right -= 1;
                if (cur < target) left += 1;
            }
        }
        return res;
    }




}

