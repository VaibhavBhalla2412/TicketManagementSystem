package com.example.TicketManagementSystem.DbClasses;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class TicketDetailsId implements Serializable {
    private static final long serialVersionUID = -764799656284278284L;
    private LocalDate dateOfShow;
    private int hallNumber;
    private int seatNumber;

    public TicketDetailsId(LocalDate dateOfShow, int hallNumber, int seatNumber) {
        this.dateOfShow = dateOfShow;
        this.hallNumber = hallNumber;
        this.seatNumber = seatNumber;
    }

    public TicketDetailsId() {}

    // Getters and setters


    // Override equals and hashCode to ensure the correct comparison of composite keys
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketDetailsId that = (TicketDetailsId) o;
        return Objects.equals(dateOfShow, that.dateOfShow) && Objects.equals(hallNumber, that.hallNumber)
                && Objects.equals(seatNumber, that.seatNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfShow, hallNumber, seatNumber);
    }
}
