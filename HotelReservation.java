import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HotelReservation {

    private static final String url ="jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "root";
    private static final String password = "@MySQL_45";

    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            while (true){
                System.out.println();
                System.out.println("HOTEL MANAGEMENT SYSTEM");
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. Reserve a Room" +
                        "");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservations");
                System.out.println("5. Delete Reservations");
                System.out.println("0. Exit");
                System.out.print("Choose an Option: ");
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        reserveRoom(connection,scanner);
                        break;
                    case 2:
                        viewReservations(connection);
                        break;
                    case 3:
                        getRoomNumber(connection,scanner);
                        break;
                    case 4:
                        updateReservation(connection,scanner);
                        break;
                    case 5:
                        deleteReservation(connection,scanner);
                        break;
                    case 0:
                        exit();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid Choice , Try again.");
                }
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    private static void reserveRoom(Connection connection,Scanner scanner){
        try {
            System.out.print("Enter guest name: ");
            String guestName = scanner.next();
            scanner.nextLine();
            System.out.print("Enter room number: ");
            int roomNumber = scanner.nextInt();
            System.out.print("Enter contact number: ");
            String ContactNumber = scanner.next();

            String sql = "INSERT INTO reservations (guest_name, room_number, contact_number) " +
                    "VALUES ('" + guestName + "', " + roomNumber + ", '" + ContactNumber + "')";
            int affectedRows;
            try (Statement statement = connection.createStatement()) {
                affectedRows = statement.executeUpdate(sql);
            }

            if ( affectedRows>0) {
                System.out.println("Reservation Successful.");
            } else {
                System.out.println("Reservation Failed.");
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    private static void viewReservations(Connection connection) throws SQLException{
        String sql = "SELECT reservation_id, guest_name, room_number, contact_number, reservation_data FROM reservations";

        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)){

            System.out.println("Current Reservations:");
            System.out.println("+----------------+--------------+----------------+-----------------+--------------------------------------+");
            System.out.println("| Reservation Id | Guest        | Room Number    | Contact Number   | Reservation Data                    |");
            System.out.println("+----------------+--------------+----------------+-----------------+--------------------------------------+");

            while (resultSet.next()){
                int reservationId = resultSet.getInt("reservation_id");
                String guestName = resultSet.getNString("guest_name");
                int roomNumber = resultSet.getInt("room_number");
                String contactNumber = resultSet.getNString("contact_number");
                String reservationDate = resultSet.getTimestamp("reservation_data").toString();

                System.out.printf("| %-14d | %-15s | %-13d | %-20s | %-19s  |\n",
                        reservationId, guestName, roomNumber, contactNumber, reservationDate);
            }

            System.out.println("+----------------+--------------+----------------+-----------------+------------------+-------------------+");
        }
    }

    private static void getRoomNumber(Connection connection,Scanner scanner){
        try {
            System.out.print("Enter Reservation Id: ");
            int reservationId = scanner.nextInt();
            System.out.print("Enter Guest Name: ");
            String guestname = scanner.next();

            String sql = "SELECT room_number FROM reservations " +
                    "WHERE reservation_id = " + reservationId +
                    " AND guest_name = '" + guestname + "'";

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {

                if (resultSet.next()) {
                    int roomNumber = resultSet.getInt("room_number");
                    System.out.println("Room Number for Reservation ID " + reservationId +
                            " and Guest " + guestname + " is : " + roomNumber);
                } else {
                    System.out.println("Reservation is not found for the given ID and Guest name.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private static void updateReservation(Connection connection, Scanner scanner){
        try{
            System.out.print("Enter Reservation Id to Update: ");
            int reservationId = scanner.nextInt();
            scanner.nextLine();

            if(!reservationExists(connection,reservationId)){
                System.out.println("Reservation is not found for the given ID.");
                return;
            }

            System.out.print("Enter New Guest Name: ");
            String newGuestName = scanner.nextLine();
            System.out.print("Enter New Room Number: ");
            int newRoomNumber = scanner.nextInt();
            System.out.print("Enter New Contact Number: ");
            String newContactNumber = scanner.next();

            String sql = "UPDATE reservations SET guest_name = '" + newGuestName + "', " +
                    "room_number = " + newRoomNumber + ", " +
                    "contact_number = '" + newContactNumber + "' " +
                    "WHERE reservation_id = " + reservationId ;

            int affectedRows;
            try (Statement statement = connection.createStatement()) {
                affectedRows = statement.executeUpdate(sql);
            }

            if ( affectedRows>0) {
                System.out.println("Reservation Update Successful.");
            } else {
                System.out.println("Reservation Update Failed.");
            }



        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteReservation(Connection connection,Scanner scanner){
        try{
            System.out.print("Enter The Reservation Id to Delete: ");
            int reservationId = scanner.nextInt();

            if(!reservationExists(connection,reservationId)){
                System.out.println("Reservation is not found for the given ID.");
                return;
            }
            String sql = "DELETE FROM reservations WHERE reservation_id = " + reservationId ;

            int affectedRows;
            try (Statement statement = connection.createStatement()) {
                affectedRows = statement.executeUpdate(sql);
            }

            if ( affectedRows>0) {
                System.out.println("Reservation Deleted Successful.");
            } else {
                System.out.println("Reservation Delete Failed.");
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }


    private static boolean reservationExists(Connection connection,int reservationId){
        try{
            String sql = "SELECT reservation_id FROM reservations WHERE reservation_id = " + reservationId ;

            try(Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql)){
                return resultSet.next();
            }
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public static void exit() throws InterruptedException{
        System.out.print("Exting System");
        int i = 5;
        while(i!=0){
            System.out.print(".");
            Thread.sleep(450);
            i--;
        }
        System.out.println();
        System.out.println("ThankYou for using Hotel Reservation System. ");
    }
}

