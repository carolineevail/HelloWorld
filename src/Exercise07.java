import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by Caroline on 3/1/16.
 */
public class Exercise07 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        File f = new File("people.csv");
        Scanner scanner = new Scanner(f);
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] columns = line.split(",");
            String name = columns[1] + " " + columns[2];
            names.add(name);
        }
        String searchTerm = "ali";
        ArrayList<String> results = new ArrayList<>();
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm)) {
                results.add(name);
            }
        }
        System.out.println(results);

        // To use stream:
        results = names.stream()
                .filter((name) -> {
                    return name.toLowerCase().contains(searchTerm);
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(results);
    }
}

// 1. Read the names into the arraylist, ex: "Martha Jenkins"
// 2. Have a new arraylist called "results" that contains the names that contain "ali".
