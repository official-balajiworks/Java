package timeconverter;

public class Time {
    // Convert hours to minutes
    public int hoursToMinutes(int hours) {
        return hours * 60;
    }

    // Convert minutes to hours
    public double minutesToHours(int minutes) {
        return minutes / 60.0;
    }

    // Convert minutes to seconds
    public int minutesToSeconds(int minutes) {
        return minutes * 60;
    }

    // Convert seconds to minutes
    public double secondsToMinutes(int seconds) {
        return seconds / 60.0;
    }
}
