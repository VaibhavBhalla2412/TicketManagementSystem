package com.example.TicketManagementSystem.DbClasses;

import com.example.TicketManagementSystem.Status;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
public class TicketDetails {

    @EmbeddedId
    private TicketDetailsId ticketDetailsId;

    @OneToOne
    @JoinColumn(name = "ticketId", referencedColumnName = "ticketId", nullable = true)
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private Ticket ticket;

    @Enumerated(EnumType.STRING)
    private Status status;


    public TicketDetailsId getTicketDetailsId() {
        return ticketDetailsId;
    }

    public void setTicketDetailsId(TicketDetailsId ticketDetailsId) {
        this.ticketDetailsId = ticketDetailsId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
