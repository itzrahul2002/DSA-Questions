import java.util.Scanner;

public class CumulativeStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Initialize the array of strings
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Calculate cumulative length
        int totalLength = 0;
        for (String name : names) {
            totalLength += name.length();
        }

        System.out.println("Cumulative length of all strings: " + totalLength);
    }
}

