// public class hello {
//     public static void main(String[] args) {
//         // Print "Hello, World!" to the console
//         System.out.println("Hello, World!");
//     }
// }

public class hello {
    public static void main(String[] args) {
        // The number for which we want to calculate the factorial
        int num = 5;  // You can change this number to test other inputs
        
        // Calculating factorial
        long factorial = 1;
        
        // If the number is 0 or 1, factorial is 1
        if (num == 0 || num == 1) {
            factorial = 1;
        } else {
            // Loop to calculate factorial
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }
        
        // Printing the result
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}

