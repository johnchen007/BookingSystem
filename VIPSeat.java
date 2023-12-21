public class VIPSeat implements Seat {
    private int seatNumber;
    private boolean isBooked;

    public VIPSeat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public boolean reserveSeat(Seat seat) {
        if (!isBooked) {
            isBooked = true;
            System.out.println("VIP seat " + seatNumber + " reserved.");
            return true;
        }
        System.out.println("VIP seat " + seatNumber + " is already booked.");
        return false;
    }

    public boolean cancelReservation(Seat seat) {
        if (isBooked) {
            isBooked = false;
            System.out.println("Reservation for VIP seat " + seatNumber + " canceled.");
            return true;
        }
        System.out.println("VIP seat " + seatNumber + " is not booked.");
        return false;
    }
}