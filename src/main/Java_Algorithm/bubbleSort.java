import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

public class bubbleSort {


    @Test
    public  void main() {
        int []array ={2,6,9,7,5};
        int a = 4;
        System.out.println(Arrays.toString(bubbleSort(array, a)));

    }

    public int[] bubbleSort(int []arry, int n){

          for(int i = 0;i<n;i++){
              for(int j=1;j<n-i;j++){
                  if(arry[j-1]>arry[j]) {
                      int temp;
                      temp = arry[j - 1];
                      arry[j - 1] = arry[j];
                      arry[j] = temp;

                  }
              }

          }

          return arry;


    }

}
