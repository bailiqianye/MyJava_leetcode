import org.junit.jupiter.api.Test;

public class Test_No_7 {
    
    


@Test
public void main(){
    String str[] = {"flower","flow","flight"};

    System.out.println(longestCommonPrefix(str));


}

    public String longestCommonPrefix(String[] strs) {
    String str = "";

    for (int i =0;i<strs[0].length();i++){

        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++){

            if (i==strs[j].length()|| strs[j].charAt(i)!= c){




                return (strs[0].substring(0,i));

            }


        }

    }


    return  null ;
    }



}

