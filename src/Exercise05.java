import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Caroline on 2/24/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward", "alex"};

        // 1. put the first 5 names in a new data structure
        ArrayList<String> newNames = new ArrayList<>(Arrays.asList(names));
        newNames = new ArrayList<>(newNames.subList(0, 5));

        solveViaStream(newNames);
        solveViaTempLists(newNames);
        solveViaDirectModification(newNames);
    }

    // 2. loop over names and make them entirely uppercase
    //one option: solveViaDirectModification method
    //another option: solveViaTempLists method

    static void solveViaDirectModification(ArrayList<String> names) {
        //make all the names uppercase
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }

        // 3. Filter out ones that don't start with "A"
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }

        System.out.println(names);
    }

    static void solveViaTempLists (ArrayList<String> names) {
        ArrayList<String> temp = new ArrayList<>();
        for (String name : names) {
            temp.add(name.toUpperCase());
        }
        names = temp;


        // 3. Filter out names that don't start with "A"
        temp = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                temp.add(name);
            }
        }
        names = temp;

        System.out.println(names);
    }


    // 3. Filter out names that don't start with "A"
    static void solveViaStream(ArrayList<String> names) {
        names = names.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));

        System.out.println(names);
    }


}



