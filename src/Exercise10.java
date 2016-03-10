/**
 * Created by Caroline on 3/10/16.
 */
public class Exercise10 {
    public static void main(String[] args) throws Exception {
        String palindrome = "racecar";
        String nonPalindrome = "hello";
        if (isPalindrome(palindrome) && !isPalindrome(nonPalindrome)) {
            System.out.println("IT WORKS!");
        }
        else {
            throw new Exception("Fail");
        }
    }

    public static boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        return stringBuffer.reverse().toString().equals(s);
    }
    //Zach's solutions:

//    public static boolean isPalindrome(String s) {
//        return s.equals(new StringBuilder(s).reverse().toString());
//     }

//    public static boolean isPalindrome(String s) {
//        int i = 0;
//        while (true) {
//            if (i == s.length()/2) {
//                return true;
//            }
//            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
//            i++;
//            }
//            else {
//                return false;
//            }
//        }
//    }
}
