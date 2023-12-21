public class Movie implements Show {
    private String name;
    String showTime;
    private int durationMinutes;

    public Movie(String name, String showTime, int durationMinutes) {
        this.name = name;
        this.showTime = showTime;
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void showTime() {
        System.out.println("Show time for the Movie '" + name + "': " + showTime);
    }

    @Override
    public void showDuration() {
        System.out.println("Duration of the Movie '" + name + "': " + durationMinutes + " minutes");
    }

    // Other methods and attributes specific to movies...
}
