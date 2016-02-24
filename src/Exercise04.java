import java.util.*;

/**
 * Created by Caroline on 2/22/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        // write code to print out string that does not have repeated words. ie. to be or not that is the question
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(",", "").replace(".", "");
        String[] words = sentence.split(" ");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(words));
        String[] result = new String[set.size()];
        set.toArray(result);
        StringBuilder resulting = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            String string = result[i];
            if (i == result.length - 1) {
                resulting.append(string);
            }
            else {
                resulting.append(string).append(" ");
            }
        }
        System.out.println(resulting.toString());

    }

}
