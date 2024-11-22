public class ArtistDemo {
    public static void main(String[] args) {
        // Creating an instance of the base Artist class
        System.out.println("Instance of Artist class:");
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();

        // Creating an instance of the Singer class
        System.out.println("\nInstance of Singer class:");
        Singer singer = new Singer("Nayeon Im", 29, Singer.Genre.POP);
        singer.displayInfo();

        // Creating an instance of the Dancer class
        System.out.println("\nInstance of Dancer class:");
        Dancer dancer = new Dancer("Anna Pavlova", 28, Dancer.DanceStyle.BALLET);
        dancer.displayInfo();

        // Creating an instance of the Painter class
        System.out.println("\nInstance of Painter class:");
        Painter painter = new Painter("Vincent van Gogh", 37, Painter.Medium.OIL);
        painter.displayInfo();

        // Creating an instance of the Writer class
        System.out.println("\nInstance of Writer class:");
        Writer writer = new Writer("William Shakespeare", 52, Writer.WritingStyle.DRAMA);
        writer.displayInfo();
    }
}