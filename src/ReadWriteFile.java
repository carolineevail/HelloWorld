import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Caroline on 2/10/16.
 */
public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Alice\n"); // overwrites file
        fw.append("Bob\n");
        fw.append("Charlie\n");
        fw.close();

        Scanner scanner = new Scanner(f);

        //to read line-by-line, do the following
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        //to read the entire file, do the following
        scanner = new Scanner(f); //to avoid error, we had to reset the file with this line
        scanner.useDelimiter("\\Z");
        String contents = scanner.next();
        System.out.println(contents);
    }
}
