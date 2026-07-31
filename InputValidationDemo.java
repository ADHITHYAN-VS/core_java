import java.util.Scanner;

public class InputValidationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;

        while (true) {
            System.out.print("Enter age: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                break;
            } else {
                System.out.println("Invalid input! Please enter an integer.");
                sc.next();
            }
        }

        System.out.println("Age entered: " + age);
    }
}