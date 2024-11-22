public class Singer extends Artist {
    public enum Genre {
        POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
    }

    private Genre genre;

    public Singer(String name, int age, Genre genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Singer's Info:");
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}