import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Test_No_1 {



@Test
    public  void main() {

        int[] nums={3,2,4};
        int []out;
        out =twoSum1(nums,6);
        System.out.println(Arrays.toString(out));
//
//
//        int target=6;
//        for( int i =0;i< nums.length;i++){
//
//            for(int j=i+1;j<nums.length;j++){
//
//
//                if (nums[i]+nums[j]==6){
//                    System.out.println(i);
//                    System.out.println(j);
//                }
//
//
//
//            }
//        }
    }



    public int[] twoSum1(int[] nums, int target)
    {
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(target - nums[i] == nums[j])
                    return new int[]{i,j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target)
    {
        Map<Integer,Integer> hash = new HashMap<Integer, Integer>();


        for(int i=0; i<nums.length; i++)
        {
            hash.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++)
        {
            if(hash.containsKey(target - nums[i]) && hash.get(target - nums[i]) != i)
                return new int[]{i, hash.get(target - nums[i])};
        }
        throw new IllegalArgumentException("No two sum solution");
    }



}