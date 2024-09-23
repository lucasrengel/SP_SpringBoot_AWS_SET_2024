package excecoes.exercicio01.application;

import excecoes.exercicio01.model.entities.Reservation;
import excecoes.exercicio01.model.exception.DomainException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            String indata = sc.next();
            LocalDate checkinDate = LocalDate.parse(indata, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Check-out date (dd/MM/yyyy): ");
            String outdata = sc.next();
            LocalDate checkoutDate = LocalDate.parse(outdata, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Reservation reservation = new Reservation(roomNumber, checkinDate, checkoutDate);
            System.out.println(reservation);

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            indata = sc.next();
            checkinDate = LocalDate.parse(indata, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Check-out date (dd/MM/yyyy): ");
            outdata = sc.next();
            checkoutDate = LocalDate.parse(outdata, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            reservation.updateDates(checkinDate, checkoutDate);
            System.out.println("Reservation: " + reservation);

        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }


    }
}
