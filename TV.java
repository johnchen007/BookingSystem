import java.util.Date;

public class TV implements Show {
    private String name;
    String  showTime;
    private int durationMinutes;

    public TV(String name, String showTime, int durationMinutes) {
        this.name = name;
        this.showTime = showTime;
        this.durationMinutes = durationMinutes;
    }

   
	@Override
    public void showTime() {
        System.out.println("Show time for the tv '" + name + "': " + showTime);
    }

    @Override
    public void showDuration() {
        System.out.println("Duration of the tv '" + name + "': " + durationMinutes + " minutes");
    }

    // Other methods and attributes specific to movies...
}
