import org.junit.jupiter.api.Test;
import  java.util.*;
public class Test_No_8 {


    @Test
    public void main() {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));


    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        if(nums==null || nums.length< 3 )return list;
        Arrays.sort(nums);//[-4, -1, -1, 0, 1, 2]

        for(int i = 0;i<len;i++){
            if(nums[i]>0)break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) L++;
                    while (L < R && nums[R] == nums[R - 1]) R--;
                    L++;
                    R--;
                }else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return list;
    }


}

