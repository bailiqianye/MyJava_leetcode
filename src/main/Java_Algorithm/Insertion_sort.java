import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Insertion_sort {
@Test
    public void  main(){

    int []array ={2,6,9,7,5};
    System.out.println(Arrays.toString(sorrt(array)));

}


    public int[] sorrt(int[] arry){
        for (int i = 1;i<arry.length;i++){
                int insertVal =arry[i];
                int index =i-1;
                while (index>=0&&insertVal<arry[index]){
                        arry[index+1]=arry[index];

                        index--;
                }
                arry[index+1]=insertVal;


        }



        return arry ;
    }
}
