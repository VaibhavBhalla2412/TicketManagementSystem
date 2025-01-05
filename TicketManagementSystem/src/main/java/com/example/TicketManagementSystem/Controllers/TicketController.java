package com.example.TicketManagementSystem.Controllers;

import com.example.TicketManagementSystem.DatabaseAccess.TicketRepository;
import com.example.TicketManagementSystem.DbClasses.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/addTicket")
public class TicketController {

    @Autowired
    TicketRepository ticketRepository;

    @PostMapping("/addBooking")
    public void addbooking(){
//        Ticket ticket = new Ticket();
//        ticket.setUserName("vaibhav");
//        ticket.setDateOfShow(LocalDateTime.now());
//        ticketRepository.save(ticket);
    }

}
