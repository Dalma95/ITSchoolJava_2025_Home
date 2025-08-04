package homework.EqualsHashcodeGenericsEnum;
//6. Create an enum called LightColor that represents the three colors of a traffic light: red, yellow, and green. Each color should have a string representation and a duration (in seconds) associated with it (e.g., red = "Stop", 30 seconds; yellow = "Caution", 5 seconds; green = "Go", 45 seconds).
public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private final String description;
    private final int duration;

    LightColor(String description, int duration) {
        this.description = description;
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return name() + " (" + description + ", " + duration + " seconds)";
    }

    public static void main(String[] args) {
        for (LightColor color : LightColor.values()) {
            System.out.println(color);
        }

        LightColor currentColor = LightColor.RED;
        System.out.println("Current light color: " + currentColor.getDescription());
        System.out.println("Duration: " + currentColor.getDuration() + " seconds");
    }
}
