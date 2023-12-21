public class WheelchairSeat implements Seat {
    private int seatNumber;
    private boolean isBooked;

    public WheelchairSeat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public boolean reserveSeat(Seat seat) {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Wheelchair seat " + seatNumber + " reserved.");
            return true;
        }
        System.out.println("Wheelchair seat " + seatNumber + " is already booked.");
        return false;
    }

    
    public boolean cancelReservation(Seat seat) {
        if (isBooked) {
            isBooked = false;
            System.out.println("Reservation for wheelchair seat " + seatNumber + " canceled.");
            return true;
        }
        System.out.println("Wheelchair seat " + seatNumber + " is not booked.");
        return false;
    }
}