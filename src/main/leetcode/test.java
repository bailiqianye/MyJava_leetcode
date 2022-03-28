import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class test {

    @Test
    public void main() {
        int[] numbers = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(numbers));


    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        //[-4, -1, -1, 0, 1, 2]


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = nums.length - 1;


            while (l < r) {

                if (l > i + 1 && nums[l] == nums[l - 1]) { // 跳过重复解
                    l++;
                    continue;
                }


                int lrSum = nums[l] + nums[r];
                if (lrSum == -nums[i]) { // 找到解，加入lists中，移动两个指针
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    lists.add(list);
                    l++;
                    r--;
                } else if (lrSum < -nums[i]) l++; // 小于目标，移动左指针
                else r--; // 大于目标，移动右指针
            }

        }
        return lists;

    }



















}

