import org.junit.jupiter.api.Test;

public class biSearch {

    @Test
    public void test(){
        int []array ={2,6,9,7,5};
        int a = 9;
        System.out.println(biSearch(array, a));


    }


    public  int biSearch(int []array,int a){
        int lo=0;
        int hi = array.length-1;
        int mid ;
        while (lo<=hi){
            mid = (lo+hi)/2;
            if(array[mid]==a){
                    return mid+1;
            }else if(array[mid]<a){
                lo = mid+1;
            }else{
                hi =mid-1;
            }


        }
            return -1;
    }


}
