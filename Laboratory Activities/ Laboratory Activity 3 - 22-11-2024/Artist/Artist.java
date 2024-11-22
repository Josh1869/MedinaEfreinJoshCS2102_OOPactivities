public class Writer extends Artist {
    public enum WritingStyle {
        FICTION, NONFICTION, POETRY, DRAMA
    }

    private WritingStyle writingStyle;

    public Writer(String name, int age, WritingStyle writingStyle) {
        super(name, age, "Writing");
        this.writingStyle = writingStyle;
    }

    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Writer's Info:");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }
}