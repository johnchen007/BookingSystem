

class Drama implements Show {
    private String name;
    String showTime;
    private int durationMinutes;

    public Drama(String name, String showTime, int durationMinutes) {
        this.name = name;
        this.showTime = showTime;
        this.durationMinutes = durationMinutes;
    }
	@Override
    public void showTime() {
        System.out.println("Show time for the Drama '" + name + "': " + showTime);
    }

	  @Override
	    public void showDuration() {
	        System.out.println("Duration of the Drama '" + name + "': " + durationMinutes + " minutes");
	    }


}