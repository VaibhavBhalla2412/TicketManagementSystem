package com.example.TicketManagementSystem.DbClasses;

import com.example.TicketManagementSystem.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
public class DateToSeats {

    @Id
    private
    LocalDate date;
    private List<Status> seats;
    int totalSeats=60;

    public DateToSeats() {
    }

    DateToSeats(LocalDate date){
        this.setDate(date);
        setSeats(new ArrayList<>(totalSeats));
        for(int i=0;i<totalSeats;i++){
            getSeats().set(i, Status.free);
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Status> getSeats() {
        return seats;
    }

    public void setSeats(List<Status> seats) {
        this.seats = seats;
    }
}
