package org.example.Tickets;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        tickets.add(new StandardTicket(144, "Anora", 2000));
        tickets.add(new VIPTicket(174, "Sonik3", 6000, 20));
        tickets.add(new DiscountTicket(251, "BBB", 2200, 0.2));

        for (Ticket ticket : tickets) {
            System.out.println("TicketId = " + ticket.getTicketId());
            System.out.println("Ticket movie title = " + ticket.getMovieTitle());
            System.out.println("Ticket price = " + ticket.calculateFinalPrice());
            System.out.println("*******");
        }


    }


}
