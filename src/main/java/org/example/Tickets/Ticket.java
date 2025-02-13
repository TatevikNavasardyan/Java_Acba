package org.example.Tickets;

public class Ticket {
    private int ticketId;
    private  String movieTitle;
    private double price;

    public Ticket(int tichetId, String movieTitle, double price) {
        this.ticketId = tichetId;
        this.movieTitle = movieTitle;
        this.price = price;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public double getPrice() {
        return price;
    }
    public double calculateFinalPrice(){
        return this.price;

    };
}
