import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Caroline on 3/2/16.
 */
public class Exercise08 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob"};
        ArrayList<String> sortedNames = new ArrayList<>();
        for (String name : names) {
            int index = 0;
            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName) > 0) {
                    index++;
                }
                else {
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);

    }
}


//sort the names and printout
//System.out.println(sortedNames);

// My solution:
//        Arrays.sort(names);
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }