import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String filename = "sample_output.txt";

        // Writing to file
        try (PrintWriter writer = new PrintWriter(filename)) {
            writer.println("Java Course Material");
            writer.println("File I/O Demonstration Completed");
        } catch (Exception e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Reading from file
        try (Scanner sc = new Scanner(new File(filename))) {
            System.out.println("Reading back file contents:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Read error: " + e.getMessage());
        }

        // Cleanup demo file
        new File(filename).delete();
    }
}