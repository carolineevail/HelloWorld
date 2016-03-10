import java.util.Collection;
import java.util.Collections;

/**
 * Created by Caroline on 3/8/16.
 */
public class Exercise09 {
    public static void main(String[] args) {
        int num = 12345;
        useLoop(num);
        useReverse(num);
        useMath(num);
//        String number = String.valueOf(num);
//        StringBuffer buffer = new StringBuffer(number);
//        number = buffer.reverse().toString();
//
//        System.out.println(number);
    }

    public static void useLoop(int num) {
        String numStr = String.valueOf(num);
        String newNumStr = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            newNumStr += numStr.charAt(i);
        }
        int newNum = Integer.valueOf(newNumStr);
        System.out.println(newNum);
    }

    public static void useReverse(int num) {
        String numStr = String.valueOf(num);
        numStr = new StringBuilder(numStr).reverse().toString();
        int newNum = Integer.valueOf(numStr);
        System.out.println(newNum);
    }

    public static void useMath(int num) {
        int newNum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            newNum = newNum * 10 + rem;
        }
        System.out.println(newNum);
    }
}

//output 54321