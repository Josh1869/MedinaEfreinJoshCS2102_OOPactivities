import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Getting the Greater Value");

        // Input for the first character (extract first character from input)
        System.out.print("Enter first character: ");
        char firstChar = scanner.next().charAt(0);

        // Input for the second character (extract first character from input)
        System.out.print("Enter second character: ");
        char secondChar = scanner.next().charAt(0);

        // Find the character with greater value using Math.max
        char greaterChar = (char) Math.max(firstChar, secondChar);

        // Output the greater character
        System.out.println("----------------------------");
        System.out.println("The character with greater value is: " + greaterChar);
        System.out.println("\nShowing the ASCII Codes");
        System.out.println(firstChar + ": " + (int) firstChar);
        System.out.println(secondChar + ": " + (int) secondChar);
    }
}