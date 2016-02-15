import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Caroline on 2/11/16.
 */
public class Exercise01 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Edward", "Albert", "Beth"};
        HashMap<Character, ArrayList<String>> nameMap = new HashMap<>();

        //create empty arraylists
        for (String name : names) {
            char firstLetter = name.charAt(0);
            nameMap.put(firstLetter, new ArrayList<String>());

        }

        //add names; if you comment out the following for loop, it will print blank letter arraylists.
        for (String name : names) {
            char firstLetter = name.charAt(0);
            nameMap.get(firstLetter).add(name);
        }

        System.out.println(nameMap);
    }
}
