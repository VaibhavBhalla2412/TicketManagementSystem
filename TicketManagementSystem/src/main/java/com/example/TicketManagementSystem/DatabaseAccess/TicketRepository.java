package com.example.TicketManagementSystem.DatabaseAccess;

import com.example.TicketManagementSystem.DbClasses.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
