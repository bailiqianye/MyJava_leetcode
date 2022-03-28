import org.junit.jupiter.api.Test;

public class Test_No_6 {






    @Test
    public void test(){
        int x=-123;
        System.out.println( reverse(x));

    }


    /*
    逻辑与 : &&
    逻辑或 : ||


    当表达式为真，则执行下面的语句；语句执行完之后
    再判断表达式是否为真，如果为真，再次执行下面的语句；
    然后再判断表达式是否为真……就这样一直循环下去，直到表达式为假，跳出循环
     */




    public int reverse(int x) {

        if (x < 0) {
            long l = x % 10;

            x /= 10;

            while (x < 0) {
                l = l * 10 + x % 10;
                x /= 10;
            }

            if (l < -2147483648) {
                return 0;
            } else {



                return (int) l;
            }





        } else {
            long l = x % 10;
            x = x / 10;
            while (x > 0) {
                l = l * 10 + x % 10;
                x /= 10;
            }
            if (l > 2147483647) {
                return 0;
            } else {
                return (int) l;
            }
        }

    }
}
