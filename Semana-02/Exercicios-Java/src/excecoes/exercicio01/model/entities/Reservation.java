package excecoes.exercicio01.model.entities;

import excecoes.exercicio01.model.exception.DomainException;

import java.time.LocalDate;

public class Reservation {
    private int roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation() {
    }

    public Reservation(int roomNumber, LocalDate checkin, LocalDate checkout) {
        if (!checkout.isAfter(checkin)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int duration(){
        return checkout.compareTo(checkin);
    }

    public void updateDates(LocalDate checkin, LocalDate checkout){
        LocalDate now = LocalDate.now();

        if (checkin.isBefore(now) || checkout.isBefore(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkout.isAfter(checkin)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return  "Reservation: Room " + this.getRoomNumber() + ", check-in " + this.getCheckin() + ", check-out " + this.getCheckout() + ", " + this.duration() + " nights";

    }
}
