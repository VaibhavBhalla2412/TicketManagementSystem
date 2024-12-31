package com.example.TicketManagementSystem.DbClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    int ticketId;
    private String userName;
    private LocalDateTime dateOfShow;
    private List<Integer> Seats;

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getDateOfShow() {
        return dateOfShow;
    }

    public void setDateOfShow(LocalDateTime dateOfShow) {
        this.dateOfShow = dateOfShow;
    }

    public List<Integer> getSeats() {
        return Seats;
    }

    public void setSeats(List<Integer> seats) {
        Seats = seats;
    }
}
