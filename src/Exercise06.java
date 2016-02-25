import java.util.*;

/**
 * Created by Caroline on 2/25/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown"};


        // 1. Reverse the list. My way:
//        List<String> list = Arrays.asList(names);
//        Collections.reverse(list);
//        names = (String[])list.toArray();
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        // 1. Reverse the list. Zach:
//        String[] reversedNames = new String[names.length];
//        ArrayList<String> reversedNames = new ArrayList<>();
//        for (int i = names.length - 1; i >= 0; i--) {
//            reversedNames[names.length-i-1] = names[i];
//            reversedNames.add(names[i]);
//        }
        // Another way to reverse list:
        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);


        // 2. Turn it into a hashMap.
        HashMap<String, String> nameMap = new HashMap<>();
        for (int i = 0; i < reversedNames.size(); i+=2) {
            nameMap.put(reversedNames.get(i), reversedNames.get(i+1));
        }
        System.out.println(nameMap);
    }
}

//        {"Smith":"Alice", "Hope":"Bob", "Brown":"Charlie"}
