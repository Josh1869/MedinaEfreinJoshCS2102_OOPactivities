import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a Celsius value
        System.out.print("Enter a Celsius value: ");
        double celsius = scanner.nextDouble();

        // Convert the Celsius value to Fahrenheit
        double fahrenheit = celsius * 9/5 + 32;

        // Display the result with two decimal places
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
