import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test_No_4 {
    @Test
    public void main(){
        int []nums1 = {1,3};
        int []nums2 = {2,4};

        System.out.println(findMedianSortedArrays(nums1,nums2));




        }
   /*
    输入：nums1 = [1,3], nums2 = [2]
    输出：2.00000
    解释：合并数组 = [1,2,3] ，中位数 2
    */
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       //构建新数组
       int[] num=new int[nums1.length+nums2.length];
       //合并数组
       System.arraycopy(nums1, 0, num, 0, nums1.length);
       System.arraycopy(nums2,0,num,nums1.length,nums2.length);
       //新数组排序
       Arrays.sort(num);
       //判断奇偶性
       int a=num.length%2;
       if(a!=0){
           return num[num.length/2];
       }else{
           return (num[num.length/2]+num[num.length/2-1])/2.0;
       }
   }



}
