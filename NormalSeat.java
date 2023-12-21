public class NormalSeat implements Seat {
    private int seatNumber;
    private boolean isBooked;

    public NormalSeat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public boolean reserveSeat(Seat seat) {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Normal seat " + seatNumber + " reserved.");
            return true;
        }
        System.out.println("Normal seat " + seatNumber + " is already booked.");
        return false;
    }

    public boolean cancelReservation(Seat seat) {
        if (isBooked) {
            isBooked = false;
            System.out.println("Reservation for normal seat " + seatNumber + " canceled.");
            return true;
        }
        System.out.println("Normal seat " + seatNumber + " is not booked.");
        return false;
    }
}
