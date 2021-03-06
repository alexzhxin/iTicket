package iTicket.dao;

import iTicket.entities.DeveloperEntity;
import iTicket.entities.TicketEntity;

import java.util.ArrayList;
import java.util.List;

public interface TicketDao {

    TicketEntity addTicket(TicketEntity ticket);
    List<TicketEntity> getAllTickets();
    List<TicketEntity> getNewTickets();
    List<TicketEntity> getTicketsByStatus(String status);
    TicketEntity getTicketById(int ticket_id);
    TicketEntity deleteTicketById(int ticket_id);
    TicketEntity changeTicketStatus(int ticket_id, String newStatus);
    TicketEntity changeTicketDeveloper(int ticket_id, DeveloperEntity developer);
    TicketEntity editTicket(TicketEntity ticket);

}
