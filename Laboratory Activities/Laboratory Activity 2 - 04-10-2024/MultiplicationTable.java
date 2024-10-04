import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the multiplication table: ");
        int size = 0;
        
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }
        
        if (size <= 0 || size > 12) {
            System.out.println("The size should be between 1 and 12.");
            return;
        }

        System.out.println("Multiplication Table:");
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}