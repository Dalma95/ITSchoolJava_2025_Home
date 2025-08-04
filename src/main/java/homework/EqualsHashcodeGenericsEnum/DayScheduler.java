package homework.EqualsHashcodeGenericsEnum;
//13. Create a day scheduler application that uses an enum to represent the days of the week. The application should be able to assign and retrieve activities for each day.
public class DayScheduler {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    private String[] activities;

    public DayScheduler() {
        activities = new String[Day.values().length];
    }

    public void assignActivity(Day day, String activity) {
        activities[day.ordinal()] = activity;
    }

    public String getActivity(Day day) {
        return activities[day.ordinal()];
    }

    public static void main(String[] args) {
        DayScheduler scheduler = new DayScheduler();
        scheduler.assignActivity(Day.MONDAY, "Gym");
        scheduler.assignActivity(Day.WEDNESDAY, "Yoga");

        System.out.println("Monday's activity: " + scheduler.getActivity(Day.MONDAY));
        System.out.println("Wednesday's activity: " + scheduler.getActivity(Day.WEDNESDAY));
    }
}
