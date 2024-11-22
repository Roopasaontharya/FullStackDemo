// public class hello {
//     public static void main(String[] args) {
//         // Print "Hello, World!" to the console
//         System.out.println("Hello, World!");
//     }
// }

public class hello {
    public static void main(String[] args) {
        int n = 4; // Number of rows in the pyramid
        
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}


