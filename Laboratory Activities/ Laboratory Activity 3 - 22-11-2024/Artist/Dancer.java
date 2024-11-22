public class Dancer extends Artist {
    public enum DanceStyle {
        BALLET, HIPHOP, JAZZ, CONTEMPORARY
    }

    private DanceStyle danceStyle;

    public Dancer(String name, int age, DanceStyle danceStyle) {
        super(name, age, "Dancing");
        this.danceStyle = danceStyle;
    }

    public DanceStyle getDanceStyle() {
        return danceStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Dancer's Info:");
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}