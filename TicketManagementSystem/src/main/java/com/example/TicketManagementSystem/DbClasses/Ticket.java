package com.example.TicketManagementSystem.DbClasses;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    @OneToOne(mappedBy = "ticket", fetch = FetchType.EAGER)
    private TicketDetails ticketDetails;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bookingId", referencedColumnName = "bookingId", nullable = false)
    private Booking booking;


    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public TicketDetails getTicketDetails() {
        return ticketDetails;
    }

    public void setTicketDetails(TicketDetails ticketDetails) {
        this.ticketDetails = ticketDetails;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
