import java.util.Scanner;

public class SongDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting inputs from the user
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter the album: ");
        String album = scanner.nextLine();

        System.out.print("Enter the song title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the artist: ");
        String artist = scanner.nextLine();

        // Printing the song details
        System.out.println("\n--------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------");
        System.out.println("Year Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: \"" + title + "\"");
        System.out.println("Artist: " + artist);
    }
}