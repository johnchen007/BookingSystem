public interface Seat {
    boolean reserveSeat(Seat seat);
    boolean cancelReservation(Seat seat);
}