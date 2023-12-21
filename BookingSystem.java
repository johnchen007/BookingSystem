import java.util.Scanner;

public class BookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a show type:");
            System.out.println("1. Movie");
            System.out.println("2. TV Show");
            System.out.println("3. Drama Show");
            System.out.println("4. Quit");

            int showChoice = scanner.nextInt();
            scanner.nextLine(); 

            if (showChoice == 4) {
                System.out.println("Exiting the booking system.");
                scanner.close();
                System.exit(0);
            }


            Show show = null;
            switch (showChoice) {
                case 1:
                	
                    show = new Movie("Spider Man", "Monday 5 PM", 120); 
                    show.showTime();
                    show.showDuration();
                    break;
                case 2:
                    show = new TV("Office", "Friday 5 PM", 160);
                    show.showTime();
                    show.showDuration();
                    break;
                case 3:
                    show = new Drama("Spider Man", "Monday 5 PM", 120);
                    show.showTime();
                    show.showDuration();
                    break;
                default:
                    System.out.println("Invalid show type.");
                    break;
            }

            if (show != null) {
                System.out.println("Choose an action:");
                System.out.println("1. Reserve a seat");
                System.out.println("2. Cancel a reservation");
                System.out.println("3. Quit");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                
                Seat normalSeat = new NormalSeat(1);
                Seat vipSeat = new VIPSeat(2);
                Seat wheelchairSeat = new WheelchairSeat(3);

                switch (choice) {
                    case 1:
                        System.out.println("Enter the seat type (Normal, VIP, Wheelchair):");
                        String seatType = scanner.nextLine();

                        switch (seatType.toLowerCase()) {
                            case "normal":
                                normalSeat.reserveSeat(normalSeat);
                                break;
                            case "vip":
                                vipSeat.reserveSeat(vipSeat);
                                break;
                            case "wheelchair":
                                wheelchairSeat.reserveSeat(wheelchairSeat);
                                break;
                            default:
                                System.out.println("Invalid seat type.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Enter the seat type to cancel (Normal, VIP, Wheelchair):");
                        String cancelSeatType = scanner.nextLine();

                        switch (cancelSeatType.toLowerCase()) {
                            case "normal":
                                normalSeat.cancelReservation(normalSeat);
                                break;
                            case "vip":
                                vipSeat.cancelReservation(vipSeat);
                                break;
                            case "wheelchair":
                                wheelchairSeat.cancelReservation(wheelchairSeat);
                                break;
                            default:
                                System.out.println("Invalid seat type.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Exiting the booking system.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                        break;
                }
            }
        }
    }
}
