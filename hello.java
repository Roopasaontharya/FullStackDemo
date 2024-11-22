// public class hello {
//     public static void main(String[] args) {
//         // Print "Hello, World!" to the console
//         System.out.println("Hello, World!");
//     }
// }

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Asking for the number of rows for the upper half of the diamond
        System.out.print("Enter the number of rows for the diamond pattern: ");
        int n = scanner.nextInt();
        
        // Print the upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Print the lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

